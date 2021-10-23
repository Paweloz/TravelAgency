package com.travel.agency.mapper;

import com.travel.agency.domain.AppProblem;
import com.travel.agency.domain.dto.AppProblemDto;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.stream.Collectors;

@Component
public class AppProblemMapper {

    public AppProblem mapProblemDtoToProblem(AppProblemDto appProblemDto) {
        return new AppProblem(
                appProblemDto.getProblemType(),
                appProblemDto.getLocalDateTime()
        );
    }

    public AppProblemDto mapProblemToProblemDto(AppProblem appProblem) {
        return new AppProblemDto(
                appProblem.getId(),
                appProblem.getProblemType(),
                appProblem.getLocalDateTime()
        );
    }

    public List<AppProblemDto> mapProblemToProblemDtoList(List<AppProblem> appProblems) {
        return appProblems.stream()
                .map(this::mapProblemToProblemDto)
                .collect(Collectors.toList());
    }
}
