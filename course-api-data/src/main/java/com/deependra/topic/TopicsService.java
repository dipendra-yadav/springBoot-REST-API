package com.deependra.topic;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TopicsService {

	@Autowired
	private TopicRepository topicRepository;

	// 1 when you create a List from Arrays.asList you end with immutable List
	// therefore change this List to ArrayList to make this a mutable.
	List<Topic> topics = new ArrayList<>(
			Arrays.asList(new Topic("spring", "spring freamwork", "spring frameowrk descripton"),
					new Topic("Hibernate", "Hibernate freamwork", "Hibernate frameowrk descripton"),
					new Topic("Maven", "Maven freamwork", "Maven frameowrk descripton")));

	public List<Topic> getallTopics() {

		List<Topic> topics = new ArrayList<>();
		topicRepository.findAll().forEach(topics::add);
		return topics;

	}

	public Topic getTopicById(String id) {

		return topicRepository.findTopicById(id);

	}

	public void addTopic(Topic topic) {
		topicRepository.save(topic);

	}

	public void updateTopic(String id, Topic topic) {
		topicRepository.save(topic);// save can do Both add and update

	}

	public void deleteTopic(String id) {
		topicRepository.deleteById(id);

	}
}
