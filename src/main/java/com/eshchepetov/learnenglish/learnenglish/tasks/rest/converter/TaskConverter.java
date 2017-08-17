package com.eshchepetov.learnenglish.learnenglish.tasks.rest.converter;

import com.eshchepetov.learnenglish.learnenglish.tasks.domain.Task;
import com.eshchepetov.learnenglish.learnenglish.tasks.rest.dto.TaskDTO;
import org.springframework.stereotype.Component;

/**
 * Created by eugeneshchepetov on 8/9/17.
 */
@Component
public class TaskConverter {

    public TaskDTO convertToDto(Task task) {
        TaskDTO taskDto = new TaskDTO();
        taskDto.setName(task.getName());
        taskDto.setDescription(task.getDescription());
        return taskDto;
    }

    public Task convertToDomain(TaskDTO taskDto) {
        Task task = new Task();
        task.setName(taskDto.getName());
        task.setDescription(taskDto.getDescription());
        return task;
    }
}

