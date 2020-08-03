import React from "react";
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

// list of assignments
export default function AssignmentPage() {
  const classes = useStyles();

  return (
    <Box m={5}>
      <List className={classes.root}>
        <ListItem>
          <ListItemAvatar>
            <Avatar component={RouterLink} to="/assignments/1">
              <AssignmentTurnedInIcon />
            </Avatar>
          </ListItemAvatar>
          <ListItemText primary="Assignment 1" secondary="Jan 9, 2020" />
          <ListItemSecondaryAction>
            <Typography component={RouterLink} to="/assignments/1">
              {" "}
              75 %
            </Typography>
          </ListItemSecondaryAction>
        </ListItem>
        <Divider variant="inset" component="li" />
        <ListItem>
          <ListItemAvatar>
            <Avatar component={RouterLink} to="/assignments/2">
              <AssignmentTurnedInIcon />
            </Avatar>
          </ListItemAvatar>
          <ListItemText primary="Assignment 2" secondary="Jun 7, 2020" />
          <ListItemSecondaryAction>
            <Typography component={RouterLink} to="/assignments/2">
              {" "}
              85 %
            </Typography>
          </ListItemSecondaryAction>
        </ListItem>
        <Divider variant="inset" component="li" />
        <ListItem>
          <ListItemAvatar>
            <Avatar component={RouterLink} to="/assignments/3">
              <AssignmentTurnedInIcon />
            </Avatar>
          </ListItemAvatar>
          <ListItemText primary="Assignment 3" secondary="July 20, 2019" />
          <ListItemSecondaryAction>
            <Typography component={RouterLink} to="/assignments/3">
              {" "}
              69 %
            </Typography>
          </ListItemSecondaryAction>
        </ListItem>
      </List>
    </Box>
  );
}
