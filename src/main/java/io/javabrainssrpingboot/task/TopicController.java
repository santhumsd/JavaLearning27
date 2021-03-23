package io.javabrainssrpingboot.task;

import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import io.javabrainssrpingboot.exception.InvalidBodyException;

@RestController
@RequestMapping("/topics")
public class TopicController {
	
	@Value("${server.port}")
	private String port; 
	@Autowired
	private TopicService topicService;
	
	//@RequestMapping()
	@GetMapping()
	public List<Topic> getAllTopics() {
		System.out.println("Rest Controller CourseController class inside san "+port);
		throw new InvalidBodyException("Topic Controller error");
        //return topicService.getAllTopics();	
	}
	
	@GetMapping("/{id}")
	public Topic getTopic(@PathVariable String id) {
		System.out.println("hi man controller");
		return topicService.getTopic(id);
				}
	
	//@RequestMapping(method=RequestMethod.POST,value="/")
	@PostMapping("/")
	public void addTopic(@RequestBody Topic topic) {
		topicService.addTopic(topic);
	}
	
	//@RequestMapping(method=RequestMethod.PUT,value="/{id}")
	@PutMapping("/{id}")
	public void updateTopic(@RequestBody Topic topic,@PathVariable String id) {
		topicService.updateTopic(id,topic);
	}
	
	//@RequestMapping(method=RequestMethod.DELETE,value="/{id}")
	@DeleteMapping("/{id}")
	public void deleteTopic(@PathVariable String id) {
		topicService.deleteTopic(id);
	}
}
