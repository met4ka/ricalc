package com.calc.ricalc.repo;

import com.calc.ricalc.models.res;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.data.repository.CrudRepository;

@EnableJpaRepositories
public interface resRepository extends CrudRepository<res, Long> {
}