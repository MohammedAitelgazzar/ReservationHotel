import React, { useState, useEffect } from 'react';
import axios from 'axios';
import { Link } from 'react-router-dom';

const ClientList = () => {
  const [clients, setClients] = useState([]);
  const [alert, setAlert] = useState({ type: '', message: '' });

  useEffect(() => {
    fetchClients();
  }, []);

  const fetchClients = async () => {
    try {
      const response = await axios.get('http://localhost:8082/api/clients');
      setClients(response.data);
    } catch (error) {
      setAlert({ type: 'danger', message: 'Error fetching clients' });
    }
  };

  const handleDelete = async (id) => {
    if (window.confirm('Are you sure you want to delete this client?')) {
      try {
        await axios.delete(`http://localhost:8082/api/clients/${id}`);
        setAlert({ type: 'success', message: 'Client deleted successfully' });
        fetchClients();
      } catch (error) {
        setAlert({ type: 'danger', message: 'Error deleting client. Check if client has reservations.' });
      }
    }
  };

  return (
    <div className="container mt-4">
      <h2>Clients</h2>
      {alert.message && (
        <div className={`alert alert-${alert.type}`} role="alert">
          {alert.message}
        </div>
      )}
      <Link to="/clients/create" className="btn btn-primary mb-3">
        Create New Client
      </Link>
      <div className="table-responsive">
        <table className="table table-striped">
          <thead>
            <tr>
              <th>First Name</th>
              <th>Last Name</th>
              <th>Email</th>
              <th>Phone</th>
              <th>Reservations</th>
              <th>Actions</th>
            </tr>
          </thead>
          <tbody>
            {clients.map((client) => (
              <tr key={client.id}>
                <td>{client.prenom}</td>
                <td>{client.nom}</td>
                <td>{client.email}</td>
                <td>{client.telephone}</td>
                <td>{client.reservations?.length || 0}</td>
                <td>
                  <Link to={`/clients/edit/${client.id}`} className="btn btn-sm btn-info me-2">
                    Edit
                  </Link>
                  <button
                    onClick={() => handleDelete(client.id)}
                    className="btn btn-sm btn-danger"
                  >
                    Delete
                  </button>
                </td>
              </tr>
            ))}
          </tbody>
        </table>
      </div>
    </div>
  );
};

export default ClientList; 