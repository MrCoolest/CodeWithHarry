// Functions in JavaScript

console.log('Hello Everyone');


// ----------1st Syntax-------

// function Wishing(name, thank='Thanks a lot'){
//     let wis = `Wish You Very Happy Birthday ${name}, ${thank} `;
//     // console.log(`Wish You Very Happy Birthday ${name}, ${thank} `);

//     return wis;
// }

// --------2nd Syntax--------
const wishing = function(name, thank='Thanks a lot'){
    let wis = `Wish You Very Happy Birthday ${name}, ${thank} `;
    // console.log(`Wish You Very Happy Birthday ${name}, ${thank} `);

    return wis;
}

let naam = "Ankit";

// console.log(wishing(naam));

// let val = wishing(naam);
// console.log(val);

// ------Object----------

// let myobj = {
//     name : 'Ankit',
//     age : 19,
//     year : 2001,
//     friends : ['Anuraag', 'Parth', 'Yash', 'Dinesh'],
//     game : function(){
//         return 'GTA San Anddres'
//     }
// }

// console.log(myobj.game());


// let arr = ['Ankit', 'Yash','Parth', 'Dinesh', 'Anuraa'];

// arr.forEach(function(element, index,arry){
//     console.log(element, index, arry)
    
// });


let i = 345


function hello(a,b) {

    i = 9
    console.log(i)
    return a+b
    
}


console.log(hello(2,6),i)

