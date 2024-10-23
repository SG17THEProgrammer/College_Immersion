
// setTimeout(() => {
//     console.log("Image selected");
    
// }, 4000);
// setTimeout(() => {
//     console.log("filter applied");

// }, 6000);
// setTimeout(() => {
//     console.log("caption written ");

// }, 11000);
// setTimeout(() => {
//     console.log("upload successfully");

// }, 14000);


function step1(fn){
    console.log("Please wait selecting an image....  ")
    setTimeout(() => {
        fn("Image selected");
    }, 4000);
}


function step2(image,fn){
    console.log(`Please wait applying filters on ${image}....`)
    setTimeout(() => {
        fn('filter applied');
    }, 2000);

}

function step3(filter,fn){
    console.log(`plz wait writing caption to ${filter}....`)
    setTimeout(() => {
      fn('Caption written')
    }, 5000);
}

function step4(caption){
    console.log(`plz wait uploading image with ${caption}....`)
    setTimeout(() => {
        console.log('image uploaded successfully 👍');
    }, 3000);
}

//pyramid of Doom ---- bekar chiz hai 
//callback hell -- horizontal growing of code 
step1(function(image){
    console.log(image)
    step2(image, function(filter){
        console.log(filter);
        step3(filter,function(caption){
            console.log(caption)
            step4(caption);
        })
    })
})

//solution is promises!!!