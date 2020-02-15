package com.deependra.toipcs;

import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Service;

@Service
public class TopicsService {

	List<Topic> topics = Arrays.asList(new Topic("spring", "spring freamwork", "spring frameowrk descripton"),
			new Topic("Hibernate", "Hibernate freamwork", "Hibernate frameowrk descripton"),
			new Topic("Maven", "Maven freamwork", "Maven frameowrk descripton"));

	public List<Topic> getallTopics() {

		return topics;

	}

	public Topic getTopicById(String id) {

		return topics.stream().filter(t -> t.getId().equals(id)).findFirst().get();

	}

}
