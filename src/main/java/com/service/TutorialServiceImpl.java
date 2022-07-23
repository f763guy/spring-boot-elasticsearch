package com.service;

import com.repository.TutorialRepository;
import com.model.Tutorial;
import org.springframework.stereotype.Service;


import java.util.List;
import java.util.Optional;

@Service
public class TutorialServiceImpl implements TutorialService{

    private TutorialRepository tutorialRepository;

    public TutorialServiceImpl(TutorialRepository tutorialRepository) {
        this.tutorialRepository = tutorialRepository;
    }

    @Override
    public Tutorial save(Tutorial tutorial) {
        Tutorial _tutorial = tutorialRepository.save(tutorial);
        return _tutorial;
    }

    @Override
    public Optional<Tutorial> findById(Long id) {
        Optional<Tutorial> _Tutorial= tutorialRepository.findById(id);
        return _Tutorial;
    }

    @Override
    public List<Tutorial> findByDescription(String description) {
        List<Tutorial>  _Tutorial= tutorialRepository.findByDescription(description);
        return _Tutorial;
    }

}
