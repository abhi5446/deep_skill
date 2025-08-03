import React from 'react'

function ListofIndianPlayers({IndianPlayers}) {
  return (
    <div>
        <ul>
        {IndianPlayers.map((item)=>{
            return(
                <div>
                <li>Mr.{item.name}<span> {item.score}</span></li>
                </div>
            )
        }
        )}
        </ul>
    </div>
  )
}

export default ListofIndianPlayers;


export function OddPlayers([first,,third,,fifth]){
  return(
    <div>
      <ul>
        <li>First : {first}</li>
        <li>Third : {third}</li>
        <li>Fifth : {fifth}</li>
      </ul>
    </div>
  )
}

export function EvenPlayers([,second,,fourth,,sixth]){
  return(
    <div>
      <ul>
        <li>Second : {second}</li>
        <li>Fourth : {fourth}</li>
        <li>Sixth : {sixth}</li>
      </ul>
    </div>
  )
}