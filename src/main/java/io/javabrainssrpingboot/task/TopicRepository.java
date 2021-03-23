/**
 * 
 */
package io.javabrainssrpingboot.task;

import org.springframework.data.repository.CrudRepository;

import org.springframework.stereotype.Repository;

@Repository
public interface TopicRepository extends CrudRepository<Topic, String> {

	Topic findByName(String name);

	
    //findAll()
    //findById(id)
    //save(topic)
}
