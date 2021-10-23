package com.travel.agency.repository;

import com.travel.agency.domain.AppProblem;
import com.travel.agency.domain.dto.AppProblemDto;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Repository
@Transactional
public interface AppProblemDao extends CrudRepository<AppProblem, Long> {

    List<AppProblem> findAll();
}
