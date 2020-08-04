import React from "react";
import { Typography, makeStyles, Box } from "@material-ui/core";
import { useParams } from "react-router-dom";
const useStyles = makeStyles((theme) => ({
  heading: {
    flexGrow: 1,
    textAlign: "center",
    color: "#000000",
    fontWeight: "bold",
  },
}));

export default function Review() {
  const classes = useStyles();
  //  We can use the 'useParams' to access the each assignment review
  let { id } = useParams();

  return (
    <Box m={5}>
      <Typography variant="h4" className={classes.heading}>
        REVIEW
      </Typography>

      <div>
        <h3>Assignment ID: {id}</h3>
      </div>
    </Box>
  );
}
