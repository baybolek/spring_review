package com.domain.repository;

import com.domain.entity.Department;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface DepartmentRepository extends JpaRepository<Department, Long> {

//    Display all divisions in the furniture department
    List<Department> findAByDepartment(String department);

//    Display all departments in health division
    List<Department> findByDivisionEquals(String division);

    List<Department> findByDivisionIs(String division);

//    Display top 3 departments with division name includes 'Hea' without duplicates
    List<Department> findDistinctTop2ByDivisionContaining(String department);



}
