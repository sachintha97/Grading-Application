const assignmentsReducerDefaultState = [];

// reducers specify how the application's state changes in response to actions sent to the store
// that update the state according to actions
export default (state = assignmentsReducerDefaultState, action) => {
  switch (action.type) {
    case "GET_Assignments":
      return action.assignments;
    default:
      return state;
  }
};
