package OOP.Lesson_7.Calculator.Calculator_2;

public class SumModel extends CalcModel {

    public SumModel() {
        
    }
    // do_it
    @Override
    public int result() {
        return x + y;
    }

    @Override
    public void setX(int value) {
        super.x = value;
    }

    @Override
    public void setY(int value) {
        super.y = value;
    }

}
