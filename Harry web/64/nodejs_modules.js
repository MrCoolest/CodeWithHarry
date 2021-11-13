const fs = require('fs');
let text =  fs.readFileSync('delete.txt','utf-8');
text = text.replace("ankit","Ankush");

console.log("The content of the file is");
console.log(text);

new_text = fs.writeFileSync("rohan.txt",text);
console.log("This is new text file");
