import React, { useState } from 'react'
import Sg from './Sg';

const Naam = ({name}) => {

    const [naam , setName] = useState(name);
    const [value , setvalue] = useState(0);
    const changeName=()=>{
        //batching
        setName("anonymous") // doesn't hold previous value 
        // setName("sam")
        // setName((naam)=>"anonymous"+"changed") //yeh previous value rakhta hai 
        // setName((naam)=>"sam"+"changed")
    }
    const changeValue=()=>{
      setvalue(Math.floor(Math.random()*10)) 
    }
  return (
    <div>
           <Sg value={value} setvalue={setvalue}></Sg>
 <br />
        {/* <button onClick={changeName}>badlenge samay</button> */}
        <button onClick={changeValue}>Value change</button>

    </div>
  )
}   

export default Naam