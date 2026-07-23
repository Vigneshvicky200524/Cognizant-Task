import "./App.css";
import Header from "./components/Header";
import Footer from "./components/Footer";
import OfficeCard from "./components/OfficeCard";

function App() {

  const offices = [
    {
      id: 1,
      name: "Office Hub Chennai",
      address: "T Nagar, Chennai",
      rent: 25000
    },
    {
      id: 2,
      name: "Business Tower",
      address: "Anna Nagar, Chennai",
      rent: 45000
    },
    {
      id: 3,
      name: "Tech Park",
      address: "OMR, Chennai",
      rent: 60000
    }
  ];

  return (
    <div className="container">

      <Header />

      {offices.map((office) => (
        <OfficeCard
          key={office.id}
          name={office.name}
          address={office.address}
          rent={office.rent}
        />
      ))}

      <Footer />

    </div>
  );
}

export default App;