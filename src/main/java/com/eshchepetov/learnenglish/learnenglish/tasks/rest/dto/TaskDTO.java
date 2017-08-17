package com.eshchepetov.learnenglish.learnenglish.tasks.rest.dto;

/**
 * Created by eugeneshchepetov on 8/9/17.
 */
public class TaskDTO {
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    private String name;
    private String description;
}
