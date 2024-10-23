const express = require('express');
let app = express();
let zod = require('zod');


let schema = zod.array(zod.number())

let schema2 = zod.object({
    email:zod.string().email(),
    password : zod.string().min(8),
    name:zod.string().min(3),
    country:zod.literal('IN').or(zod.literal('US')),
})

app.use(express.json())

app.post('/api',(req,res)=>{
    let response = schema.safeParse(req.body.worldcup)
    if(response.success){
        res.status(200).json(response.data)
    }else{
        res.status(404).json({msg:"Invalid"})
    }


})

app.post('/auth',(req,res)=>{
    let response = schema2.safeParse(req.body.auth)
    if(response.success){
        res.status(200).json(response.data)
    }else{
        res.status(404).json({msg:"Invalid"})
    }


})

app.listen(8080,(req,res)=>{
    console.log(`Server running at 8080`)
});