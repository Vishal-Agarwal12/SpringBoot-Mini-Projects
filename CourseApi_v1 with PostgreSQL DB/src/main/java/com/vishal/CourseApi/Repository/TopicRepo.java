package com.vishal.CourseApi.Repository;


import com.vishal.CourseApi.Model.Topic;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface  TopicRepo extends JpaRepository<Topic, Long> {
    // you can add custom queries if needed
}
