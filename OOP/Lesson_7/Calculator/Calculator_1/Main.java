package OOP.Lesson_7.Calculator.Calculator_1;

import OOP.Lesson_7.Calculator.Calculator_1.decorator.CalculatorView;
import OOP.Lesson_7.Calculator.Calculator_1.factory.CalculatorFactoryWithLogger;
import OOP.Lesson_7.Calculator.Calculator_1.factory.ICalculableFactory;

public class Main {
    public static void main(String[] args) {
//        ICalculableFactory calculableFactory = new CalculableFactory();
        ICalculableFactory calculableFactory1 = new CalculatorFactoryWithLogger();
        CalculatorView view = new CalculatorView(calculableFactory1);
        view.run();

    }
}
