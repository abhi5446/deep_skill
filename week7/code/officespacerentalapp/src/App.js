import logo from './logo.svg';
import './App.css';
const offices=[
  {
    name:'DBS',
    rent:50000,
    address:'Chennai'
  },
  {
    name:'TCS',
    rent:35000,
    address:'Delhi'
  },
  {
    name:'Tech Mahindra',
    rent:64000,
    address:'Bengaluru'
  },
  {
    name:'Cognizant',
    rent:70000,
    address:'Hyderabad'
  }
]
function App() {
  return (
    <div>
      <h1>Office Space,at Affordable Range</h1>
      {
        offices.map((office,index)=>{
          const st={color:office.rent<60000?'red':'green'};
          return(
            <div>
              <img src='/office.jpeg' width='25%' height='25%' alt='Office Space' />
              <h4>Name : {office.name}</h4>
              <h4 style={st} >Rent : {office.rent}</h4>
              <h4>Address : {office.address}</h4>
              <hr />
            </div>
          )
        })
      }
    </div>
  );
}

export default App;
