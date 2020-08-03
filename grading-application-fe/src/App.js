import React from "react";
import NavBar from "./components/NavBar";
import Assignments from "./components/AssignmentPage";
import Review from "./components/Review";
import Home from "./components/Home";
import { Route, Switch, BrowserRouter } from "react-router-dom";

function App() {
  return (
    <>
      <BrowserRouter>
        <NavBar />
        <Switch>
          <Route component={Home} path="/" exact />
          <Route component={Assignments} path="/assignments" exact/>
          <Route component={Review} path="/assignments/:id" />
        </Switch>
      </BrowserRouter>
    </>
  );
}

export default App;
