// String: Properties, Methods & Template Literals in javascript

console.log("hello everyone");
const name = 'Ankit';
const wishing = 'Good mornning';
console.log(wishing + ' ' + name);

let html = '<h1> This is Heading </h1>' + '<p> This is Paragraph</p>'

html = html.concat('Heloo This is From Console', ' Understand')

// console.log(html);
// console.log(html.length);
// console.log(html.toLowerCase());
// console.log(html.toUpperCase());
// console.log(html);
// console.log(html[8]);
// console.log(html.indexOf('his'));
// console.log(html.lastIndexOf("T"));
// console.log(html.charAt(52));
// console.log(html.endsWith('stand')); ----------------------------------//Boolen
// console.log(html.includes('stan')); ----------------------------------//Boolen
// console.log(html.substring(6,9));
// console.log(html.slice(0,-8));
// console.log(html.split(' '));
// console.log(html.replace('This', 'It'));


let f1='Orange';
let f2='Apple';
let newhtml =  `Heloo ${name},
            <h1> This heading for practice </h1> <p> This is Paragraph</p> 
            so You're earting ${f1} and ${f2}.
`;

document.body.innerHTML = newhtml;
console.log(newhtml);
