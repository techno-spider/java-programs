package stream;

import java.util.ArrayList;
import java.util.Map;
import java.util.stream.Collectors;


public class StreamAPIExample {

    static ArrayList<Emp> employees = new ArrayList<Emp>();

    public static void main(String[] args) {

        employees.add(new Emp(199, "Amelia Joe", 24, "Female", "Sales And Marketing", 2016, 11500.0));
        employees.add(new Emp(200, "Jaden Dough", 38, "Male", "Security And Transport", 2016, 11000.5));
        employees.add(new Emp(211, "Jasna Kaur", 27, "Female", "Infrastructure", 2014, 15700.0));
        employees.add(new Emp(222, "Nitin Joshi", 25, "Male", "Product Development", 2016, 28200.0));
        employees.add(new Emp(233, "Jyothi Reddy", 27, "Female", "Account And Finance", 2013, 21300.0));
        employees.add(new Emp(244, "Nicolus Den", 24, "Male", "Sales And Marketing", 2017, 10700.0));
        employees.add(new Emp(255, "Alia Baig", 23, "Male", "Infrastructure", 2018, 12700.0));
        employees.add(new Emp(266, "Sanvi Pandey", 26, "Female", "Product Development", 2015, 28900.0));
        employees.add(new Emp(277, "Amelia Joe", 31, "Male", "Product Development", 2012, 35700.0));

        // How many male and female employees are there in the organization
        method1();
        System.out.println("\n");

        // Print the name of all departments
		//method2();
        System.out.println("\n");

        // What is the average age of female and male employees
//		method3();
        System.out.println("\n");

        // get the details of highest paid employee
//		method4();
        System.out.println("\n");

        // get the names of all employees who have joined after 2015
//		method5();
        System.out.println("\n");

        // count the number of employees in each department
//		method6();
        System.out.println("\n");

        // what is the average salary of each department
//		method7();
        System.out.println("\n");

        // get the details of youngest male employee in the product development department
//		method8();
        System.out.println("\n");

        // Who has the most working experience in the organization
//		method9();
        System.out.println("\n");

        // how many male and female employees are there in the sales and marketing team
//		method10();
        System.out.println("\n");

        // What is the average salary of male and female employee
//		method11();
        System.out.println("\n");

        // List down the names of all employees in each department
//		method12();
        System.out.println("\n");

        // What is the average salary and total salary of the whole organization
//		method13();
        System.out.println("\n");

        // Separate the employees who are younger or equal to 25 years from those
        // employees who are older than 25 years
//		method14();
        System.out.println("\n");

        // Who is the oldest employee in the organization? What is his age? and Which
        // department he belongs to?
//		method15();
        System.out.println("\n");

        //Find the second highest salary
//		method16();
        System.out.println("\n");
    }

    private static void method1() {
        System.out.println("male and female employees in the organization");

        Map<String, Long> collect = employees.stream()
                                             .collect(Collectors.groupingBy(Emp::getGender, Collectors.counting()));
        System.out.println(collect);
    }

}


/**
 * OUTPUT:
 * -------
 * <p>
 * male and female employees in the organization
 * {Male=5, Female=4}
 * <p>
 * <p>
 * Print the name of all departments
 * Sales And Marketing
 * Security And Transport
 * Infrastructure
 * Product Development
 * Account And Finance
 * <p>
 * <p>
 * What is the average age of female and male employees
 * {Male=28.2, Female=26.0}
 * <p>
 * <p>
 * get the details of highest paid employee
 * Employee [id=277, name=Amelia Joe, age=31, gender=Male, department=Product Development, yearOfJoining=2012, salary=35700.0]
 * <p>
 * <p>
 * get the names of all employees who have joined after 2015
 * Amelia Joe
 * Jaden Dough
 * Nitin Joshi
 * Nicolus Den
 * Alia Baig
 * <p>
 * <p>
 * count the number of employees in each department
 * Product Development : 3
 * Security And Transport : 1
 * Sales And Marketing : 2
 * Infrastructure : 2
 * Account And Finance : 1
 * <p>
 * <p>
 * what is the average salary of each department
 * Product Development : 30933.333333333332
 * Security And Transport : 11000.5
 * Sales And Marketing : 11100.0
 * Infrastructure : 14200.0
 * Account And Finance : 21300.0
 * <p>
 * <p>
 * get the details of youngest male employee in the product development department
 * Employee [id=222, name=Nitin Joshi, age=25, gender=Male, department=Product Development, yearOfJoining=2016, salary=28200.0]
 * <p>
 * <p>
 * Who has the most working experience in the organization
 * -------------------------------------------
 * ID: 277
 * Name: Amelia Joe
 * Joining Year: 2012
 * <p>
 * <p>
 * how many male and female employees are there in the sales and marketing team
 * {Male=1, Female=1}
 * <p>
 * <p>
 * What is the average salary of male and female employee
 * {Male=19660.1, Female=19350.0}
 * <p>
 * <p>
 * List down the names of all employees in each department
 * <p>
 * Employees in Product Development :
 * ------------------------------
 * Name: Nitin Joshi
 * Name: Sanvi Pandey
 * Name: Amelia Joe
 * <p>
 * Employees in Security And Transport :
 * ------------------------------
 * Name: Jaden Dough
 * <p>
 * Employees in Sales And Marketing :
 * ------------------------------
 * Name: Amelia Joe
 * Name: Nicolus Den
 * <p>
 * Employees in Infrastructure :
 * ------------------------------
 * Name: Jasna Kaur
 * Name: Alia Baig
 * <p>
 * Employees in Account And Finance :
 * ------------------------------
 * Name: Jyothi Reddy
 * <p>
 * <p>
 * What is the average salary and total salary of the whole organization
 * Average Salary: 19522.277777777777
 * Total Salary: 175700.5
 * <p>
 * <p>
 * Separate the employees who are younger or equal to 25 years from those employees who are older than 25 years
 * --------------------------------------
 * Employees Younger than or equal to 25 years
 * ------------------------------------
 * Amelia Joe
 * Nitin Joshi
 * Nicolus Den
 * Alia Baig
 * --------------------------------------
 * Employees Older Than 25 Years :
 * ------------------------------------
 * Jaden Dough
 * Jasna Kaur
 * Jyothi Reddy
 * Sanvi Pandey
 * Amelia Joe
 * <p>
 * <p>
 * Who is the oldest employee in the organization? What is his age? and Which department he belongs to?
 * Name: Jaden Dough
 * Age: 38
 * Department: Security And Transport
 * <p>
 * <p>
 * Find the second highest salary
 * Name: Sanvi Pandey
 * Salary: 28900.0
 */