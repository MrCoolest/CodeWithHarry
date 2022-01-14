<!DOCTYPE html>
<html lang="en">
<head>
     <meta charset="UTF-8">
     <meta http-equiv="X-UA-Compatible" content="IE=edge">
     <meta name="viewport" content="width=device-width, initial-scale=1.0">
     <title>Learning PHP With CWH</title>
</head>
<body>
     <div class="contianer">
          This is my First Php Website
     <?php

     define("PI", 3.14);


     echo "<br>";

          echo "HEloo World in PHP";
          echo "<br>";

          // This is a Single Line Commant
          /*

          This is A
          MultiLine Commant

          */
     $item1 = 34;
     $item2 = 40;

     echo $item1;
     echo $item2;
     echo "<br>";

     echo $item1 + $item2    ;


     // Operators in PHP
     // 1) Arithmetic Operators 
     echo "The Value of item1 + item2 is ";
     echo $item1 + $item2;
     echo "<br>";
     echo "The Value of item1 - item2 is ";
     echo $item1 - $item2;
     echo "<br>";
     echo "The Value of item1 * item2 is ";
     echo $item1 * $item2;
     echo "<br>";
     echo "The Value of item1 / item2 is ";
     echo $item1 / $item2;
     echo "<br>";


     // 2) Assigment Operators
     $new_var = $item1;
     echo $new_var;
     echo "<br>";
     $new_var += 4;
     echo $new_var;
     echo "<br>";
     $new_var -= 4;
     echo $new_var;
     echo "<br>";
     $new_var *= 4;
     echo $new_var;
     echo "<br>";
     $new_var /= 4;
     echo $new_var;
     echo "<br>";


     // 2) Comparison Operators
     echo "<h1> Comparison Operators </h1>";

     echo "The Value of 1==4 is :";
     echo var_dump(1==4);
     echo "<br>";
     echo "The Value of 1!=4 is :";
     echo var_dump(1!=4);
     echo "<br>";
     echo "The Value of 1>=4 is :";
     echo var_dump(1>=4);
     echo "<br>";
     echo "The Value of 1<=4 is :";
     echo var_dump(1<=4);
     echo "<br>";

     // 2) Increment/Decrement Operators
     echo $item1++;
     echo "<br>";

     echo $item1--;
     echo "<br>";

     echo ++$item1;
     echo "<br>";

     echo --$item1;
     echo "<br>";


     // 2) Logical Operators
     // and (&&)
     // or (||)
     // xor
     // not (!)
     // $myVar = (true and true);
     // echo var_dump($myVar);
     // $myVar = (false and true);
     // echo var_dump($myVar);
     // $myVar = (false and false);
     // echo var_dump($myVar);


     // $myVar = (false or true);
     // echo var_dump($myVar);
     // $myVar = (false or false);
     // echo var_dump($myVar);
     // $myVar = (true or true);
     // echo var_dump($myVar);

     // $myVar = (false xor true);
     // echo var_dump($myVar);
     // $myVar = (false xor false);
     // echo var_dump($myVar);
     // $myVar = (true xor true);
     // echo var_dump($myVar);
     
     $myVar = (!true);
     echo var_dump($myVar);
     $myVar = (!false);
     echo var_dump($myVar);
     echo "<br>"

     ?>

   
     <?php
     // Data Types in PHP
     // 1) String
          $var = "This is a String";
          echo var_dump($var);
     // 2) Integer
          echo "<br>";
          $var = 6;
          echo var_dump($var);
     // 3) Float
          echo "<br>";
          $var = 6.5;
          echo var_dump($var);
     // 4) Boolean
          echo "<br>";
          $var = true;
          echo var_dump($var);
     // 5) Array
     // 6) Object

     // constatint value
     echo PI;

     ?> 
     </div>
</body>
</html>