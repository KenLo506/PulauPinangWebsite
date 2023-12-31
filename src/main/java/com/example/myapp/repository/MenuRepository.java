package com.example.myapp.repository;

import com.example.myapp.model.Menu;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MenuRepository extends JpaRepository<Menu, Long> {
    // Add custom queries if needed
}