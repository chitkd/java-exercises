package utils;

public class Calculator {
    // Method OVERLOADING
    public static int sum(int num1, int num2){
        return num1 + num2;
    }

    // Rest parameters (JS), Varagrs
    public static int sum(int ... nums){
        int total = 0;
        for (int num : nums) {
            total += num;
        }
        return total;
    }
}
