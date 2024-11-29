import React, { useState, useEffect } from 'react';
import axios from 'axios';
import { useNavigate } from 'react-router-dom';

const ReservationForm = () => {
  const navigate = useNavigate();
  const [formData, setFormData] = useState({
    dateDebut: '',
    dateFin: '',
    preferences: '',
    client: { id: '' },
    chambre: { id: '' }
  });
  const [clients, setClients] = useState([]);
  const [rooms, setRooms] = useState([]);
  const [alert, setAlert] = useState({ type: '', message: '' });

  useEffect(() => {
    fetchClients();
    fetchRooms();
  }, []);

  const fetchClients = async () => {
    try {
      const response = await axios.get('http://localhost:8082/api/clients');
      setClients(response.data);
    } catch (error) {
      console.error('Error fetching clients:', error);
    }
  };

  const fetchRooms = async () => {
    try {
      const response = await axios.get('http://localhost:8082/api/chambres');
      setRooms(response.data);
    } catch (error) {
      console.error('Error fetching rooms:', error);
    }
  };

  const handleChange = (e) => {
    const { name, value } = e.target;
    if (name === 'clientId') {
      setFormData({ ...formData, client: { id: value } });
    } else if (name === 'chambreId') {
      setFormData({ ...formData, chambre: { id: value } });
    } else {
      setFormData({ ...formData, [name]: value });
    }
  };

  const handleSubmit = async (e) => {
    e.preventDefault();
    try {
      await axios.post('http://localhost:8082/api/reservations', formData);
      setAlert({ type: 'success', message: 'Reservation created successfully' });
      setTimeout(() => navigate('/reservations'), 2000);
    } catch (error) {
      setAlert({ type: 'danger', message: 'Error creating reservation' });
    }
  };

  return (
    <div className="container mt-4">
      <h2>Create Reservation</h2>
      {alert.message && (
        <div className={`alert alert-${alert.type}`} role="alert">
          {alert.message}
        </div>
      )}
      <form onSubmit={handleSubmit}>
        <div className="mb-3">
          <label className="form-label">Client</label>
          <select
            className="form-control"
            name="clientId"
            value={formData.client.id}
            onChange={handleChange}
            required
          >
            <option value="">Select a client</option>
            {clients.map(client => (
              <option key={client.id} value={client.id}>
                {client.prenom} {client.nom} - {client.email}
              </option>
            ))}
          </select>
        </div>
        <div className="mb-3">
          <label className="form-label">Room</label>
          <select
            className="form-control"
            name="chambreId"
            value={formData.chambre.id}
            onChange={handleChange}
            required
          >
            <option value="">Select a room</option>
            {rooms.map(room => (
              <option key={room.id} value={room.id}>
                Room #{room.id} - {room.type} - ${room.prix}
              </option>
            ))}
          </select>
        </div>
        <div className="mb-3">
          <label className="form-label">Start Date</label>
          <input
            type="date"
            className="form-control"
            name="dateDebut"
            value={formData.dateDebut}
            onChange={handleChange}
            required
          />
        </div>
        <div className="mb-3">
          <label className="form-label">End Date</label>
          <input
            type="date"
            className="form-control"
            name="dateFin"
            value={formData.dateFin}
            onChange={handleChange}
            required
          />
        </div>
        <div className="mb-3">
          <label className="form-label">Preferences</label>
          <textarea
            className="form-control"
            name="preferences"
            value={formData.preferences}
            onChange={handleChange}
          />
        </div>
        <button type="submit" className="btn btn-primary">Create Reservation</button>
      </form>
    </div>
  );
};

export default ReservationForm; 