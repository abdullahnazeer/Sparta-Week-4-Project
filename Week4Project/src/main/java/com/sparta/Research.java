package com.sparta;

public class Research extends Employee implements Department{
    public Research(int emp_no, String birth_date, String first_name, String last_name, char gender, String hire_date) {
        super(emp_no, birth_date, first_name, last_name, gender, hire_date);
    }

    @Override
    public void job() {
        System.out.println("I am part of Research");
    }
}
