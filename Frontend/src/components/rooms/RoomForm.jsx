import React, { useState } from 'react';
import axios from 'axios';
import { useNavigate } from 'react-router-dom';

const RoomForm = () => {
  const navigate = useNavigate();
  const [formData, setFormData] = useState({
    prix: '',
    disponible: false,
    type: 'SIMPLE'
  });
  const [alert, setAlert] = useState({ type: '', message: '' });

  const handleChange = (e) => {
    const { name, value, type, checked } = e.target;
    setFormData({
      ...formData,
      [name]: type === 'checkbox' ? checked : value
    });
  };

  const handleSubmit = async (e) => {
    e.preventDefault();
    try {
      await axios.post('http://localhost:8082/api/chambres', formData);
      setAlert({ type: 'success', message: 'Room created successfully' });
      setTimeout(() => navigate('/rooms'), 2000);
    } catch (error) {
      setAlert({ type: 'danger', message: 'Error creating room' });
    }
  };

  return (
    <div className="container mt-4">
      <h2>Create Room</h2>
      {alert.message && (
        <div className={`alert alert-${alert.type}`} role="alert">
          {alert.message}
        </div>
      )}
      <form onSubmit={handleSubmit}>
        <div className="mb-3">
          <label className="form-label">Price</label>
          <input
            type="number"
            className="form-control"
            name="prix"
            value={formData.prix}
            onChange={handleChange}
            required
          />
        </div>
        <div className="mb-3">
          <label className="form-label">Available</label>
          <input
            type="checkbox"
            className="form-check-input"
            name="disponible"
            checked={formData.disponible}
            onChange={handleChange}
          />
        </div>
        <div className="mb-3">
          <label className="form-label">Type</label>
          <select
            className="form-control"
            name="type"
            value={formData.type}
            onChange={handleChange}
          >
            <option value="SIMPLE">SIMPLE</option>
            <option value="DOUBLE">DOUBLE</option>
          </select>
        </div>
        <button type="submit" className="btn btn-primary">Create Room</button>
      </form>
    </div>
  );
};

export default RoomForm; 