package exercises.lab_07.lab_07_1;

import java.util.Arrays;

public class TestEmployeeController {
    public static void main(String[] args) {
        Employee ct1 = new CE();
        Employee ct2 = new CE();

        Employee fte1 = new FTE();
        Employee fte2 = new FTE();
        Employee fte3 = new FTE();
        int totalSalary = EmployeeController.getTotalSalary(Arrays.asList(ct1, ct2, fte1, fte2, fte3));
        System.out.println("Total salary is: " + totalSalary);
    }
}
