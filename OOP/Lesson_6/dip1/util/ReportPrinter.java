package OOP.Lesson_6.dip1.util;

import OOP.Lesson_6.dip1.model.Reportable;
import OOP.Lesson_6.dip1.model.ReportItem;
import java.util.List;

public class ReportPrinter implements Reportable {
    public void output(List<ReportItem> items) {
        System.out.println("Output to printer");
        for (ReportItem item : items) {
            System.out.format("printer %s - %f \n\r", item.getDescription(), item.getAmount());
        }
    }
}
