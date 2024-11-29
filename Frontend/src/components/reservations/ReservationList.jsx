import React, { useState, useEffect } from 'react';
import axios from 'axios';
import { Link } from 'react-router-dom';

const ReservationList = () => {
  const [reservations, setReservations] = useState([]);
  const [alert, setAlert] = useState({ type: '', message: '' });

  useEffect(() => {
    fetchReservations();
  }, []);

  const fetchReservations = async () => {
    try {
      const response = await axios.get('http://localhost:8082/api/reservations');
      setReservations(response.data);
    } catch (error) {
      setAlert({ type: 'danger', message: 'Error fetching reservations' });
    }
  };

  const handleDelete = async (id) => {
    if (window.confirm('Are you sure you want to delete this reservation?')) {
      try {
        await axios.delete(`http://localhost:8082/api/reservations/${id}`);
        setAlert({ type: 'success', message: 'Reservation deleted successfully' });
        fetchReservations();
      } catch (error) {
        setAlert({ type: 'danger', message: 'Error deleting reservation' });
      }
    }
  };

  const formatDate = (dateString) => {
    return new Date(dateString).toLocaleDateString();
  };

  return (
    <div className="container mt-4">
      <h2>Reservations</h2>
      {alert.message && (
        <div className={`alert alert-${alert.type}`} role="alert">
          {alert.message}
        </div>
      )}
      <Link to="/reservations/create" className="btn btn-primary mb-3">
        Create New Reservation
      </Link>
      <div className="table-responsive">
        <table className="table table-striped">
          <thead>
            <tr>
              <th>ID</th>
              <th>Start Date</th>
              <th>End Date</th>
              <th>Client</th>
              <th>Room</th>
              <th>Room Type</th>
              <th>Preferences</th>
              <th>Actions</th>
            </tr>
          </thead>
          <tbody>
            {reservations.map((reservation) => (
              <tr key={reservation.id}>
                <td>{reservation.id}</td>
                <td>{formatDate(reservation.dateDebut)}</td>
                <td>{formatDate(reservation.dateFin)}</td>
                <td>
                  {reservation.client ? (
                    <>
                      {reservation.client.prenom} {reservation.client.nom}
                      <br />
                      <small className="text-muted">{reservation.client.email}</small>
                    </>
                  ) : (
                    'N/A'
                  )}
                </td>
                <td>
                  {reservation.chambre ? (
                    <>
                      Room #{reservation.chambre.id}
                      <br />
                      <small className="text-muted">
                        Price: ${reservation.chambre.prix}
                      </small>
                    </>
                  ) : (
                    'N/A'
                  )}
                </td>
                <td>
                  {reservation.chambre ? reservation.chambre.type : 'N/A'}
                </td>
                <td>{reservation.preferences || 'None'}</td>
                <td>
                  <Link 
                    to={`/reservations/edit/${reservation.id}`} 
                    className="btn btn-sm btn-info me-2"
                  >
                    Edit
                  </Link>
                  <button
                    onClick={() => handleDelete(reservation.id)}
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

export default ReservationList; 