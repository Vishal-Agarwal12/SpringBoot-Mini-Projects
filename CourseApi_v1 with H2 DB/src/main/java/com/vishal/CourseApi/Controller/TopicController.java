package com.vishal.CourseApi.Controller;

import com.vishal.CourseApi.Model.Topic;
import com.vishal.CourseApi.Service.TopicService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;



@RestController
public class TopicController {


    // Dependency Injection
    @Autowired
    private TopicService topicService;



    @GetMapping("/topics")
    public List<Topic> getTopics() {
        return topicService.getTopics();
    }


    @GetMapping("/topics/{id}")
    public Topic getTopicById(@PathVariable Long id) {
        return  topicService.getTopicById(id);
    }


    @PostMapping("/topics")
    public Topic createTopic(@RequestBody Topic topic) {
        return  topicService.createTopic(topic);
    }

    @PutMapping("/topics/{id}")
    public Topic updateTopic(@PathVariable Long id, @RequestBody Topic topic) {
        return  topicService.updateTopic(id, topic);
    }


    @DeleteMapping("/topics/{id}")
    public void deleteTopic(@PathVariable Long id) {
        topicService.deleteTopic(id);
    }

}
