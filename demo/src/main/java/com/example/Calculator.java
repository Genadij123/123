package com.example;

public class Calculator {
    private int a; 
    private int b; 
    private String operation; 
    public Calculator(int a, int b, String operation) 
    { 
        this.a = a; 
        this.b = b; 
        this.operation = operation; 
    }
    public int sum() 
    { 
        return a + b; 
    } 
    public int vuch() 
    { 
        return a - b;
    } 
    public int umn() 
    { 
        return a * b; 
    } 
    public float del() 
    { 
        if (b == 0) 
                { 
                    System.out.println("Delit na 0 nelza."); 
                    System.exit(1); 
                } 
        return (float) a / b; 
    } 
    public float calculate() 
    { 
        float result = 0f; 
        switch (operation) 
        { 
            case "+": 
                result = sum(); 
                break; 
            case "-": 
                result = vuch(); 
                break; 
            case "*": 
                result = umn(); 
                break; 
            case "/": 
                result = del(); 
                break; 
            default: 
                System.out.println("Eto ne destvie."); 
                System.exit(1); 
                break; 
        } 
        return result; 
    } 
    public static void calc(String expression) 
    { 
        String[] parts = expression.split(" "); 
        if (parts.length != 3) 
        { 
            System.out.println("Ошибка: Неверный формат ввода"); 
            System.exit(1); 
        } 
        int num1 = parseNumber(parts[0]); 
        int num2 = parseNumber(parts[2]); 
        String operator = parts[1]; 
        Calculator calculator = new Calculator(num1, num2, operator); 
        float result = calculator.calculate(); 
        System.out.println("Результат: " + result); 
    } 
    private static int parseNumber(String number) 
    { 
        try 
        { 
            return Integer.parseInt(number); 
        } catch (NumberFormatException e) 
        { 
            System.out.println("Ошибка: Неверный формат ввода"); 
            System.exit(1); 
            return 0;
        } 
    } 
}