package com.travel.agency.facade;

import com.travel.agency.domain.dto.AppProblemDto;
import com.travel.agency.service.AppProblemService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
@RequiredArgsConstructor
public class AppProblemFacade {

    private final AppProblemService appProblemService;

    public void createProblem(AppProblemDto appProblemDto) {
        appProblemService.saveProblem(appProblemDto);
    }

    public void deleteProblem(Long problemId) {
        appProblemService.removeProblem(problemId);
    }

    public List<AppProblemDto> getProblems() {
        return appProblemService.getProblems();
    }
}
