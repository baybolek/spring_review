package com.domain.repository;

import com.domain.entity.Employee;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.time.LocalDate;
import java.util.List;
import java.util.Optional;

import static org.hibernate.loader.Loader.SELECT;

@Repository
public interface EmployeeRepository extends JpaRepository<Employee, Long> {


//    Display all employees with email address
    List<Employee> findEmployeeByEmailIsNotNull();
    List<Employee> findByEmail(String email);

//    Display all employees with first name ' ' and last name ' ', also show all employees with an email

    List<Employee> findByFirstNameIsAndLastNameIsAndEmailIsNotNull(String firstName, String lastName);
    List<Employee> findByFirstNameAndLastNameOrEmail(String firstName, String lastName, String email);

//    Display all employees that first name is not ' '
    List<Employee> findEmployeeByFirstNameIsNot(String firstName);
    List<Employee> findByFirstNameIsNot(String firstName);

//    Display all employees where last name starts with ' '
    List<Employee> findByLastNameStartingWith(String pattern);

//    Display all employees with salaries higher than ' '
    List<Employee> findBySalaryGreaterThan(Integer salary);

//    Display all employees with salaries less than ' '
    List<Employee> findBySalaryLessThanEqual(Integer salary);

//    Display all employees that has been hired between ' ' date and ' ' date
    List<Employee> findByHireDateBetween(LocalDate startDate, LocalDate endDate);

//    Display all employees where salaries greater and equal to ' ' in order
    List<Employee> findBySalaryIsGreaterThanEqualOrderBySalaryDesc(Integer salary);

//    Display top unique 3 employees that is making less than ' '
    List<Employee> findDistinctTop3BySalaryLessThan(Integer salary);

//    Display all employees that don't have email address
    List<Employee> findByEmailIsNull();


//    ===========================JPQL Queries===============================================================

    @Query("SELECT e FROM Employee e WHERE e.email='dtrail8@tamu.edu'")
    Employee getEmployeeDetail();

    @Query("SELECT e.salary FROM Employee e WHERE e.email='dtrail8@tamu.edu'")
    Integer getEmployeeSalary();

//    passing parameters in queries

    @Query("SELECT e FROM Employee e WHERE e.email=?1")
    Optional<Employee> getEmployeeDetail(String email);

    @Query("SELECT e FROM Employee e WHERE e.email=?1 AND e.salary=?2")
    Optional<Employee> getEmployeeDetail(String email, Integer salary);


}
