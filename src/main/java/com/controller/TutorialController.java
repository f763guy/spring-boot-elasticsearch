package com.controller;

import com.model.Tutorial;
import com.service.TutorialService;
import com.util.Result;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;


@RestController
@RequestMapping("/api")
public class TutorialController {

    private TutorialService tutorialService;

    public TutorialController(TutorialService tutorialService) {
        this.tutorialService = tutorialService;
    }

    @PostMapping("/tutorials")
    public Result createTutorial(@RequestBody Tutorial tutorial) {
        return new Result( tutorialService.save(tutorial));
    }

    @GetMapping("/tutorials/{id}")
    public Result getTutorialById (@PathVariable("id") long id) {
        Optional<Tutorial> _Tutorial = tutorialService.findById(id);
        if (_Tutorial.isPresent()) {
            Tutorial tutorial = _Tutorial.get();
            return new Result (tutorial);
        }
        return null;
    }

    @GetMapping("/tutorials/description")
    public Result SearchDescription(String description) {
        return new Result(tutorialService.findByDescription(description));
    }

}
