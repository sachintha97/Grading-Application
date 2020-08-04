import React, { useEffect } from "react";
import { connect } from "react-redux";
import Assignment from "./Assignment";
import { bindActionCreators } from "redux";
import { List } from "@material-ui/core";
import ListItem from "@material-ui/core/ListItem";
import { getAssignments } from "../actions/assignments";

const AssignmentList = ({ assignments, getAssignments }) => {
  console.log(getAssignments);
  useEffect(() => {
    getAssignments();
  }, []);

  return (
    <>
      <h1>Assignment List:</h1>
      <List>
        {assignments.map((assignment) => {
          return (
            <ListItem key="{assignment.id}">
              <Assignment {...assignment}></Assignment>
            </ListItem>
          );
        })}
      </List>
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
