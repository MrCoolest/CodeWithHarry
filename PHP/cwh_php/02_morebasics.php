<!DOCTYPE html>
<html lang="en">
<head>
     <meta charset="UTF-8">
     <meta http-equiv="X-UA-Compatible" content="IE=edge">
     <meta name="viewport" content="width=device-width, initial-scale=1.0">
     <title>PHP </title>
</head>
<style>
     *{
          margin:0;
          padding :0;
          box-sizing:border-box;
     }
     .container{
          max-width :80%;
          background-color: grey;
          margin : auto;
          padding: 23px;
     }
</style>
<body>
     <div class="container">
          <h1>Lets learn the PHP</h1>
          <!-- this is container -->
          <br>
          <?php
          
          $age = 3;
          if ($age>18){
               echo "You can go to Party!";
          }
          else if ($age == 8){
               echo "You do your HomeWork!";
          }
          else if ($age == 3){
               echo "You have be smart first!";
          }
          else{
               echo "You cannot go to Party!";

          }

          // Arrays in PHP
          $languages = array("Python", "C++", "Php", "NodeJs");
          // echo $languages[3];  
          // echo count($languages);  

          // Loops In PHP
          // $a = 0;
          // while($a <= 10) {
          //      echo "The Value of a is :";
          //      echo $a;
          //      $a++;
          //      echo "<br>";
          // }

          // Iterating Loops in PHP using while loop
          // $a = 0;
          // while ($a < count($languages)){
          //      echo "<br> The Languages i know is :".$languages[$a];
          //      $a++;
          // }
          
          // DO While
          // $a = 40;
          // do{
          //      echo "The Value of a is :";
          //      echo $a;
          //      $a++;
          //      echo "<br>";
          // }while ($a < 10);

          // for ($a=0; $a < 10 ; $a++) { 
          //      echo "<br> THE VALUE OF a IS :".$a;
          // }

          foreach($languages as $value){
               echo "<br> The the value is :".$value;
          }

          function print5(){
               echo "FIVE";
          }
          print5();
          print5();

          function print_number($num){
               echo "<br> Your Number is :".$num;
          }

          print_number(55);
          print_number(4);
          
          ?>


     </div>
</body>
</html>