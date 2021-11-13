// Synchronous or blocking
// line by line executon 

// ASynchronous or Non - blocking
// line by line execution not garanted

const fs = require('fs');
fs.readFile('delete.txt','utf-8',(err,data) => {
    console.log(err,data)
});

console.log("This is a message");