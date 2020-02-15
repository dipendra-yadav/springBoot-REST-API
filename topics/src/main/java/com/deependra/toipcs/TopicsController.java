package com.deependra.toipcs;

import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TopicsController {

	@RequestMapping("/toipcs")
	public List<Topic> getallTopics() {

		return Arrays.asList(new Topic("spring", "spring freamwork", "spring frameowrk descripton"),
				new Topic("spring", "spring freamwork", "spring frameowrk descripton"),
				new Topic("spring", "spring freamwork", "spring frameowrk descripton"));

	}

}
