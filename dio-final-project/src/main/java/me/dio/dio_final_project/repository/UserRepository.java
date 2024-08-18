package me.dio.dio_final_project.repository;

import me.dio.dio_final_project.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {
}

