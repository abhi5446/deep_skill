import React, { Component } from 'react'

export class CurencyConvertor extends Component {

  constructor(props){
    super(props);
    this.state=({
      rs:'',
      eu:''
    });
  }

  handleChange=(event)=>{
    this.setState({ rs:event.target.value});
  };

  onsubmit=()=>{
    const rs=parseFloat(this.state.rs);
    
    if(!isNaN(rs)){
      const eu=(rs/101).toFixed(2);
      this.setState({eu});
    }

  }

  render() {
    return (
      <div>
        <h1 style={{color:'green'}}>Curency Convertor</h1><br />
        <label>Amount :</label>
        <input type='text' value={this.state.rs} onChange={this.handleChange}/><br />
        <label>Currency:</label>  {this.state.eu}<br />
        <button onClick={this.onsubmit}>submit</button>
      </div>
    )
  }
}

export default CurencyConvertor
