package com.evansky.demo;

/**
 * Simple Java Application
 */
public class App {
    public static void main(String[] args) {
        System.out.println("Hello, Evansky Demo Application!");
        
        // 演示计算器功能
        App app = new App();
        System.out.println("1 + 2 = " + app.add(1, 2));
        System.out.println("5 - 3 = " + app.subtract(5, 3));
        System.out.println("4 × 3 = " + app.multiply(4, 3));
        System.out.println("10 ÷ 2 = " + app.divide(10, 2));
    }
    
    /**
     * Returns a greeting message
     * @param name Name to greet
     * @return Greeting message
     */
    public String greet(String name) {
        return "Hello, " + name + "!";
    }
    
    /**
     * Adds two numbers
     * @param a First number
     * @param b Second number
     * @return Sum of a and b
     */
    public int add(int a, int b) {
        return a + b;
    }
    
    /**
     * Subtracts second number from the first
     * @param a First number
     * @param b Second number
     * @return Difference (a - b)
     */
    public int subtract(int a, int b) {
        return a - b;
    }
    
    /**
     * Multiplies two numbers
     * @param a First number
     * @param b Second number
     * @return Product of a and b
     */
    public int multiply(int a, int b) {
        return a * b;
    }
    
    /**
     * Divides first number by the second
     * @param a First number (dividend)
     * @param b Second number (divisor)
     * @return Quotient of a divided by b
     * @throws ArithmeticException if b is zero
     */
    public double divide(double a, double b) {
        if (b == 0) {
            throw new ArithmeticException("Division by zero is not allowed");
        }
        return a / b;
    }
}