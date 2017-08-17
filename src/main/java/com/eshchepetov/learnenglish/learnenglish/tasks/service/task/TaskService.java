package com.eshchepetov.learnenglish.learnenglish.tasks.service.task;

import com.eshchepetov.learnenglish.learnenglish.tasks.domain.Task;
import com.eshchepetov.learnenglish.learnenglish.tasks.repository.ITaskRepository;
import com.eshchepetov.learnenglish.learnenglish.tasks.rest.dto.TaskDTO;
import com.eshchepetov.learnenglish.learnenglish.tasks.service.ITaskService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Arrays;
import java.util.List;

/**
 * Created by eugeneshchepetov on 8/8/17.
 */

@Service
public class TaskService implements ITaskService {

    @Autowired
    ITaskRepository taskRepository;

    @Override
    public List<Task> getAllTasks() {
        return (List<Task>)taskRepository.findAll();
    }

    @Override
    public Task addTask(Task task) {
        taskRepository.save(task);
        return task;
    }
}
