package com.travel.agency.controller;

import com.travel.agency.domain.dto.AppProblemDto;
import com.travel.agency.facade.AppProblemFacade;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/v1/problem")
@RequiredArgsConstructor
public class AppProblemController {

    private final AppProblemFacade appProblemFacade;

    @PostMapping
    public void createProblem(@RequestBody AppProblemDto appProblemDto) {
        appProblemFacade.createProblem(appProblemDto);
    }

    @DeleteMapping
    public void deleteProblem(@RequestParam Long problemId) {
        appProblemFacade.deleteProblem(problemId);
    }

    @GetMapping
    public List<AppProblemDto> getProblems() {
        return appProblemFacade.getProblems();
    }
}
