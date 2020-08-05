import React, { useEffect } from "react";
import { connect } from "react-redux";
import Assignment from "./Assignment";
import { bindActionCreators } from "redux";
import { makeStyles } from "@material-ui/core/styles";
import { getAssignments } from "../actions/assignments";
import { Typography } from "@material-ui/core";

const useStyles = makeStyles((theme) => ({
  heading: {
    textAlign: "center",
    color: "#000066",
    fontWeight: "bold",
  },
}));

const AssignmentList = ({ assignments, getAssignments }) => {
  console.log(getAssignments);
  useEffect(() => {
    getAssignments();
  }, []);

  const classes = useStyles();

  return (
    <>
      <Typography variant="h3" className={classes.heading}>
        Assignment List
      </Typography>
      <li>
        {assignments.map((assignment) => {
          return (
            <ul key={`${assignment.assignmentId}`}>
              <Assignment {...assignment}></Assignment>
            </ul>
          );
        })}
      </li>
    </>
  );
};

const mapStateToProps = (state) => {
  console.log(state);
  return {
    assignments: state.assignments,
  };
};

const mapDispatchToProps = (dispatch) => {
  return {
    getAssignments: bindActionCreators(getAssignments, dispatch),
  };
};

export default connect(mapStateToProps, mapDispatchToProps)(AssignmentList);
