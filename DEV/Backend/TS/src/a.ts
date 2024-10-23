// inference -- when the type is already/automatically understood/defined by typescript
// we try ki yeh na ho 
let a = 10 
// a="sg"  // not possible


// better way to do it 
let b:number = 100
b=1000

let c:String = "shray"
c="gupta"


// tuples
let tuple:[string, string, number] = ["shray", "gupta",100]

let  arr:number[] = [10,20,30]
let  arr1:string[] = ["10","20","30"]


// type "any" kabhi nhi dena chahiye 
// type "unknown" de skte hai wo tolerable hai 

// function sg (a:number, b:number) :number{
//     console.log(a,b)
//     return a+b
// }
// sg(10,20)


function shray (){
    console.log("I'm Shray")
    return true
}

function d (fn:()=>boolean):string{
    console.log("I'm b ")
    return "ok"
}

d(shray)



