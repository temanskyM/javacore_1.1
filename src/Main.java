public class Main {
    public static void main(String[] args) {
        Calculator calculator = Calculator.instance.get();
        int a = calculator.plus.apply(1, 2);
        int b = calculator.minus.apply(1, 1);

        //Может быть деление на ноль
        int c = calculator.devide.apply(a, b);

        calculator.println.accept(c);

    }
}