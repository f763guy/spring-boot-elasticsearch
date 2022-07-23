package com.service;

import com.model.Tutorial;


import java.util.List;
import java.util.Optional;


public interface TutorialService {

    Tutorial save(Tutorial tutorial);
    Optional<Tutorial> findById(Long id);
    List<Tutorial> findByDescription(String description);
}
