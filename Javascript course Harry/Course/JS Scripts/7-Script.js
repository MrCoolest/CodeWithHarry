// If Else Conditionals & Switches in JavaScript

console.log('IF Else');

const age = 25;
// if(age<18){
//     console.log(`You're Child`);
// }
// else if(age>50){
//     console.log(`You're Old Man`);
// }
// else{
//     console.log(`You're Adult`);
// }

// const vari = 34;
// if(typeof vari !== 'undefined'){
//     console.log('Yes it is present');;
// }
// else{
//     console.log('Not Present');
// }

let doesDrive = false;
// And Operator &&
// if(doesDrive && age>=18){ //And &&
//     console.log('You can Drive');
// }
// else{
//     console.log('You Cannot Drive')
// }

// OR Operator ||
// if(doesDrive || age>=18){ 
//     console.log('You can Drive');
// }
// else{
//     console.log('You Cannot Drive')
// }

// console.log(age==25? 'Age is 25':'Age is not 25');

// ////////// Switch Case 
switch (age) {
    case 18:
        console.log('You are 18 year old');
        break;
    case 20:
        console.log('You are 20 year old');
        break;
    case 22:
        console.log('You are 22 year old');
        break;
    case 25:
        console.log('You are 25 year old');
        break;
    default:
        console.log('You are to old')
        break;
}