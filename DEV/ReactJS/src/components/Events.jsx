import React from 'react'

const Events = () => {
    const handleClick = () => {
        console.log("liyo dba diya ")
    }
  return (
    <div>
        <button onClick={handleClick}>click me </button>
        <button onClick={()=>handleClick()}>mujhe bhi </button>
    </div>
  )
}

export default Events