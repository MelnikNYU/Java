package OOP.Lesson_7.Calculator.Calculator_1.decorator;

import OOP.Lesson_7.Calculator.Calculator_1.log.Logger;
import OOP.Lesson_7.Calculator.Calculator_1.model.Calculable;

public class CalculatorDecorator implements Calculable {
    private Calculable calculator;
    private Logger logger;

    public CalculatorDecorator(Calculable calculable, Logger logger) {
        this.calculator = calculable;
        this.logger = logger;
    }

    @Override
    public Calculable sum(int arg) {
        logger.log(String.format("Суммирую %s с %s", arg, calculator.getResult()));
        Calculable result = calculator.sum(arg);
        logger.log(String.format("Результат: %d", result.getResult()));
        return this;
    }

    @Override
    public Calculable multi(int arg) {
        logger.log(String.format("Умножаю %s на %s", arg, calculator.getResult()));
        Calculable result = calculator.multi(arg);
        logger.log(String.format("Результат: %d", result.getResult()));
        return this;
    }

    @Override
    public int getResult() {
        return calculator.getResult();
    }
}
