import { createStore, applyMiddleware, combineReducers } from "redux";
import thunk from "redux-thunk";
import assignments from "../reducers/assignments";
import results from "../reducers/results";

// stores the whole state of the app
const rootReducer = combineReducers({
  assignments: assignments,
  results: results,
});
export default () => {
  return createStore(rootReducer, applyMiddleware(thunk));
};
