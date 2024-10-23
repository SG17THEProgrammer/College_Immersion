import React, { useState } from 'react'

const ToDoList = () => {

    let arr=[];
    const [details , setDetails] = useState({
        title :"",
        description :""
    })

    const handleChange=(e)=>{
        const {value , name} = e.target
            setDetails({
                ...details,
                [name]:value
            })
    }

    const addTodo=()=>{
      arr.push({title:details.title,des:details.description})
      localStorage.setItem('todo', JSON.stringify([...arr]))
      setDetails({
        title :"",
        description :"" 
      })
    }

  let arr1 = localStorage.getItem('todo')
  let newarr= JSON.parse(arr1);

 

  return (
    <>
        <h1>To Do App</h1>
        <label htmlFor="" >Enter title </label>
        <input type="text" placeholder='Enter title' required onChange={handleChange} value={details.title} name='title'/> <br /><br />
        <label htmlFor="">Enter description </label> 
        <input type="text" placeholder='Enter description' required onChange={handleChange} value={details.description} name='description'/>
        <br /><br />
        <button onClick={addTodo}>➕</button>

        {newarr?.map((elem)=>{
            const {title , des } = elem
            return <>
            <h3>{title}</h3>
            <h4>{des}</h4>
            </>
        })}


    </>
  )
}

export default ToDoList