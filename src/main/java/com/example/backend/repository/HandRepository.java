package com.example.backend.repository;

import com.example.backend.model.Hand;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface HandRepository extends JpaRepository<Hand, Integer> {
}
