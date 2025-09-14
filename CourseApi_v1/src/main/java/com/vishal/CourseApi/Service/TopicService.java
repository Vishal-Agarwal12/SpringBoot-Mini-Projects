package com.vishal.CourseApi.Service;

import com.vishal.CourseApi.Model.Topic;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;


@Service
public class TopicService {

    private List<Topic> topics = new ArrayList<>(Arrays.asList(
            new Topic(1L, "Spring Boot", "Introduction to Spring Boot"),
            new Topic(2L, "Java", "Core Java concepts"),
            new Topic(3L, "REST API", "Designing RESTful APIs")
    ));


    public List<Topic> getTopics() {
        return topics;
    }


    public Topic getTopicById(@PathVariable Long id) {
        for (Topic x : topics) {
            if(x.getId().equals(id)) {
                return x;
            }
        }

        return (Topic) null;
    }


    public Topic createTopic(@RequestBody Topic topic) {
        topics.add(topic);
        return topic;
    }

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


    public void deleteTopic(@PathVariable Long id) {
        for (int i = 0; i < topics.size(); i++) {
            if (topics.get(i).getId().equals(id)) {
                topics.remove(i);
                return;
            }
        }
    }

}
