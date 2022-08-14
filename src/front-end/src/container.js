import React from "react";
const Container = props => (

  <div style={{width: '1400px', margin: '0 auto', textAlign: 'center', marginTop: '120px'}}>
       {props.children}
  </div>
);

export default Container;