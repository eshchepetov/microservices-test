package com.eshchepetov.learnenglish.learnenglish.tasks.repository;

import com.eshchepetov.learnenglish.learnenglish.tasks.domain.Task;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * Created by eugeneshchepetov on 8/8/17.
 */
@Repository
public interface ITaskRepository extends CrudRepository<Task, Long> {
}
