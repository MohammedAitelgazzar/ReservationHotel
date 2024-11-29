import React from 'react';
import { BrowserRouter as Router, Routes, Route, Link } from 'react-router-dom';
import Login from './components/Login';
import Register from './components/Register';
import ReservationList from './components/reservations/ReservationList';
import ReservationForm from './components/reservations/ReservationForm';
import EditReservation from './components/reservations/EditReservation';
import RoomList from './components/rooms/RoomList';
import RoomForm from './components/rooms/RoomForm';
import EditRoom from './components/rooms/EditRoom';
import ClientList from './components/clients/ClientList';
import ClientForm from './components/clients/ClientForm';
import EditClient from './components/clients/EditClient';

function App() {
  return (
    <Router>
      <div>
        <nav className="navbar navbar-expand-lg navbar-light bg-light">
          <div className="container">
            <div className="navbar-nav">
              <Link className="nav-link" to="/login">Login</Link>
              <Link className="nav-link" to="/register">Register</Link>
              <Link className="nav-link" to="/reservations">Reservations</Link>
              <Link className="nav-link" to="/rooms">Rooms</Link>
              <Link className="nav-link" to="/clients">Clients</Link>
            </div>
          </div>
        </nav>

        <Routes>
          <Route path="/login" element={<Login />} />
          <Route path="/register" element={<Register />} />
          <Route path="/reservations" element={<ReservationList />} />
          <Route path="/reservations/create" element={<ReservationForm />} />
          <Route path="/reservations/edit/:id" element={<EditReservation />} />
          <Route path="/rooms" element={<RoomList />} />
          <Route path="/rooms/create" element={<RoomForm />} />
          <Route path="/rooms/edit/:id" element={<EditRoom />} />
          <Route path="/clients" element={<ClientList />} />
          <Route path="/clients/create" element={<ClientForm />} />
          <Route path="/clients/edit/:id" element={<EditClient />} />
        </Routes>
      </div>
    </Router>
  );
}

export default App;
