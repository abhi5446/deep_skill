import { useState } from 'react';
import UserPage from './UserPage';
import GuestPage from './GuestPage';

function App() {
  const [log,setLog] = useState(false);
  
  return (
    <div>
      <h1>Ticket booking</h1>
      {
        log?<UserPage toggle={()=>setLog(false)} />:<GuestPage toggle={()=>setLog(true)}/>
      }
      
    </div>
  );
}

export default App;
