package com.task.service;

import com.task.dto.modelDto.EmployeeDto;

import java.util.List;

public interface EmpService {

    EmployeeDto FindByID (Long Id);
    List<EmployeeDto> getEmployeeList();
    EmployeeDto createNewEmployee(EmployeeDto employeeDto) ;
    EmployeeDto editEmployeeByDTO(EmployeeDto employeeDto);
    void deletEmplById(Long id);
    List<EmployeeDto> findByFirstName(String firstName);
    List<EmployeeDto> findByLastName(String lastName);
    List<EmployeeDto> findByFirstNameAndLastName(String firstName, String lastName);
    List<EmployeeDto> findByFirstNameAndAgeLessThan(String firstName);
    List<EmployeeDto> findByFirstNameOrLastName(String name);
}
