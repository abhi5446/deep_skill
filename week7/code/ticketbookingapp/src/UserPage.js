import React from 'react'
const data=[
  {
    name:'Air India',
    time:'08:00',
    price:6500
  },
  {
    name:'Indigo',
    time:'08:45',
    price:6000
  },
  {
    name:'Spicejet',
    time:'09:15',
    price:7000
  }
]
function UserPage({toggle}) {
  return (
    <div>
      <table border={1}>
        <tr>
          <th>Name</th>
          <th>Time</th>
          <th>Price</th>
        </tr>
        {
          data.map((details)=>{
            return(
              <tr>
              <td>{details.name}</td>
              <td>{details.time}</td>
              <td>{details.price}</td>
              </tr>
            )
          })
        }
      </table>
      <button onClick={toggle}>Logout</button>
    </div>
  )
}

export default UserPage
