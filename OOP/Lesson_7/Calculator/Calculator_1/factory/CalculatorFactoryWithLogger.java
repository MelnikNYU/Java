package OOP.Lesson_7.Calculator.Calculator_1.factory;

import OOP.Lesson_7.Calculator.Calculator_1.model.Calculable;

public class CalculatorFactoryWithLogger implements ICalculableFactory {
    @Override
    public Calculable create(int primaryArg) {
        return CalculatorDecorator(new Calculator(primaryArg), new ConsoleLogger());
    }
}
