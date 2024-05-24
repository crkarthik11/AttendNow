package com.thinkxfactor.attendNow.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import com.thinkxfactor.attendNow.domain.Student;

public interface StudentRepository extends JpaRepository<Student, Long> {

}
