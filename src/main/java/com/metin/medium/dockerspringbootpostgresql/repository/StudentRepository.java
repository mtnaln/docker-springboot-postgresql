package com.metin.medium.dockerspringbootpostgresql.repository;

import com.metin.medium.dockerspringbootpostgresql.model.Student;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StudentRepository extends JpaRepository<Student, Long> { }
