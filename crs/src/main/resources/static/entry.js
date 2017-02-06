// require("./style.css")
// document.write(require("./content.js"));

/*jshint esversion:6 */

import './style.css';
import React from 'react';
import ReactDOM from 'react-dom';
import Car from './car/car';

var container = document.getElementById('app');

ReactDOM.render(
  <div>
    <h1>Welcome to CRS</h1>
  <Car/>
  </div>,
  container
);
