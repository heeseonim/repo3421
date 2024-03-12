import com.sun.org.apache.xalan.internal.xsltc.compiler.util.ResultTreeType;

class Calculator {
    public int result;

    Calculator() {
        result = 0;
    }

    public void plus(int x, int y) {
        result += (x + y);
    }
    public void minus(int x, int y) {
        result += (x - y);
    }
    public void divide(int x, int y) {
        if (y==0) return;
        result += (x / y);
    }
    public void multiple(int x, int y) {
        result += (x * y);
    }
    public void printResult() {
        System.out.println("result : " + result);
    }
}

public class CalculatorClass {
    public static void main(String[] args) {
        Calculator calc = new Calculator();
        calc.plus(1, 3);
        calc.minus(2, 100);
        calc.printResult();
    }
}
