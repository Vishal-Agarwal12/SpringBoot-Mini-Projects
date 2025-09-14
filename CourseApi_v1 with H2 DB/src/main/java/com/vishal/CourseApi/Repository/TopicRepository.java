package com.vishal.CourseApi.Repository;
import org.springframework.data.jpa.repository.JpaRepository;
import com.vishal.CourseApi.Model.Topic;
import org.springframework.stereotype.Repository;


@Repository
public interface TopicRepository extends JpaRepository<Topic, Long> {
    // no need to write anything, basic CRUD is ready!

}
