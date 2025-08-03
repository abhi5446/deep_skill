import React from 'react'
const data=[
  {
    name:"HP Deathly Hallows",
    author:"JK Rowling"    
  },
  {
    name:"Eragon",
    author:"C Paolin"
  },
  {
    name:"The Lost Symbol",
    author:"Dan Brown"
  }
]
function BookDetails() {
  return (
    <div>
      <table border={1}>
        <tr>
          <th>Name</th>
          <th>Author</th>
        </tr>
        {
          data.map((details)=>{
            return(
              <tr>
              <td>{details.name}</td>
              <td>{details.author}</td>
              </tr>
            )
          })
        }
      </table>
    </div>
  )
}

export default BookDetails
