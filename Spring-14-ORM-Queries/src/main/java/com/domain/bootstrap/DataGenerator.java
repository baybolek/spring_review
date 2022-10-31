package com.domain.bootstrap;

import com.domain.repository.DepartmentRepository;
import com.domain.repository.EmployeeRepository;
import com.domain.repository.RegionRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;


@Component
public class DataGenerator implements CommandLineRunner {

    private final RegionRepository regionRepository;
    private final DepartmentRepository departmentRepository;
    private final EmployeeRepository employeeRepository;

    public DataGenerator(RegionRepository regionRepository, DepartmentRepository departmentRepository, EmployeeRepository employeeRepository) {
        this.regionRepository = regionRepository;
        this.departmentRepository = departmentRepository;
        this.employeeRepository = employeeRepository;
    }

    @Override
    public void run(String... args) throws Exception {


        System.out.println("-----------------------------------------REGION START--------------------------------");

        System.out.println("findByCountry: " + regionRepository.findByCountry("United States"));
        System.out.println("findDistinctByCountry: " + regionRepository.findDistinctByCountry("Canada"));
        System.out.println("findByCountryContaining: " + regionRepository.findByCountryContaining("United"));

        System.out.println("findByCountryContainingOrderByRegion: " + regionRepository.findByCountryContainingOrderByRegion("United"));
        System.out.println("findByCountryContainingOrderByCountry: " + regionRepository.findByCountryContainingOrderByCountry("United"));
        System.out.println("findTop2ByCountry: " +regionRepository.findTop2ByCountry("United States"));

        System.out.println("-----------------------------------------REGION END--------------------------------");
        System.out.println("-----------------------------------------DEPARTMENT START--------------------------------");

        System.out.println("findAByDepartment: " + departmentRepository.findAByDepartment("Toys"));
        System.out.println("findByDivisionEquals:" + departmentRepository.findByDivisionEquals("Health"));
        System.out.println("findByDivisionIs: " + departmentRepository.findByDivisionIs("Health"));
        System.out.println("findDistinctTop2ByDivisionContaining: " + departmentRepository.findDistinctTop2ByDivisionContaining("Hea"));

        System.out.println("-----------------------------------------DEPARTMENT END--------------------------------");
        System.out.println("-----------------------------------------EMPLOYEE START--------------------------------");

//        System.out.println("findEmployeeByEmailIsNotNull: " + employeeRepository.findEmployeeByEmailIsNotNull());
        System.out.println(employeeRepository.findByEmail(null));
//        System.out.println("findByFirstNameIsAndLastNameIsAndEmailIsNotNull: " + employeeRepository.findByFirstNameAndLastNameOrEmail());

        System.out.println("-----------------------------------------EMPLOYEE END--------------------------------");



    }
}
