import React from 'react'

const data=[
  {
    name:'Air India',
    time:'08:00'
  },
  {
    name:'Indigo',
    time:'08:45'
  },
  {
    name:'Spicejet',
    time:'09:15'
  }
]

function GuestPage({toggle}) {
  return (
    <div>
      <table border={1}>
        <tr>
          <th>Name</th>
          <th>Time</th>
        </tr>
        {
          data.map((details)=>{
            return(
              <tr>
              <td>{details.name}</td>
              <td>{details.time}</td>
              </tr>
            )
          })
        }
      </table>
      <h2>Log in to see the price</h2>
      <button onClick={toggle}>Login</button>
    </div>
  )
}

export default GuestPage
