package com.calc.ricalc.repo;

import com.calc.ricalc.models.post;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.data.repository.CrudRepository;

@EnableJpaRepositories
public interface postRepository extends CrudRepository<post, Long> {
}
