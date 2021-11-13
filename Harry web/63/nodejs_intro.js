// console.log("Hello World!");
const http = require('http');

const hostname = '127.0.0.1';
const port = 3000;

const server = http.createServer((req, res) => {
  res.statusCode = 200;
  res.setHeader('Content-Type', 'text/html');
//   res.end('Hello World this is Ankit Patwa');
  res.end(`<!DOCTYPE html>
  <html lang="en">
  <head>
      <meta charset="UTF-8">
      <meta name="viewport" content="width=device-width, initial-scale=1.0">
      <link rel="stylesheet" href="./Style.css">
      <title>Payment</title>
  </head>
  <body>
  
      
      <div class="container">
          <h1 class="heading">Payment Form</h1>
      <form action="">
          <h2>User Detail</h2>
  
          <p>Name : <input type="text" name="First" id="" placeholder="Enter your name" required></p>      
          <fieldset>
              <legend>Gender</legend>
          <p>
              <input type="radio" name="Gender" id="" required> Female <br> 
              <input type="radio" name="Gender" id="" required> Male <br>
              <input type="radio" name="Gender" id="" required> Other <br>
          </p>  
      </fieldset>
      <p>Address : <br>
          <textarea name="addres" id="addres" cols="50" rows="10"  placeholder="Enter your Address" required></textarea>
      </p>
      <p>Email :
          <input type="email" name="email" id="" placeholder="Enter your E-mail" required>
      </p>
      <p>Pincode :
          <input type="number" name="pincode" id="" placeholder="Enter the Pincode" required>
      </p>
  
      <h2>Payment Information</h2>
      <p>
          Card type:
          <select name="Card_type" id="" required>
              <option value="">--Select Card type</option>
              <option value="visa">Visa</option>
              <option value="MasterCard">Master Card</option>
              <option value="Rupee">Rupee</option>
          </select>
  
          <p>Card Number :
              <input type="number" name="Card_number" id="" required>
          </p>
          <p>
              Card Exp Date:
              <input type="date" name="exp" id="" required> 
          </p>
          <p>CVV
              <input type="password" name="cvv" id="">
          </p>
          <p><input type="submit" value="Pay now"></p>
      </p>
      </form>
      </div>
  </body>
  </html>`);
});

server.listen(port, hostname, () => {
  console.log(`Server running at http://${hostname}:${port}/`);
});