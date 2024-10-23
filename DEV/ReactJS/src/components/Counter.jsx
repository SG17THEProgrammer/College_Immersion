import React, { useState } from 'react'

const Counter = () => {
    const [counter , setCounter ] = useState(0)
    const handleCounter=()=>{
        setCounter(counter+1)
    }
  return (
    <>
    <h1>{counter}</h1>
    <button onClick={handleCounter}>+</button>
    </>
  )
}

export default Counter