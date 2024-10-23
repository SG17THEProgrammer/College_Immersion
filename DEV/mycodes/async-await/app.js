// function wait(message, delay) {
//     return new Promise((resolve) => {
//         console.log(message);
//         setTimeout(resolve, delay);
//     });
// }

// async function processImage() {
//     try {
//         await wait("Plz wait selecting image....", 4000);
//         console.log("image selected");

//         await wait("Plz wait applying filter to image....", 2000);
//         console.log("image filtered");

//         await wait("Plz wait writing captcha....", 5000);
//         console.log("captcha written");

//         await wait("Plz wait uploading image....", 2000);
//         console.log("image uploaded");
//     } catch (error) {
//         console.error("An error occurred:", error);
//     }
// }

// processImage();


// async function sam (){
//     console.log("sam");
//     let data = await fetch("https://api.tvmaze.com/search/shows?q=girls")
//     // console.log(data)   -- isme pahali baar mein bss meta data aayega  
//     let response = await data.json();  //isse pooora data aa jayega 
//     console.log(response) 
// }
// // await aage nhi jaane deta ussi particular  block mein 

// function sam1(){
//     console.log("a")
//     console.log("b")
// }

// sam();
// sam1()



// axios mein pahale promise hi aa jaayega saara data
async function sam2(){
let data = await axios.get("https://api.tvmaze.com/search/shows?q=girls")
console.log(data)
}

sam2()





