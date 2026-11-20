package org.mckv.librarymanagement.repositories;




import org.mckv.librarymanagement.entitities.Student;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface StudentRepository extends JpaRepository<Student, Integer>{

	// Check whether an email already exists
    boolean existsByEmail(String email);

}
