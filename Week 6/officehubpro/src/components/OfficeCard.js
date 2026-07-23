function OfficeCard(props) {

  const { name, address, rent } = props;

  return (
    <div className="card">
      <h2>{name}</h2>

      <p>
        <b>Address:</b> {address}
      </p>

      <p className={rent <= 30000 ? "green" : "red"}>
        <b>Rent:</b> ₹{rent}
      </p>

      <button>Book Office</button>
    </div>
  );
}

export default OfficeCard;