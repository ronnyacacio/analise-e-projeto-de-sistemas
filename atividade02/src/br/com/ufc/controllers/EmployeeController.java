package br.com.ufc.controllers;

import java.util.ArrayList;

import br.com.ufc.model.person.Employee;
import br.com.ufc.model.person.Manager;
import br.com.ufc.model.person.Person;
import br.com.ufc.model.person.SystemOperator;
import br.com.ufc.repository.PersonRepository;

public class EmployeeController {
  PersonRepository personRepository = new PersonRepository();

  public Employee login(String login, String pass, boolean isManager) {
    ArrayList<Employee> employees = this.listEmployees();

    for (Employee employee : employees) {
      if (login.equals(employee.getLogin()) && pass.equals(employee.getPassword())) {
        if (isManager && employee instanceof Manager)
          return employee;
        if (!isManager && employee instanceof SystemOperator)
          return employee;
      }
    }
    return null;
  }

  public ArrayList<Employee> listEmployees() {
    return personRepository.getEmployees();
  }
}
