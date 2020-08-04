import React from "react";
import { Typography, makeStyles, Box } from "@material-ui/core";

const useStyles = makeStyles((theme) => ({
    heading: {
      flexGrow: 1,
      textAlign: 'center',
      color: '#330033',
      fontWeight: 'bold',
    },
  }));

export default function Home() {
    const classes = useStyles();

    // home page 
    return (
      <Box m={3}>
      <Typography variant="h3" className={classes.heading}>ONLINE GRADING APPLICATION</Typography>
      </Box>
    );
  }
  
