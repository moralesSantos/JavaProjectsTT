import React from 'react';

const IncrButton = (props) => {
    return (
        <button onClick={props.handleIncrButton}>Increase Count</button>
    )
}

export default IncrButton;