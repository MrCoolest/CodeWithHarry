// For, While & Do while Loops in JavaScript

console.log('Hello Everyone');


// General Loops : for, while and do-while 

// ------for loop --------

/* for(let i=1;i<10;i++){
    console.log(i);
}*/

//-------- While loop------

/*let j = 0;
while(j<10){
    console.log(j);
    j+=1;
}*/

//------Do-while---

// let k = 0;
// do{
//     console.log(k);
//     k-=1;
// }while(k>=-10)


// ------break-------

// let k = 0;
// do{
//     console.log(k);
//     if(k===5){
//         break;
//     }
//     k+=1;
// }while(k<=10)


//---------Continue------
// let k = 0;
// do{
//     if(k===5){
//         k+=1;
//         continue;
//     }
//     console.log(k);
//     k+=1;
// }while(k<=10)


// --------Array loop-----
let arr = [2,4,6,677,8,6,5,5,8]



arr.forEach(function(i,j,k){
    console.log(i,j,k);
});

// for(let i=0; i<arr.length;i++){
//     const k = arr[i];
//     console.log(k);
// }


// -------Object loop ------


let obj = {
    name : 'Ankit',
    age : 19,
    marks : [20,19,10,18,19],
    pass : true
}

// for(let key in obj){
//     // console.log(obj[key]);
//     console.log(`The ${key} of object is ${obj[key]}`);
//     // console.log(key)
// }