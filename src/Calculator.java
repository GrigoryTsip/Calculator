import org.w3c.dom.ls.LSOutput;

import java.util.ArrayList;
import java.util.Collections;
import java.util.function.*;

public class Calculator {

    static Supplier<Calculator> instance = Calculator::new;

    BinaryOperator<Integer> plus = (x,y) -> x + y;
    BinaryOperator<Integer> minus = (x,y) -> x - y;
    BinaryOperator<Integer> multiply = (x,y) -> x * y;
    BinaryOperator<Integer> devide = (x,y) -> {  // в задании не было учтено, что делитель может быть нулем
        if (y != 0) return x / y;
        System.out.println("Деление на 0!");
        return 0;
    };
    UnaryOperator<Integer> pow = x -> x * x;
    UnaryOperator<Integer> abs = x -> x > 0 ? x : x * -1;

    Predicate<Integer> isPositive = x -> x > 0;

    Consumer<String> println = System.out::println;
}
