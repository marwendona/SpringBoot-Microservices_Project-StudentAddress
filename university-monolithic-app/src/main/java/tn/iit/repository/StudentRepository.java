package tn.iit.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import tn.iit.entity.Student;

@Repository
public interface StudentRepository extends JpaRepository<Student, Long> {

	
	
}
