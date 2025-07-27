import './App.css';
import CalculatorScore from './Components/CalculatorScore';
import './Stylesheets/mystyle.css'
function App() {
  return (
    <div >
      <CalculatorScore Name={"Steeve"}
      School={'DNV Public School'}
      total={284}
      goal={3}
      />
    </div>
  );
}

export default App;
