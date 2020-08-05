const resultsReducerDefaultState = [];

// reducers specify how the application's state changes in response to actions sent to the store
// that update the state according to actions
export default (state = resultsReducerDefaultState, action) => {
  switch (action.type) {
    case "GET_Results":
      return action.results;
    default:
      return state;
  }
};
