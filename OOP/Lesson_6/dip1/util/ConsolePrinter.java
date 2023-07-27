package OOP.Lesson_6.dip1.util;

import OOP.Lesson_6.dip1.model.Reportable;
import OOP.Lesson_6.dip1.model.ReportItem;
import java.util.List;

public class ConsolePrinter implements Reportable {
    public void output(List<ReportItem> items) {
        System.out.println("Output to console");
        for (ReportItem item : items) {
            System.err.format("console print %s - %f \n\r", item.getDescription(), item.getAmount());
        }
    }
}
