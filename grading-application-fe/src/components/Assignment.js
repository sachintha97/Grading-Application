import React from "react";
import { connect } from "react-redux";
import { makeStyles } from "@material-ui/core/styles";
import List from "@material-ui/core/List";
import ListItem from "@material-ui/core/ListItem";
import ListItemText from "@material-ui/core/ListItemText";
import ListItemAvatar from "@material-ui/core/ListItemAvatar";
import Avatar from "@material-ui/core/Avatar";
import Divider from "@material-ui/core/Divider";
import AssignmentTurnedInIcon from "@material-ui/icons/AssignmentTurnedIn";
import { Link as RouterLink } from "react-router-dom";
import {
  Box,
  Typography,
  ListItemSecondaryAction,
  Button,
} from "@material-ui/core";

const useStyles = makeStyles((theme) => ({
  root: {
    width: "100%",
    maxWidth: "100%",
    margin: 0,
    padding: 0,
  },
  button: {
    background: "blue",
    color: "white",
  },
}));

const Assignment = ({ assignmentName, courseName, assignmentId }) => {
  const classes = useStyles();

  return (
    <div>
      <Box m={5}>
        <List className={classes.root}>
          <ListItem>
            <ListItemAvatar>
              <Avatar component={RouterLink} to={`/results/1/${assignmentId}`}>
                <AssignmentTurnedInIcon />
              </Avatar>
            </ListItemAvatar>
            <ListItemText primary={courseName} secondary={assignmentId} />
            <ListItemSecondaryAction>
              <Typography
                component={RouterLink}
                to={`/results/1/${assignmentId}`}
              >
                {assignmentName}
              </Typography>
            </ListItemSecondaryAction>
          </ListItem>
          <Button
            className={classes.button}
            variant="contained"
            component={RouterLink}
            to={`/results/1/${assignmentId}`}
          >
            View Results
          </Button>
          <Divider variant="inset" component="li" />
        </List>
      </Box>
    </div>
  );
};

export default connect()(Assignment);
