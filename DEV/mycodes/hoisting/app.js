// var a = 10;
// console.log(a)  //hoisting ❌

// // ---------------
// //type-1 -> var -> undefined
// console.log(b) //hoisting ✅
// var b = 10;


// ---------------
//type-2 -> let & const -> error
// console.log(b) //hoisting ✅ => DTZ
// let b = 10;

// -----------------


// var d = 10;
// console.log(d);

// function sam(){
//     console.log("hello")
// }
// sam()
// ------------------

console.log(a) //undef
var a = 100;
        //upar hoisting ho rhi  hai 
if(true){
    console.log(a) // error -- Cannot access 'a' before initialization
    let a = 100;
}
console.log(a) //chalega hi nhi as upar error aa gya 
//js is interpreted 


