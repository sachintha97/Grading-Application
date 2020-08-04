package com.grading.applicationbe.dto;

import java.util.Objects;

public class AssignmentDto {
    private int assignmentId;
    private String assignmentName;

    public AssignmentDto() {
    }

    public AssignmentDto(int assignmentId, String assignmentName) {
        this.assignmentId = assignmentId;
        this.assignmentName = assignmentName;
    }

    public int getAssignmentId() {
        return assignmentId;
    }

    public void setAssignmentId(int assignmentId) {
        this.assignmentId = assignmentId;
    }

    public String getAssignmentName() {
        return assignmentName;
    }

    public void setAssignmentName(String assignmentName) {
        this.assignmentName = assignmentName;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof AssignmentDto)) return false;
        AssignmentDto that = (AssignmentDto) o;
        return getAssignmentId() == that.getAssignmentId();
    }

    @Override
    public int hashCode() {
        return Objects.hash(getAssignmentId());
    }

    @Override
    public String toString() {
        return "AssignmentDto{" +
                "assignmentId=" + assignmentId +
                ", assignmentName='" + assignmentName + '\'' +
                '}';
    }
}
