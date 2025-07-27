import React, { Component } from 'react'

export class CalculatorScore extends Component {
  percentToDecimal(x){
    return x.toFixed(2)+'%';
  };

  calcScore(total,goal){
    return this.percentToDecimal((total/goal)*100);
  }
  render() {
    const {Name,School,total,goal}=this.props;
    return (
      <div className='formatstyle'>
        <h1 style={{color:'brown'}}>Student Details</h1>

        <div className='Name'> 
          <b><span>Name:</span></b>
          <span>{Name}</span>
        </div>

        <div className='School'> 
          <b><span>School:</span></b>
          <span>{School}</span>
        </div>

        <div className='Total'> 
          <b><span>Total:</span></b>
          <span>{total}</span>
          <span>Marks</span>
        </div>

        <div className='Score'> 
          <b>School:</b>
          <span>{this.calcScore(total,goal)}</span>
        </div>
        
      </div>
    );
  }
};

export default CalculatorScore;
