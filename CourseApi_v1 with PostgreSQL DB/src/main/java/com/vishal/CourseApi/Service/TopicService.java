package com.vishal.CourseApi.Service;

import com.vishal.CourseApi.Model.Topic;
import com.vishal.CourseApi.Repository.TopicRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;


@Service
public class TopicService {

    @Autowired
    private final TopicRepo topicRepo;


    public TopicService(TopicRepo topicRepo) {
        this.topicRepo = topicRepo;
    }


    public List<Topic> getTopics() {
        return topicRepo.findAll();
    }


    public Topic getTopicById(Long id) {
        return topicRepo.findById(id).orElse(null);
    }

    public Topic createTopic(Topic topic) {
        return topicRepo.save(topic);
    }

    public Topic updateTopic(Long id, Topic topic) {
        Optional<Topic> existing = topicRepo.findById(id);
        if (existing.isPresent()) {
            Topic t = existing.get();
            t.setTitle(topic.getTitle());
            t.setDescription(topic.getDescription());
            return topicRepo.save(t);
        }
        return null;
    }

    public void deleteTopic(Long id) {
        topicRepo.deleteById(id);
    }

}
