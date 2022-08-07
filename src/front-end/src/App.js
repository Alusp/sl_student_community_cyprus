import "./App.css";
import { getAllStudents } from "./client";
import { Component } from "react";

class App extends Component {
  state = {
    students: [],
  };

  componentDidMount() {
    this.fetchStudents();
  }

  fetchStudents = () => {
    getAllStudents().then((res) =>
      res.json().then((students) => {
        console.log(students);
         this.setState({
          students
         });
      })
    );
  };

  render() {
  
    const { students } = this.state;
    if(students && students.length){
     return students.map((students, index) => {
        return(
          <div key={index}>
            <h2>
              {students.studentId}
            </h2>
            <p>
              {students.firstName}
            </p>
            <p>
              {students.lastName}
            </p>
            <p>
              {students.email}
            </p>
            <p>
              {students.gender}
            </p>
          </div>
         )
      })
    }
    return <h1> No Students found</h1>;
  }
}

export default App;
