import React, { useEffect } from "react";
import { connect } from "react-redux";
import Result from "./Result";
import { bindActionCreators } from "redux";
import { getResults } from "../actions/results";
import { Typography, Box } from "@material-ui/core";
import { makeStyles } from "@material-ui/core/styles";
import { useParams } from "react-router-dom";

const useStyles = makeStyles((theme) => ({
  subheading: {
    textAlign: "right",
    fontWeight: "bold",
    margin: 10,
    padding: 10,
  },
  heading: {
    textAlign: "center",
    color: "#000066",
    fontWeight: "bold",
  },
}));

const ResultList = ({ results, getResults }) => {
  let { id } = useParams();

  console.log(getResults);
  useEffect(() => {
    getResults(id);
  }, [id]);

  const classes = useStyles();

  return (
    <Box m={3}>
      <Typography variant="h3" className={classes.heading}>
        Student Results
      </Typography>
      <Typography variant="h6" className={classes.subheading}>
        Marks
      </Typography>
      <li>
        {results.map((result) => {
          return (
            <ul key={`${result.id}`}>
              <Result {...result}></Result>
            </ul>
          );
        })}
      </li>
    </Box>
  );
};

const mapStateToProps = (state) => {
  console.log(state);
  return {
    results: state.results,
  };
};

const mapDispatchToProps = (dispatch) => {
  return {
    getResults: bindActionCreators(getResults, dispatch),
  };
};

export default connect(mapStateToProps, mapDispatchToProps)(ResultList);
