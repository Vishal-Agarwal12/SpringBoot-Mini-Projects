package com.vishal.CourseApi.Service;

import com.vishal.CourseApi.Model.Topic;
import com.vishal.CourseApi.Repository.TopicRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;


@Service
public class TopicService {

    @Autowired
    private TopicRepository repo;

//    private List<Topic> topics = new ArrayList<>(Arrays.asList(
//            new Topic(1L, "Spring Boot", "Introduction to Spring Boot"),
//            new Topic(2L, "Java", "Core Java concepts"),
//            new Topic(3L, "REST API", "Designing RESTful APIs")
//    ));


    public List<Topic> getTopics() {
        return repo.findAll();
    }


    public Topic getTopicById(@PathVariable Long id) {
        return repo.findById(id).get();
    }


    public Topic createTopic(@RequestBody Topic topic) {
        repo.save(topic);
        return topic;
    }

    public Topic updateTopic(@PathVariable Long id, @RequestBody Topic topic) {
        repo.save(topic);
        return topic;
    }


    public void deleteTopic(@PathVariable Long id) {
        repo.deleteById(id);
    }

}
