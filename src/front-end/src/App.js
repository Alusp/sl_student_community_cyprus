import "./App.css";
import { getAllStudents } from "./client";
import { Component } from "react";
import { Table } from 'antd';

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
   
      const columns = [
        {
          title: 'student Id',
          dataIndex: 'studentId',
          key: 'studentId'
        },
        {
          title: 'First Name',
          dataIndex: 'firstName',
          key: 'firstName'
        },
        {
          title: 'Last Name',
          dataIndex: 'lastName',
          key: 'lastName'
        },
        {
          title: 'Email',
          dataIndex: 'email',
          key: 'email'
        },
        {
          title: 'Gender',
          dataIndex: 'gender',
          key: 'gender'
        }

      ];

      return <Table dataSource={students} columns = {columns} rowKey='studentId'/>

    }
    return <h1> No Students found</h1>;
  }
}

export default App;
