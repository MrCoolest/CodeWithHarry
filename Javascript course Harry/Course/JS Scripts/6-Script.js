// Arrays and Objects In Javascript

console.log("Hello Everyone");

let marks = [10,22,33,43,55,4,5,66,33];
const fruits = ['Orange', 'Apple','Banana'];
const mixed = ['Ankit', 19 [23,66]];

const arr1 = new Array(12,45.47,8,'Ankit');
console.log(marks);
// console.log(fruits);
// console.log(mixed[0]);
// console.log(arr1);
// console.log(marks.length);
// console.log(arr1.length);

// console.log(Array.isArray(mixed));   //----------------------------------//Boolen

arr1[0] = 'Coolest';
// console.log(arr1);

let arr0 = arr1[0];
// console.log(arr0)

let val = marks.indexOf(33);
// console.log(val);



// mutating or modifing in arrys

// marks.push(22);
// marks.unshift(345);
// marks.pop();
// marks.shift();
// marks.splice(3,6);
// marks.reverse();

let marks2 = [4,5,7,8,9];
marks = marks.concat(marks2) 
console.log(marks);

let myobj = {
    name : 'Ankit',
    adult : true,
    marrks : [43,5,7,8,8],
    'youre age' : 19
};
console.log(myobj);
console.log(myobj.name);
console.log(myobj['youre age']);
// console.table(myobj);






