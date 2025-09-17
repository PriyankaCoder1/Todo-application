package com.app.totoapp.controller;

import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import com.app.totoapp.services.Taskservice;
import com.app.totoapp.models.Task;

@Controller
public class Taskcontroller {

    private final Taskservice taskservice;

    public Taskcontroller(Taskservice taskservice) {
        this.taskservice = taskservice;
    }

    @GetMapping("/")
    public String getTasks(Model model) {
        List<Task> tasks = taskservice.getAllTasks();
        model.addAttribute("tasks", tasks);
        model.addAttribute("task", new Task());
        return "tasks";
    }

    @PostMapping("/add")
    public String addTask(@ModelAttribute Task task) {
        taskservice.saveTask(task);
        return "redirect:/";
    }

    @GetMapping("/delete/{id}")
    public String deleteTask(@PathVariable Long id) {
        taskservice.deleteTask(id);
        return "redirect:/";
    }

    @GetMapping("/toggle/{id}")
    public String toggleTask(@PathVariable Long id) {
        taskservice.toggleTaskCompleted(id);
        return "redirect:/";
    }
}
