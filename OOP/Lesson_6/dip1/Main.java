package OOP.Lesson_6.dip1;

import OOP.Lesson_6.dip1.model.Report;
import OOP.Lesson_6.dip1.model.ReportManager;
import OOP.Lesson_6.dip1.util.ConsolePrinter;
import OOP.Lesson_6.dip1.util.ReportPrinter;
import logger.Log;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Main {
    private static final Logger Log = null;
    private static final Logger log = new Log.logg(Main.class.getName());
    public static void main(String[] args) {
        ReportManager manager = new ReportManager(new ReportPrinter());
        log.log(Level.INFO, "Method main in model package started");
        Report report = new Report();
        report.calculate();
        manager.output(report.getItems());
        ReportManager reportManager = new ReportManager(new ConsolePrinter());
        reportManager.output(report.getItems());
    }
}
