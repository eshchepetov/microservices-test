package com.eshchepetov.learnenglish.learnenglish.tasks.service;

import com.eshchepetov.learnenglish.learnenglish.tasks.domain.Task;
import com.eshchepetov.learnenglish.learnenglish.tasks.rest.dto.TaskDTO;

import java.util.List;

/**
 * Created by eugeneshchepetov on 8/8/17.
 */
public interface ITaskService {
    List<Task> getAllTasks();
    Task addTask(Task task);

}
