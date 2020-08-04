import axios from "../axios/axios";

// action send data from application to store
// type -  type of action being performed
const _getAssignments = (assignments) => ({
  type: "GET_Assignments",
  assignments,
});
// send data using dispatch()
export const getAssignments = () => {
  return (dispatch) => {
    return axios.get("assignments").then((result) => {
      const assignments = [];
      console.log(result);
      result.data.forEach((item) => {
        assignments.push(item);
      });

      dispatch(_getAssignments(assignments));
    });
  };
};
