import React from 'react'
const data=[
  {
    name:"Computer Organization",
    credits:3
  },
  {
    name:"Operating Systems",
    credits:2
  },
  {
    name:"modern c++",
    credits:3
  }
]
function CourseDetails() {
  return (
    <div>
      <table border={1}>
        <tr>
          <th>Name</th>
          <th>Credits</th>
        </tr>
        {
          data.map((details)=>{
            return(
              <tr>
              <td>{details.name}</td>
              <td>{details.credits}</td>
              </tr>
            )
          })
        }
      </table>
    </div>
  )
}

export default CourseDetails
