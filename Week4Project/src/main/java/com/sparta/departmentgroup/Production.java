package com.sparta.departmentgroup;

import com.sparta.Department;
import com.sparta.Employee;

import java.time.LocalDate;

public class Production extends Employee implements Department {


    public Production(int emp_no, LocalDate birth_date, String first_name, String last_name, char gender, LocalDate hire_date) {
        super(emp_no, birth_date, first_name, last_name, gender, hire_date);
    }

    @Override
    public void job() {
        System.out.println("I am part of Production");
    }
}