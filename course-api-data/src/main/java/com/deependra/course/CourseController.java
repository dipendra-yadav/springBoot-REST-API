package com.deependra.course;

import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.deependra.topic.Topic;

@RestController
public class CourseController {

	@Autowired
	CourseService courseService;

	// localhost:8080/topics/java/courses
	@RequestMapping("/topics/{topicid}/courses")
	public List<Course> getallCourses(@PathVariable String topicid) {

		return courseService.getallCourses(topicid);

	}

	// localhost:8080/topics/java/courses/java-streams
	@RequestMapping("/topics/{topicid}/courses/{id}")
	public Course getCourse(@PathVariable String topicid) {

		return courseService.getCourse(topicid);

	}

	// localhost:8080/topics/java/courses/
	@RequestMapping(value = "/topics/{topicid}/courses/", method = RequestMethod.POST)
	public void addCourse(@PathVariable String topicid, @RequestBody Course course) {
		course.setTopic(new Topic(topicid, "", ""));// set a new Topic for every course adding Request
		courseService.addCourse(course);

	}

	// PUT for update
	// localhost:8080/topics/java/courses/java-streams
	@RequestMapping(value = "/topics/{topicid}/courses/{id}", method = RequestMethod.PUT)
	public void updateCourse(@PathVariable String topicid, @PathVariable String id, @RequestBody Course course) {
		course.setTopic(new Topic(topicid, "", ""));
		courseService.updateCourse(course);

	}

	@RequestMapping(value = "/topics/{topicid}/courses/{id}", method = RequestMethod.DELETE)
	public void updateTopic(@PathVariable String id) {
		courseService.deleteCourse(id);

	}

}
