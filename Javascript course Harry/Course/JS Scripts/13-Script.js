// <!-- HTML Element Selectors In JavaScript -->

console.log('Hello Everyone');

/*
Element Selector
1.Single element selector
2.Multi element selector
*/


// 1.Single element selector

let element = document.getElementById('Con1');
// element = element.className
// element = element.childNodes
// element = element.parentNode
// element.style.color = 'Red'
// element.innerText = 'Ankit is Good Guy';
// element.innerHTML = 'Heloooo toh kaise ho aap log?';

// console.log(element.innerHTML);
// console.log(element.innerText);


// // let sel = document.querySelector('#Con1');
// sel = document.querySelector('.child');
// sel = document.querySelector('marquee');
// sel.style.color = 'Green'
// console.log(sel) 


// 2.Multi Selector element 

let elem = document.getElementsByClassName('child');
// elem = document.getElementsByClassName('container');
// console.log(elem[0].getElementsByClassName('child'));

elem = document.getElementsByTagName('div');

//  Array.from(elem).forEach(element => {
//         console.log(element)
//         element.style.color = 'Blue'
//     }
//     );

console.log(elem);