package com.vishal.CourseApi.Controller;

import com.vishal.CourseApi.Model.Topic;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;



@RestController
public class TopicController {

    private List<Topic> topics = new ArrayList<>();

    public TopicController() {
        topics.add(new Topic(1L, "Spring Boot", "Introduction to Spring Boot"));
        topics.add(new Topic(2L, "Java", "Core Java concepts"));
        topics.add(new Topic(3L, "REST API", "Designing RESTful APIs"));
    }

    @GetMapping("/topics")
    public List<Topic> getTopics() {
        return topics;
    }


    @GetMapping("/topics/{id}")
    public Topic getTopicById(@PathVariable Long id) {
        for (Topic x : topics) {
            if(x.getId().equals(id)) {
                return x;
            }
        }

        return (Topic) null;
    }


    @PostMapping("/topics")
    public Topic createTopic(@RequestBody Topic topic) {
        topics.add(topic);
        return topic;
    }

    @PutMapping("/topics/{id}")
    public Topic updateTopic(@PathVariable Long id, @RequestBody Topic topic) {
        for(Topic x : topics) {
            if(x.getId().equals(id)) {
                x.setTitle(topic.getTitle());
                x.setDescription(topic.getDescription());

                return topic;
            }
        }

        return (Topic) null;
    }


    @DeleteMapping("/topics/{id}")
    public void deleteTopic(@PathVariable Long id) {
        for (int i = 0; i < topics.size(); i++) {
            if (topics.get(i).getId().equals(id)) {
                topics.remove(i);
                return;
            }
        }
    }

}
