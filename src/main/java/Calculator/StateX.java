package Calculator;

public class StateX extends State {
    public void clear(Calculator calculator) {
        calculator.setX(0);
        calculator.setY(0);
        calculator.setOperation('+');

    }

    public void digit(Calculator calculator, char key) {
        calculator.setX(calculator.getX()*10+Character.getNumericValue(key));

    }

    public void arifm(Calculator calculator, char key) {

    }

    public void equal(Calculator calculator) {

    }
}
