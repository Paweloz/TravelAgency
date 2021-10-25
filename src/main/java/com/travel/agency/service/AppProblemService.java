package com.travel.agency.service;

import com.travel.agency.domain.AppProblem;
import com.travel.agency.domain.dto.AppProblemDto;
import com.travel.agency.mapper.AppProblemMapper;
import com.travel.agency.repository.AppProblemDao;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.util.List;

@Service
@RequiredArgsConstructor
public class AppProblemService {

    private final AppProblemDao appProblemDao;
    private final AppProblemMapper appProblemMapper;

    public void saveProblem(String problem) {
        AppProblem appProblem = new AppProblem(problem, LocalDateTime.now());
        appProblemDao.save(appProblem);

    }

    public void saveProblem(AppProblemDto appProblemDto) {
        appProblemDao.save(appProblemMapper.mapProblemDtoToProblem(appProblemDto));
    }

    public List<AppProblemDto> getProblems() {
        return appProblemMapper.mapProblemToProblemDtoList(appProblemDao.findAll());
    }

    public void removeProblem(Long problemId) {
        appProblemDao.deleteById(problemId);
    }
}
