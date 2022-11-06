package com.calc.ricalc.repository;

import com.calc.ricalc.entity.post;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@EnableJpaRepositories
public interface postRepository extends JpaRepository<post, Long> {
}
