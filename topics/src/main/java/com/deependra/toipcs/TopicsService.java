package com.deependra.toipcs;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Service;

@Service
public class TopicsService {

	// 1 when you create a List from Arrays.asList you end with immutable List
	// therefore change this List to ArrayList to make this a mutable.
	List<Topic> topics = new ArrayList<>(
			Arrays.asList(new Topic("spring", "spring freamwork", "spring frameowrk descripton"),
					new Topic("Hibernate", "Hibernate freamwork", "Hibernate frameowrk descripton"),
					new Topic("Maven", "Maven freamwork", "Maven frameowrk descripton")));

	public List<Topic> getallTopics() {

		return topics;

	}

	public Topic getTopicById(String id) {

		return topics.stream().filter(t -> t.getId().equals(id)).findFirst().get();

	}

	public void addTopic(Topic topic) {

		topics.add(topic);// will get error, Refer 1

	}

	public void updateTopic(String id, Topic topic) {

		for (int i = 0; i < topics.size(); i++) {
			Topic top = topics.get(i);
			if (top.getId().equals(id)) {
				topics.add(i, topic);
				return;
			}
		}

	}

	public void deleteTopic(String id) {

		topics.removeIf(t -> t.getId().equals(id));

	}
}
