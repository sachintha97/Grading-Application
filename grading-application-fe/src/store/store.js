import { createStore, applyMiddleware, combineReducers } from "redux";
import thunk from "redux-thunk";
import assignments from "../reducers/assignments";

// stores the whole state of the app
const rootReducer = combineReducers({
  assignments: assignments,
});
export default () => {
  return createStore(rootReducer, applyMiddleware(thunk));
};
