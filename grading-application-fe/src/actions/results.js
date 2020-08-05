import axios from "../axios/axios";

// action send data from application to store
// type -  type of action being performed
const _getResults = (results) => ({
  type: "GET_Results",
  results,
});

// send data using dispatch()
// only get studentId=1 student relevant results (hard code studentId as 1 - because login page not created yet)

export const getResults = (id) => {
  return (dispatch) => {
    return axios.get(`/results/1/${id}`).then((result) => {
      const results = [];
      console.log(result);
      result.data.forEach((item) => {
        results.push(item);
      });

      dispatch(_getResults(results));
    });
  };
};
