// Type Conversion 
console.log('My name is Ankit');
let myvar;
myvar = String(35);
console.log(myvar, (typeof myvar));
let Cooking = String(true);
console.log(Cooking, (typeof Cooking));

let date = String(new Date());
console.log(date, (typeof date));

let arr1 = String([1,2,3,4,5]);
console.log(arr1.length ,(typeof arr1));

let i = 6578;
console.log(i.toString());

let str1 = Number("8515");
console.log(str1, (typeof str1));

let str2 = Number(false);
console.log(str2, (typeof str2));

let num = parseInt("546.7");
console.log(num, (typeof num));

let num1 = parseFloat("546.678");
console.log(num1.toFixed(9), (typeof num1));

// Type coercion
let a = "789";
let b = 77;
console.log(a + b);

