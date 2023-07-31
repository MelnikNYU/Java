package OOP.Lesson_7.Calculator.Calculator_1.factory;

import OOP.Lesson_7.Calculator.Calculator_1.model.Calculable;
import OOP.Lesson_7.Calculator.Calculator_1.model.Calculator;

public class CalculableFactory implements ICalculableFactory {
    public Calculable create(int primaryArg) {
        return new Calculator(primaryArg);
    }
}
