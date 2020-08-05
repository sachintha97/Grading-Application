import React from "react";
import { connect } from "react-redux";
import { makeStyles } from "@material-ui/core/styles";
import List from "@material-ui/core/List";
import ListItem from "@material-ui/core/ListItem";
import ListItemText from "@material-ui/core/ListItemText";
import ListItemAvatar from "@material-ui/core/ListItemAvatar";
import Avatar from "@material-ui/core/Avatar";
import Divider from "@material-ui/core/Divider";
import AccountCircleIcon from "@material-ui/icons/AccountCircle";
import { Box, Typography, ListItemSecondaryAction } from "@material-ui/core";

const useStyles = makeStyles((theme) => ({
  root: {
    width: "100%",
    maxWidth: "100%",
    margin: 0,
    padding: 0,
    backgroundColor: theme.palette.background.paper,
  },
}));

const Result = ({ firstName, lastName, grade }) => {
  const classes = useStyles();

  return (
    <div>
      <Box m={5}>
        <List className={classes.root}>
          <ListItem>
            <ListItemAvatar>
              <Avatar>
                <AccountCircleIcon />
              </Avatar>
            </ListItemAvatar>
            <ListItemText primary={firstName + " " + lastName} />
            <ListItemSecondaryAction>
              <Typography> {grade}</Typography>
            </ListItemSecondaryAction>
          </ListItem>
          <Divider variant="inset" component="li" />
        </List>
      </Box>
    </div>
  );
};

export default connect()(Result);
