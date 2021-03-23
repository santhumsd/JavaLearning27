package io.javabrainssrpingboot.course;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class CourseService {
	
	@Autowired
	private CourseRepository courseRepo;

    public List<Course> getAllCourses(String topicId){
   	List<Course> courses=new ArrayList<>();
   	courseRepo.findByTopicId(topicId).forEach(courses::add);
	return courses;
    	
    }
    public Course getCourse(String topicId, String id) {
    	 System.out.println("hi man"+courseRepo.findById(id));
    	
    	return courseRepo.findById(id).get();
         	
    }
	public void addCourse(Course course) {
		
		System.out.println(course);
		courseRepo.save(course);
		
	}
	public void updateCourse(Course course) {
		courseRepo.save(course);
		
	}
	public void deleteCourse(String id) {
		courseRepo.deleteById(id);
		//topics.removeIf(t->t.getId().equals(id));
	}
}
