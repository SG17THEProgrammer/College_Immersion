import React from 'react'

const Person = ({name}) => {
  return (
    <div>Person : {name}</div>
  )
}

//yeh niche waale dono is named exports
export const Audi = () => {
  return (
    <div>Audi</div>
  )
}
export const BMW = () => {
  return (
    <div>BMW</div>
  )
}

export default Person