package OOP.Lesson_7.Calculator.Calculator_1.factory;

import OOP.Lesson_7.Calculator.Calculator_1.model.Calculable;

public interface ICalculableFactory {
    Calculable create(int primaryArg);
}
