package com.grading.applicationbe.mapper;

import com.grading.applicationbe.dto.CourseDto;
import com.grading.applicationbe.model.Course;
import org.mapstruct.MapMapping;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.factory.Mappers;

import java.util.List;

@Mapper()
public interface CourseMapper {

    /**
     * implement for future enhancement*/

    AssignmentMapper ASSIGNMENT_MAPPER = Mappers.getMapper(AssignmentMapper.class);

    CourseDto toResponseDto(Course course);
    List<CourseDto> toResponseDtoList(List<Course> course);
}
