// let obj = {}

// properties -> key : value
//methods -> func
let obj = {
    a:10,
    sam:function(){
        console.log("hi guyz")
    }
}

// console.log(obj.a)
// console.log(obj.a())
// console.log(obj.b) //undef
// console.log(obj.b()) //error
// console.log(obj.c)// undef
// console.log(obj.c())// error
// console.log(obj.toString) 
// console.log(obj.toString()) //obj

console.log(obj.__proto__ === Object.prototype)

// let arr = [10,20,30]


let str = 'sam'