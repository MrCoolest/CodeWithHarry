// import logo from './logo.svg';
import "./App.css";
import Header from "./MyComponents/Header";
import { Footer } from "./MyComponents/Footer";
import { Todos } from "./MyComponents/Todos";
import { AddTodo } from "./MyComponents/AddTodo";
import { About } from "./MyComponents/About";
import React, { useState, useEffect } from "react";
import {
  BrowserRouter as Router,
  Switch,
  Route
} from "react-router-dom";


function App() {
  
  let initTodo;
  if (localStorage.getItem("todos_list") === null) {
    initTodo = [];
  } else {
    initTodo = JSON.parse(localStorage.getItem("todos_list"));
  }

  const onDelete = (todo) => {
    // console.log("i am Deleted", todo);
    // Deleting This way in React Does not Work!
    // let index = todos_list.indexOf(todo);
    // todos_list.splice(index,1);

    settodos(
      todos_list.filter((e) => {
        return e !== todo;
      })
    );
  };

  const addTodo = (title, desc) => {
    console.log(title, desc);
    let sno;
    if (todos_list.length === 0) {
      sno = 0;
    } else {
      sno = todos_list[todos_list.length - 1].sno + 1;
    }

    const myTodo = {
      sno: sno,
      title: title,
      desc: desc,
    };
    settodos([...todos_list, myTodo]);
    // console.log(myTodo);

    // if(localStorage.getItem('todos_list')){

    // }
  };

  const [todos_list, settodos] = useState(initTodo);
  useEffect(() => {
    localStorage.setItem("todos_list", JSON.stringify(todos_list));
  }, [todos_list]);

  return (
    <>
    <Router>
      <Header title="My Todo App" searchBar={true} />
      <Switch>
      <Route exact path="/" render={()=>{
        return (
          <>
          <AddTodo addTodo={addTodo} />
          <Todos todos={todos_list} onDelete={onDelete} />
          </>
        )
      }}>

      </Route>
      <Route exact path="/about" component={About} >
      {/* <About /> */}
    </Route>
    </Switch>

      <Footer />

      </Router>
    </>
  );
}

export default App;
