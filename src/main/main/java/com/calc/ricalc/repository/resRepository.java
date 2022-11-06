package com.calc.ricalc.repository;

import com.calc.ricalc.entity.res;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.data.repository.CrudRepository;

@EnableJpaRepositories
public interface resRepository extends JpaRepository<res, Long> {


    res findByUser111(String user111);
}