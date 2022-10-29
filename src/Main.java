import java.util.ArrayList;
import java.util.Collections;

public class Main {
    public static void main(String[] args) {

        Calculator calc = Calculator.instance.get();;

        int a = calc.plus.apply(8, 2);
        int b = calc.minus.apply(1,3);
        calc.println.accept("a = " + a);
        calc.println.accept("b = " + b);

        b = calc.abs.apply(b);
        calc.println.accept("|b| = " + b);

        int c = calc.devide.apply(a, b);
        calc.println.accept("c = a/|b| = " + c);

        c = calc.pow.apply(c);
        calc.println.accept("c^2 = " + c);

        c = calc.multiply.apply(c,b);
        calc.println.accept("c * |b| = " + c);

    }
}
