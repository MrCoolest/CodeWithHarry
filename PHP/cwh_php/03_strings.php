<?php

     $str = "This is a String";   
     echo $str. "<br>";
     $lenn = strlen($str);
     echo "The length of the string is:".$lenn."Thank you!";
     echo "The number of word in the string is:".str_word_count($str)."<br>"; 
     echo "The reverse string is:".strrev($str). "<br>";
     echo "The search for word in the String is:".strpos($str, 'is')."<br>";
     echo "The replace for word in the String is:".str_replace('is', 'at', $str)."<br>";

?>