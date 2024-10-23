// let obj = new Promise (function(resolve,reject){
//     let data = "chocolate"
//     let err ="htt nhi dunga"
//     // resolve(data)
//     reject(err)
// }) 

// //agar resolve hoa toh "then" me jaayega 
// // agar resolve nhi  hoa toh "catch" me jaayega
// obj
// .then(function(data){
//     console.log("resloved " + data)
// })
// .catch(function(err){
//     console.log("rejected " + err)
// })


//Instagram problem by Promises

// function wait(message, delay) {
//     return new Promise((resolve) => {
//         console.log(message);
//         setTimeout(resolve, delay);
//     });
// }

// wait("Plz wait selecting image....", 4000)
//     .then(() => {
//         console.log("image selected");
//         return wait("Plz wait applying filter to image....", 2000);
//     })
//     .then(() => {
//         console.log("image filtered");
//         return wait("Plz wait writing captcha....", 5000);
//     })
//     .then(() => {
//         console.log("captcha written");
//         return wait("Plz wait uploading image....", 2000);
//     })
//     .then(() => {
//         console.log("image uploaded");
//     })
//     .catch((error) => {
//         console.error("An error occurred:", error);
//     });


function sam(){
    console.log("sam1")
    fetch("https://api.tvmaze.com/search/shows?q=girls")
    .then((data) => {
        return data.json()
    })
    .then((response) => {
        console.log(response)
    })
}

sam()