/*jshint esversion: 6 */

import React, { Component } from 'react';
import 'whatwg-fetch';

class Car extends Component {
  constructor(props) {
    super(props);
    this.state = {name: 'Placeholder', age: 0};
  }

  componentDidMount(){
    this.getCar();
  }

  getCar() {
    fetch('/api/cars').then(function(response) {
      return response.json();
    }.bind(this)).then(function(json){
      this.setState(json);
    }.bind(this));

  }

  render() {

    return <div> Hello car: {this.state.name} I am {this.state.age} years old.</div>;
  }
}

export default Car;

