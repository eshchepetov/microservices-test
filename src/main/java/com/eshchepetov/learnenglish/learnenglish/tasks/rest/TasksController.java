package com.eshchepetov.learnenglish.learnenglish.tasks.rest;

import com.eshchepetov.learnenglish.learnenglish.tasks.domain.Task;
import com.eshchepetov.learnenglish.learnenglish.tasks.rest.converter.TaskConverter;
import com.eshchepetov.learnenglish.learnenglish.tasks.rest.dto.TaskDTO;
import com.eshchepetov.learnenglish.learnenglish.tasks.service.ITaskService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.stream.Collectors;

/**
 * Created by eugeneshchepetov on 8/8/17.
 */
@RestController
@RequestMapping("/tasks")
public class TasksController {

    @Autowired
    private ITaskService taskService;

    @Autowired
    private TaskConverter taskConverter;

    @RequestMapping(method = RequestMethod.GET)
    public List<TaskDTO> home() {
        List<Task> tasks = taskService.getAllTasks();
        return tasks.stream().map(taskConverter::convertToDto).collect(Collectors.toList());
    }

    @RequestMapping(method = RequestMethod.POST)
    @ResponseBody
    @ResponseStatus(HttpStatus.CREATED)
    public TaskDTO postTask(@RequestBody TaskDTO taskDTO) {
        Task task = taskConverter.convertToDomain(taskDTO);
        taskService.addTask(task);
        return taskDTO;
    }
}
