package kaz.suleimenov.spring_course_zt.springboot.springboot_rest.service;

import kaz.suleimenov.spring_course_zt.springboot.springboot_rest.entity.Employee;

import java.util.List;

public interface EmployeeService {
    public List<Employee> getAllEmployees();

    public void saveEmployee(Employee employee);

    public Employee getEmployee(int id);

    public void deleteEmployee(int id);
}
