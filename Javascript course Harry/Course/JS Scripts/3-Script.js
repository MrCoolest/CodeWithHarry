// Primitive Data Type

// String
var name = "Ankit";
console.log("My Name is " + name);
console.log("Data Type is " + (typeof name));

// Numbers
let marks = 65;
console.log("Data Type is " + (typeof marks));

// Boolean
let adult = true;
console.log("Data Type is adult" + (typeof adult));

// Null
let nullvalue = null;
console.log("Data Type is " + (typeof nullvalue));

let undef;
console.log("Data Type is " + (typeof undef));

// Refrence Data type

// Arrays
let myarr = [12,34,56,77,88, false, "ankit"];
console.log("Data Type is " + (typeof myarr));


// Objext literal
let age ={
    Ankit: 19,
    Yash: 20,
    Anuraag : 21,
    Dinesh : 22
};
console.log("Data Type is " + (typeof age));

// Functions
function Find() {
    
};
console.log("Data Type is " + (typeof Find));


// Date
let date = new Date();
console.log("Data Type is " + (typeof date));
console.log(date)