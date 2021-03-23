package io.javabrainssrpingboot.course;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import io.javabrainssrpingboot.exception.InvalidBodyException;
import io.javabrainssrpingboot.task.Topic;

@RestController
@RequestMapping("/topiccs/{topicId}")
public class CourseController {
	//0/topics/kython/courses

	@Autowired
	private CourseService courseService;
	@GetMapping("/")
	public String getmat() {
		if(true) {
			
				throw new InvalidBodyException("yeah man you did it its jus an error");
			
		}
		return "hello";
	
	}
	@GetMapping("/courses")
	public List<Course> getAllCourses(@PathVariable String topicId) {
		System.out.println("Rest Controller CourseController class inside san");
		return courseService.getAllCourses(topicId);
				}
	//@RequestMapping("/courses/{id}")
	@GetMapping("/courses/{id}")
	public Course getCourse(@PathVariable String topicId,@PathVariable String id) {
		System.out.println("hi man controller");
		return courseService.getCourse(topicId,id);
				}
	//@RequestMapping(method=RequestMethod.POST,value="/courses")
	@PostMapping("/courses")
	public void addCourse(@RequestBody Course course,@PathVariable String topicId) {
		System.out.println("*************************************************");
		course.setTopic(new Topic(topicId,"",""));
		courseService.addCourse(course);
	}
	
	//@RequestMapping(method=RequestMethod.PUT,value="/courses")
	@PutMapping("/courses")
	public void updateCourse(@RequestBody Course course,@PathVariable String topicId) {
		course.setTopic(new Topic(topicId,"",""));
		courseService.updateCourse(course);
	}
	//@RequestMapping(method=RequestMethod.DELETE,value="/courses/Id")
	@DeleteMapping("/courses/Id")
	public void deleteCourse(@PathVariable String topicId,@PathVariable String id) {
		courseService.deleteCourse(id);
	}
//	@ExceptionHandler
//	@ResponseStatus(value=HttpStatus.BAD_REQUEST)
//	public String exceptionHandler(Exception e) {
//		return "invalid body";
//	}
}
