package com.travel.agency.controller;

import com.travel.agency.domain.dto.AppProblemDto;
import com.travel.agency.service.AppProblemService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/v1/problem")
@RequiredArgsConstructor
public class AppProblemController {

    private final AppProblemService appProblemService;

    @PostMapping
    public void createProblem(@RequestBody AppProblemDto appProblemDto) {
        appProblemService.saveProblem(appProblemDto);
    }

    @DeleteMapping
    public void deleteProblem(@RequestParam Long problemId) {
        appProblemService.removeProblem(problemId);
    }

    @GetMapping
    public List<AppProblemDto> getProblems() {
        return appProblemService.getProblems();
    }
}
