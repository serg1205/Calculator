import Calculator.Calculator;

import java.io.IOException;

public class Program {

    //main program enry point
    public static void main(String[] args) throws IOException {
        System.out.println("Welcome to integer calculator!");
        Calculator calc = new Calculator();
        while(true) {
           char key = (char) System.in.read();
           calc.press(key);
            System.out.println(calc);
        }

    }
}
