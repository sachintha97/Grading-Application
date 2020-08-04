import React from "react";
import NavBar from "./components/NavBar";
import Assignments from "./components/AssignmentList";
import Review from "./components/Review";
import Home from "./components/Home";
import { Route, Switch, BrowserRouter } from "react-router-dom";
import getAppStore from "./store/store";
import { Provider } from "react-redux";

const store = getAppStore();

function App() {
  return (
    <>
      <Provider store={store}>
        <BrowserRouter>
          <NavBar />
          <Switch>
            <Route component={Home} path="/" exact />
            <Route component={Assignments} path="/assignments" exact />
            <Route component={Review} path="/assignments/:id" />
          </Switch>
        </BrowserRouter>
      </Provider>
    </>
  );
}

export default App;
