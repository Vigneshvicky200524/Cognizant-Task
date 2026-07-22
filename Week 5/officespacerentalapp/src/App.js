import './App.css';
import officeImage from './office-room.jpg';   // <-- change this if your filename is different

function App() {

  const officeList = [
    {
      Name: "DBS",
      Rent: 50000,
      Address: "Chennai"
    },
    {
      Name: "Regus",
      Rent: 75000,
      Address: "Bangalore"
    },
    {
      Name: "WeWork",
      Rent: 65000,
      Address: "Hyderabad"
    }
  ];

  return (
    <div style={{ marginLeft: "40px" }}>

      <h1>Office Space, at Affordable Range</h1>

      <img
        src={officeImage}
        alt="Office"
        width="300"
        height="200"
      />

      <br />
      <br />

      {officeList.map((office, index) => (

        <div key={index}>

          <h2>Name: {office.Name}</h2>

          <h3
            style={{
              color: office.Rent < 60000 ? "red" : "green"
            }}
          >
            Rent: Rs. {office.Rent}
          </h3>

          <h3>Address: {office.Address}</h3>

          <hr />

        </div>

      ))}

    </div>
  );
}

export default App;