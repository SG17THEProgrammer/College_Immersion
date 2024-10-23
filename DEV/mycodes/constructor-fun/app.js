// constructor => create objects
// function sam(){

// }

// sam() //generic
// new sam() //constructor
// --------------------------

function kuchbhi(name,age,prof){
    this.name = name;
    this.age = age;
    this.profession = prof;

    // this.greet = function(){
    //     console.log(`hello ${this.name}`);
    // }
}

// to implement function in a prototype -- isse memory save ho jaata -- alag alag objects ke liye greet waala function nhi banega 
// by this we do not need that greet function in constructor
kuchbhi.prototype.greet = function(){
    console.log(`hello ${this.name}`);

}
let obj1 = new kuchbhi("sg",2,"student")
// console.log(obj1.__proto__==Object.prototype)//false
console.log(obj1.__proto__==kuchbhi.prototype)//true
console.log(obj1)