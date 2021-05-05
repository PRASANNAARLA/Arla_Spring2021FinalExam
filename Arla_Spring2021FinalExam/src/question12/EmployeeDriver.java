/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package question12;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

/**
 *
 * @author prasanna arla
 */
public class EmployeeDriver {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        ArrayList<Employee> employeeList = new ArrayList<Employee>();
        employeeList.add(new Employee(03, "prasanna", 11111.67));
        employeeList.add(new Employee(01, "pranathi", 10098.89));
        employeeList.add(new Employee(100, "kranthi", 87690.76));
        employeeList.add(new Employee(76, "vinay", 78965.50));
        employeeList.add(new Employee(111, "ammulu", 153762.45));
        System.out.println("Prasanna Arla ");
        System.out.println("Employees in original order:");
        for (Employee e : employeeList) {
            System.out.println(e);
        }
        System.out.println();

        Collections.sort(employeeList);
        System.out.println("Sorting by emp id: ");
        for (Employee e : employeeList) {
            System.out.println(e);
        }
        System.out.println();

        Collections.sort(employeeList, new Comparator<Employee>() {
            public int compare(Employee emp1, Employee emp2) {
                if (emp1.getEmpSalary() < emp2.getEmpSalary()) {
                    return -1;
                } else if (emp1.getEmpSalary() == emp2.getEmpSalary()) {
                    return 0;
                } else {
                    return +1;
                }
            }
        });
        System.out.println("Sorting by the salary:");
        for (Employee e : employeeList) {
            System.out.println(e);
        }
        System.out.println();

        Collections.sort(employeeList, new Comparator<Employee>() {
            public int compare(Employee emp1, Employee emp2) {

                return (emp1.getEmployeeName()).compareTo(emp2.getEmployeeName());
            }
        });
        System.out.println("Sorting by name: ");
        for (Employee e : employeeList) {
            System.out.println(e);
        }
        System.out.println();

    }

}
