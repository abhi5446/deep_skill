import React, { Component } from 'react'
import CurencyConvertor from './CurencyConvertor';

export default class App extends Component {
  constructor(props){
    super(props);
    this.state={
      counter:0
    };
    this.increment=this.increment.bind(this);
    this.decrement=this.decrement.bind(this);
  }

  increment(){
    this.setState(prev=>({
      counter:prev.counter+1
    }),()=>{setTimeout(() => {
          alert('Hello there!');
        }, 0);});
    
  }

  decrement(){
    this.setState(prev=>({
      counter:prev.counter-1
    }));
  }

  alertmsg(msg){
    alert(msg);
  }

  OnPress(){
    alert("I was clicked");
  }

  render() {
    return (
      <div>
        {this.state.counter}<br />
        <button onClick={this.increment}>Increment</button><br />
        <button onClick={this.decrement}>Decrement</button><br />
        <button onClick={()=>this.alertmsg("Welcome")}>Say welcome</button><br />
        <button onClick={this.OnPress}>Click on me</button><br />
        <CurencyConvertor />
      </div>
    )
  }
}
