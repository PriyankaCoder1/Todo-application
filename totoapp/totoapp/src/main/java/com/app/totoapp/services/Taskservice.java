package com.app.totoapp.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.app.totoapp.models.Task;
import com.app.totoapp.repositories.Taskrepository;

@Service
public class Taskservice {
    private final Taskrepository taskrepository;

    @Autowired
    public Taskservice(Taskrepository taskrepository) {
        this.taskrepository = taskrepository;
    }

    public List<Task> getAllTasks() {
        return taskrepository.findAll();
    }

    public Task saveTask(Task task) {
        return taskrepository.save(task);
    }

    public void deleteTask(Long id) {
        taskrepository.deleteById(id);
    }

    public void toggleTaskCompleted(Long id) {
        Task task = taskrepository.findById(id).orElse(null);
        if (task != null) {
            task.setCompleted(!task.isCompleted());
            taskrepository.save(task);
        }
    }
}
