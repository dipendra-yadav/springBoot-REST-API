package com.deependra.course;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CourseService {

	@Autowired
	private CourseRepository courseRepository; // Alt+shift+T for Renaming

	// find the courses which Belong to a particular Topic
	public List<Course> getallCourses(String topicId) {

		List<Course> courses = new ArrayList<>();
		courseRepository.findCourseByTopicId(topicId).forEach(courses::add);
		return courses;

		// Note:findCourseByTopicId will find only those course where topic id matches
	}

	public Course getCourse(String id) {

		return courseRepository.getOne(id);

	}

	public void addCourse(Course course) {
		courseRepository.save(course);

	}

	public void updateCourse(Course course) {
		courseRepository.save(course);

	}

	public void deleteCourse(String id) {
		courseRepository.deleteById(id);

	}
}
