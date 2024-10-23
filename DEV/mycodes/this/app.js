// direct calling => window
// function sam(){
//     console.log(this);
// }

// sam();

// ----------
// object calling =>  object in which this method is defined
// let obj = {
//     a: 10,
//     b: 20,
//     c: function(){
//         console.log(this);
//     }
// }

// obj.c() //obj

// -----------------------------

// let obj={
//     a:10,
//     fn:function(){
//         console.log(this)
//     }
// }

// let ans = obj.fn; // yahan tak fn call nhi hoa hai 
// ans() //yeh direct calling ho gyi  -- window ko point karega 



// let obj={
//     a:10,
//     fn:function(){
//         console.log(this) 
//         function b(){
//             console.log(this)
//         }
//         b() //direct calling 
//     }
// }

// obj.fn();


// let obj1={
//     a:20,
//     fn:function(a,b,c){
//         console.log(this,a,b,c)
//     }
// }

// let obj2={
//     a:50
// }

// // obj1.fn.call(obj2,10,20,30)
// // obj1.fn.apply(obj2,[10,20,30])
// // call and apply me diff. is apply me array mein dena padta hai argument baaki dono is used to change reference of object 

// let newFn = obj1.fn.bind(obj2) // yeh copy create krega aur usko phir call krna padega  
//     //arguments mein kuch bhi de skte hai number , string anything 
// newFn();

let obj={
    a:10,
    b:20,
    fn:function(){
    //    arrow function -- iska this is dependent on parent ka this 
        let sam=()=>{
            console.log(this)
        }
        sam() 
    }
}

obj.fn()
