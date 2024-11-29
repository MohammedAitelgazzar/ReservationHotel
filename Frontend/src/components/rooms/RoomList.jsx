import React, { useState, useEffect } from 'react';
import axios from 'axios';
import { Link } from 'react-router-dom';

const RoomList = () => {
  const [rooms, setRooms] = useState([]);
  const [alert, setAlert] = useState({ type: '', message: '' });

  useEffect(() => {
    fetchRooms();
  }, []);

  const fetchRooms = async () => {
    try {
      const response = await axios.get('http://localhost:8082/api/chambres');
      setRooms(response.data);
    } catch (error) {
      setAlert({ type: 'danger', message: 'Error fetching rooms' });
    }
  };

  const handleDelete = async (id) => {
    if (window.confirm('Are you sure you want to delete this room?')) {
      try {
        await axios.delete(`http://localhost:8082/api/chambres/${id}`);
        setAlert({ type: 'success', message: 'Room deleted successfully' });
        fetchRooms();
      } catch (error) {
        setAlert({ type: 'danger', message: 'Error deleting room' });
      }
    }
  };

  return (
    <div className="container mt-4">
      <h2>Rooms</h2>
      {alert.message && (
        <div className={`alert alert-${alert.type}`} role="alert">
          {alert.message}
        </div>
      )}
      <Link to="/rooms/create" className="btn btn-primary mb-3">
        Create New Room
      </Link>
      <div className="table-responsive">
        <table className="table table-striped">
          <thead>
            <tr>
              <th>ID</th>
              <th>Price</th>
              <th>Available</th>
              <th>Type</th>
              <th>Actions</th>
            </tr>
          </thead>
          <tbody>
            {rooms.map((room) => (
              <tr key={room.id}>
                <td>{room.id}</td>
                <td>{room.prix}</td>
                <td>{room.disponible ? 'Yes' : 'No'}</td>
                <td>{room.type}</td>
                <td>
                  <Link to={`/rooms/edit/${room.id}`} className="btn btn-sm btn-info me-2">
                    Edit
                  </Link>
                  <button
                    onClick={() => handleDelete(room.id)}
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

export default RoomList; 