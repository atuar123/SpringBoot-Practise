package com.mealmanagement.service;

import com.mealmanagement.model.Topic;
import org.springframework.stereotype.Service;

import java.util.Arrays;
import java.util.List;

@Service
public class TopicService {

     private List<Topic> topics = Arrays.asList(
            new Topic("1", "Framework","J2EE Application Development"),
            new Topic("2", "Framework","J2EE Application Development"),
            new Topic("3", "Framework","J2EE Application Development")
    );

    public List<Topic> getAllTopics() {
        return topics;
    }

    public Topic getTopic(String id){
        return topics.stream().filter(t -> t.getId().equals(id)).findFirst().get();
    }
}
