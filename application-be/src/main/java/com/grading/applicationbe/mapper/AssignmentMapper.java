package com.grading.applicationbe.mapper;

import com.grading.applicationbe.dto.AssignmentDto;
import com.grading.applicationbe.dto.CourseAssignmentDto;
import com.grading.applicationbe.dto.CourseDto;
import com.grading.applicationbe.model.Assignment;
import com.grading.applicationbe.model.Course;
import org.mapstruct.BeanMapping;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.factory.Mappers;
import org.springframework.context.annotation.Bean;

import java.util.List;

@Mapper()
public interface AssignmentMapper {
    AssignmentMapper ASSIGNMENT_MAPPER = Mappers.getMapper(AssignmentMapper.class);

    AssignmentDto toResponseDto(Assignment assignment);
    List<AssignmentDto> toResponseDtoList(List<Assignment> assignments);

}