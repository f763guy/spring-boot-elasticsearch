package com.repository;

import com.model.Tutorial;
import org.springframework.data.elasticsearch.annotations.Query;
import org.springframework.data.elasticsearch.repository.ElasticsearchRepository;

import java.util.List;

public interface TutorialRepository extends ElasticsearchRepository<Tutorial, Long> {

    @Query("{\"match_phrase\":{\"description\":\"?0\"}}")
    List<Tutorial> findByDescription (String description);

}
