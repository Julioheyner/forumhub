package com.forumhub.api.service;

import com.forumhub.api.model.Topic;
import com.forumhub.api.repository.TopicRepository;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;
import java.util.Optional;

public class TopicService {
    @Autowired
    private TopicRepository topicRepository;

    public List<Topic> findAll() {
        return topicRepository.findAll();
    }

    public Optional<Topic> findById(Long id) {
        return topicRepository.findById(id);
    }

    public Topic save(Topic topic) {
        return topicRepository.save(topic);
    }

    public void deleteById(Long id) {
        topicRepository.deleteById(id);
    }
}
