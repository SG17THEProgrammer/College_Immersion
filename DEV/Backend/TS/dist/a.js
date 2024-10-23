"use strict";
// inference -- when the type is already/automatically understood/defined by typescript
// we try ki yeh na ho 
let a = 10;
// a="sg"  // not possible
// better way to do it 
let b = 100;
b = 1000;
let c = "shray";
c = "gupta";
// tuples
let tuple = ["shray", "gupta", 100];
let arr = [10, 20, 30];
let arr1 = ["10", "20", "30"];
// type "any" kabhi nhi dena chahiye 
// type "unknown" de skte hai wo tolerable hai 
function sg(a, b) {
    console.log(a, b);
    return a + b;
}
sg(10, 20);
function shray() {
    console.log("I'm Shray");
    return true;
}
function d(fn) {
    console.log("I'm b ");
    return "ok";
}
d(shray);
