// Will complete intro to react on web 
// but after each section will copy code to here as I go along


const render = () => {
    document.getElementById('mountNode').innerHTML = `
      <div>
        Hello HTML
        <input />
        <pre>${new Date().toLocaleTimeString()}</pre>
      </div>
    `;
  
    ReactDOM.render(
      React.createElement(
        'div',
        null,
        'Hello React',
        React.createElement('input', null),
        React.createElement('pre', null, new Date().toLocaleTimeString())
      ),
      document.getElementById('mountNode2')
    );
  };
  
  setInterval(render, 1000);


  // Creating components using functions 

  function Button (props) {
    // Returns a DOM/React element here. For example:
    return <button type="submit">{props.label}</button>;
  }
  
  // To render a Button element in the browser
  ReactDOM.render(<Button label="Save" />, mountNode);

  //Using jsx to create button 
  function Button (props) {
    return React.createElement(
      "button",
      { type: "submit" },
      props.label
    );
  }
  
  ReactDOM.render(
    React.createElement(Button, { label: "Save"}),
    mountNode
  );


  //Destructering a component props

  const Button = ({label})=> (
      <button tyep = "submit" >{label}</button>
  ); 

  //Expressions in JSX 
  const RandomValue = () => (
    <div>
      { Math.floor(Math.random() * 100) }
    </div>
  );
  
  ReactDOM.render(<RandomValue />, mountNode);

  //Expresions in JSX but passing objects

const ErrorDisplay = ({ message }) => (
    <div style={{ color:'red', backgroundColor:'green' }}>
      {message}
    </div>
  );
  
  ReactDOM.render(
    <ErrorDisplay
      message="These aren't the droids you're looking for"
    />,
    mountNode
  );


  //Class 
  class Button extends React.Component {
    render() {
      return (
        <button>{this.props.label}</button>
      );
    }
  }
  
  // Use it (same syntax)
  ReactDOM.render(<Button label="Save" />, mountNode);


  //What are hooks
  const Button = () => {
    const [count, setCount] = useState(0);
    
    return (
      <button onClick={() => setCount(count +1)}>
        {count}</button>
    ); 
  }; 
  
  
  ReactDOM.render(<Button/>, mountNode); 



//Top Level Component 
const Button = ({ clickAction }) => {
    return (
      <button onClick={clickAction}>
        +1
      </button>
    );
  };
  
  const Display = ({ content }) => (
    <pre>{content}</pre>
  );
  
  const CountManager = () => {
    const [count, setCount] = useState(0);
  
    const incrementCounter = () => {
      setCount(count + 1);
    };
  
    return (
      <div>
        <Button clickAction={incrementCounter} />
        <Display content={count} />
      </div>
    );
  };
  
  ReactDOM.render(<CountManager />, mountNode);


  //Making it useful to use as components 

  const Button = ({ clickAction, clickValue }) => {
    return (
      <button onClick={() => clickAction(clickValue)}>
        +{clickValue}
      </button>
    );
  };
  
  const Display = ({ content }) => (
    <pre>{content}</pre>
  );
  
  const CountManager = () => {
    const [count, setCount] = useState(0);
  
    const incrementCounter = (incrementValue) => {
      setCount(count + incrementValue);
    };
    
    
  
    return (
      <div>
        <Button clickAction={incrementCounter} clickValue= {1} />
        <Button clickAction={incrementCounter} clickValue = {5} />
        <Button clickAction={incrementCounter} clickValue = {10} />
        <Display content={count} />
      </div>
    );
  };
  
  ReactDOM.render(<CountManager />, mountNode);

