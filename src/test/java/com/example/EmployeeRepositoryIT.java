package com.example;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.assertEquals;

@SpringBootTest
class EmployeeRepositoryIT {

    @Autowired
    private EmployeeRepository repository;

    @Test
    void createAndFindAll() {
        var employee = new Employee();
        employee.setName("Peter");

        repository.saveAndFlush(employee);

        var employees = repository.findAll();

        assertEquals(1, employees.size());
    }

}
