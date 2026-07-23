import "./App.css";

function App() {
  return (
    <div className="container">
      <h1>Workspace Connect</h1>
      <h2>Office Rental Management</h2>

      <div className="card">
        <h3>Office Name : Business Tower</h3>
        <p>Location : Chennai</p>
        <p>Rent : ₹25,000</p>
        <button>Book Now</button>
      </div>

      <div className="card">
        <h3>Office Name : Tech Park</h3>
        <p>Location : OMR</p>
        <p>Rent : ₹45,000</p>
        <button>Book Now</button>
      </div>
    </div>
  );
}

export default App;