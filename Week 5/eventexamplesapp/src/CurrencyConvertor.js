import React, { useState } from "react";

function CurrencyConvertor() {

  const [rupees, setRupees] = useState("");
  const [euro, setEuro] = useState("");

  function handleSubmit(e) {

    e.preventDefault();

    const value = parseFloat(rupees);

    if (!isNaN(value)) {

      const converted = (value / 90).toFixed(2);

      setEuro(converted);

      alert("Converting to Euro Amount is " + converted);

    }

  }

  return (

    <div>

      <h1 style={{ color: "green" }}>
        Currency Convertor!!!
      </h1>

      <form onSubmit={handleSubmit}>

        <label>Amount</label>

        <br />

        <input
          type="number"
          value={rupees}
          onChange={(e) => setRupees(e.target.value)}
        />

        <br /><br />

        <label>Currency</label>

        <br />

        <input
          type="text"
          value={euro}
          readOnly
        />

        <br /><br />

        <button type="submit">
          Submit
        </button>

      </form>

    </div>

  );

}

export default CurrencyConvertor;