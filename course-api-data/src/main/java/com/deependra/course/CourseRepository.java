package com.deependra.course;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

@Repository
public interface CourseRepository extends JpaRepository<Course, String> {

	public List<Course> findCourseByTopicId(String topicId);

}
