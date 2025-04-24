//Develop test suit that includes test for addition subtraction mutliplication and division methods in calculator class


public class Calculator {

    public double add(double a, double b) {
        return a + b;
    }

    public double subtract(double a, double b) {
        return a - b;
    }

    public double multiply(double a, double b) {
        return a * b;
    }

    public double divide(double a, double b) {
        if (b == 0) {
            throw new IllegalArgumentException("Cannot divide by zero");
        }
        return a / b;
    }

    // 👇 Add this main method to run the class
    public static void main(String[] args) {
        Calculator calc = new Calculator();

        System.out.println("Add: " + calc.add(5, 3));
        System.out.println("Subtract: " + calc.subtract(10, 4));
        System.out.println("Multiply: " + calc.multiply(3, 4));
        System.out.println("Divide: " + calc.divide(10, 2));
    }
}


//output;
//Add: 8.0
//Subtract: 6.0
//Multiply: 12.0
//Divide: 5.0
