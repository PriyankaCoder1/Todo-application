package com.app.totoapp.repositories;
import com.app.totoapp.models.Task;
import org.springframework.data.jpa.repository.JpaRepository;
public interface Taskrepository extends JpaRepository<Task, Long> {

}
