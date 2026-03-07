package kh.edu.paragoniu.helloworldwebapp.repository;

import kh.edu.paragoniu.helloworldwebapp.model.Task;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TaskRepository extends JpaRepository<Task, Long> {

}