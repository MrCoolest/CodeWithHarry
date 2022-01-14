<?php

     $submit = false;

     // db connection
     $server = "localhost";
     $username = "root";
     $password = "";

     $con = mysqli_connect($server, $username, $password);
     
     // checking connection
     if(!$con){
          die("Connection to this database Failed Due to".mysqli_connect_error());
     }
     // echo "Success Connecting to the db";


     // inserting the Data
     if ($_SERVER['REQUEST_METHOD'] === 'POST'){
     $name = $_POST['name'];
     $age = $_POST['gender'];
     $gender = $_POST['age'];
     $email = $_POST['email'];
     $phone = $_POST['phone'];
     $msg = $_POST['desc'];
     $sql = "INSERT INTO `us_trip`.`trip` (`name`, `age`, `gender`, `email`, `phone_no`, `message`, `date_time`) VALUES ('$name', '$age', '$gender', '$email', '$phone', '$msg', current_timestamp());"; 
     echo $sql;

     if($con -> query($sql)){
          // echo "Successfully";

          // flag for submiting data
          $submit = true; 
     }
     else{
          echo "Error : $sql <br> $con->error";
     }

     // Close the database conection
        $con->close();  
     }



?>




<!DOCTYPE html>
<html lang="en">
<head>
     <meta charset="UTF-8">
     <meta http-equiv="X-UA-Compatible" content="IE=edge">
     <meta name="viewport" content="width=device-width, initial-scale=1.0">
     <link rel="stylesheet" href="./style.css">

     <!-- fonts -->
     <link rel="preconnect" href="https://fonts.googleapis.com">
     <link rel="preconnect" href="https://fonts.gstatic.com" crossorigin>
     <link href="https://fonts.googleapis.com/css2?family=Roboto:ital,wght@0,100;0,300;0,400;1,100;1,300&display=swap" rel="stylesheet">


     <script src="./script.js" defer></script>
     <title>Welcome TO Travel Website</title>
</head>
<body>
     <div class="container">
          <h1>Welcome to IIT Kharagpur US Trip Form</h1>
          <p>Enter you Detail to Confirm your Participation in the Trip</p>

          <?php

          if($submit){
          echo "<p class=
          submitMsg'>Thanks for Submit</p>";
          }

          ?>

          <form action="index.php" method="post">
               <input type="text" name="name" id="name" placeholder="Enter your name">
               <input type="text" name="age" id="age" placeholder="Enter your Age">
               <input type="text" name="gender" id="gender" placeholder="Enter your gender">
              
               <input type="email" name="email" id="email" placeholder="Enter your email">
               <input type="tel" name="phone" id="phone" placeholder="Enter your phone">
               <textarea name="desc" id="desc" cols="30" rows="10" placeholder="Enter message"></textarea>

               <button class="btn">Submit</button>
               <button class="btn">Reset</button>
               
          </form>

     </div>
</body>
</html>
