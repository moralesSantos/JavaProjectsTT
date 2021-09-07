import React, { Component } from 'react';
import ReactDOM from 'react-dom';
// import './index.css';
// import App from './App';
import reportWebVitals from './reportWebVitals';
import {
  BrowserRouter as Router, 
  Route, 
  Link 
} from 'react-router-dom';

// Home component
class Home extends Component {
  render(){
    return(
      <div>
        <h1>React Router</h1>
        <h4>Serving up URLs like Raichu with his thunderbolts!</h4>
        <img className="photo" src="https://media.gamestop.com/i/gamestop/11104139/POP-Games-Pokemon-Raichu?$pdp$" width="150" height="150"/>
      </div>
    );
  }
}

// About component

class About extends Component {
  render(){
    return(
      <div>
        <h1>About Us</h1>
        <p>Learning how to use react router through best game Pokemon</p>
        <p>Come learn with us!!</p>
      </div>
    );
  }
}

class Navbar extends Component {
  render(){
    return(
      <div className="nav">
        <Link to="/">Home</Link> | 
        <Link to="more">More</Link> | 
        <Link to="about">About</Link>
      </div>
    );
  }
}

// Menu component

class More extends Component {
  render(){
    return(
      <div>
        <h1>More</h1>
        <p>Best Pokemon:
          <ul>
            <li>Rayqueza</li>
            <li>Dragonite</li>
            <li>Charizard</li>
          </ul>
        </p>
      </div>
    );
  }
}

class Routes extends Component {
  render(){
    return(
      <Router>
        <div>
          <Navbar />
          <hr />
          <Route name="Home" exact path="/" component={Home}/>
          <Route name="More" path="/more" component={More}/>
          <Route name="About" path="/about" component={About} />
        </div>
      </Router>
    );
  }
}


ReactDOM.render(
  <React.StrictMode>
    <Routes />
  </React.StrictMode>,
  document.getElementById('root')
);

// If you want to start measuring performance in your app, pass a function
// to log results (for example: reportWebVitals(console.log))
// or send to an analytics endpoint. Learn more: https://bit.ly/CRA-vitals
reportWebVitals();
