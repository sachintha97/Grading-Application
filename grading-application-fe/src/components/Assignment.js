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
import { Box, Typography, ListItemSecondaryAction } from "@material-ui/core";

const useStyles = makeStyles((theme) => ({
  root: {
    width: "100%",
    maxWidth: "100%",
    backgroundColor: theme.palette.background.paper,
  },
}));

const Assignment = ({ assignmentId, assignmentName }) => {
  const classes = useStyles();

  return (
    <div>
      {/* <h4>{assignmentId} </h4>

    <p>assignment_name: {assignmentName}</p>
    <p>{course_id}</p> */}
      <Box m={5}>
        <List className={classes.root}>
          <ListItem>
            <ListItemAvatar>
              <Avatar component={RouterLink} to="/assignments/1">
                <AssignmentTurnedInIcon />
              </Avatar>
            </ListItemAvatar>
            <ListItemText primary={assignmentName} secondary={assignmentId} />
            <ListItemSecondaryAction>
              <Typography component={RouterLink} to="/assignments/1">
                {" "}
                75 %
              </Typography>
            </ListItemSecondaryAction>
          </ListItem>
          <Divider variant="inset" component="li" />
        </List>
      </Box>
    </div>
  );
};

export default connect()(Assignment);
