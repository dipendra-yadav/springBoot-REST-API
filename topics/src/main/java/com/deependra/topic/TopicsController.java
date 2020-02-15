package com.deependra.topic;

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

@RestController
public class TopicsController {

	@Autowired
	TopicsService topicsService;

	@RequestMapping("/topics")
	public List<Topic> getallTopics() {

		return topicsService.getallTopics();

	}

	@RequestMapping("/topics/{id}")
	public Topic getTopicById(@PathVariable String id) {

		return topicsService.getTopicById(id);

	}

	@RequestMapping(value = "/topics", method = RequestMethod.POST)
	public void addTopic(@RequestBody Topic topic) {

		topicsService.addTopic(topic);

	}

	// PUT for update
	@RequestMapping(value = "/topics/{id}", method = RequestMethod.PUT)
	public void updateTopic(@PathVariable String id, @RequestBody Topic topic) {

		topicsService.updateTopic(id, topic);

	}

	@RequestMapping(value = "/topics/{id}", method = RequestMethod.DELETE)
	public void updateTopic(@PathVariable String id) {

		topicsService.deleteTopic(id);

	}

}