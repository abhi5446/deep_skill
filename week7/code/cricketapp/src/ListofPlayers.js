import React from 'react';



export default function ListOfPlayers({players}) {
  return (
    <div>
        <ul>
        {players.map((item)=>{
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

export const Scorebelow70 =({players}) => {
  return(
    <div>
        <ul>
        {
    players.map((item)=>{
      if(item.score<=70){
          return(
            <div>
              <li> Mr.{item.name}<span> {item.score}</span></li>
            </div>
          )
      }
    })
    }
        </ul>
    </div>
  );
}