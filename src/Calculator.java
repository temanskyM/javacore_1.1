import java.util.function.*;

public class Calculator {
    static Supplier<Calculator> instance = Calculator::new;

    BinaryOperator<Integer> plus = Integer::sum;
    BinaryOperator<Integer> minus = (x, y) -> x - y;
    BinaryOperator<Integer> multiply = (x, y) -> x * y;
    BinaryOperator<Integer> devide = (x, y) ->
    {
        if (y == 0) {
            System.out.println("Нельзя делить на ноль");
            return 0;
        }
        return x / y;
    };

    UnaryOperator<Integer> pow = x -> x * x;

    UnaryOperator<Integer> abs = Math::abs;

    Predicate<Integer> isPositive = x -> x > 0;

    Consumer<Integer> println = System.out::println;

    public Calculator() {
    }
}
