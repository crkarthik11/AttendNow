package com.thinkxfactor.attendNow.repositories;

import com.thinkxfactor.attendNow.domain.Student;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StudentRepository extends JpaRepository<Student, Long> {

    Student findByName(String name);

}
