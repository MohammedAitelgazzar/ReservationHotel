import React, { useState, useEffect } from 'react';
import axios from 'axios';
import { useNavigate, useParams } from 'react-router-dom';

const EditReservation = () => {
  const { id } = useParams();
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
    fetchReservation();
    fetchClients();
    fetchRooms();
  }, []);

  const fetchReservation = async () => {
    try {
      const response = await axios.get(`http://localhost:8082/api/reservations/${id}`);
      const reservation = response.data;
      setFormData({
        dateDebut: formatDateForInput(reservation.dateDebut),
        dateFin: formatDateForInput(reservation.dateFin),
        preferences: reservation.preferences,
        client: { id: reservation.client.id },
        chambre: { id: reservation.chambre.id }
      });
    } catch (error) {
      setAlert({ type: 'danger', message: 'Error fetching reservation' });
    }
  };

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

  const formatDateForInput = (dateString) => {
    return new Date(dateString).toISOString().split('T')[0];
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
      await axios.put(`http://localhost:8082/api/reservations/${id}`, formData);
      setAlert({ type: 'success', message: 'Reservation updated successfully' });
      setTimeout(() => navigate('/reservations'), 2000);
    } catch (error) {
      setAlert({ type: 'danger', message: 'Error updating reservation' });
    }
  };

  return (
    <div className="container mt-4">
      <h2>Edit Reservation</h2>
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
            value={formData.preferences || ''}
            onChange={handleChange}
          />
        </div>
        <div className="mb-3">
          <button type="submit" className="btn btn-primary me-2">Update Reservation</button>
          <button 
            type="button" 
            className="btn btn-secondary"
            onClick={() => navigate('/reservations')}
          >
            Cancel
          </button>
        </div>
      </form>
    </div>
  );
};

export default EditReservation; 