package OOP.Lesson_2.OOP_seminar_2-main.bin.main.ru.gb.lessons.interfaces.core.DrugHW;

public class Main {
    public static void main(String[] args) {
        Pharmacy pharmacy1 = new Pharmacy();
        Component comp1 = new Component("Penicillin", "10 mg", 10);
        Component comp2 = new Component("Spirit", "100 g", 1000);

        pharmacy1.addComponent(comp1).addComponent(comp2);
        System.out.println(pharmacy1);

        for (Component elem : pharmacy1) {
            System.out.println(elem);
        }

        Pharmacy pharmacy2 = new Pharmacy();
        Component comp3 = new Component("Penicillin", "10 mg", 3);
        Component comp4 = new Component("Spirit", "100 g", 13);
        pharmacy2.addComponent(comp3).addComponent(comp4);

        Pharmacy pharmacy3 = new Pharmacy();
        Component comp5 = new Component("Penicillin", "10 mg", 12);
        Component comp6 = new Component("Spirit", "100 g", 100);
        pharmacy3.addComponent(comp5).addComponent(comp6);

        List<Pharmacy> nomenclature = new ArrayList<>();
        nomenclature.add(pharmacy3);
        nomenclature.add(pharmacy1);
        nomenclature.add(pharmacy2);

        System.out.println(nomenclature);
        Collections.sort(nomenclature);
        System.out.println("============================================================================");
        System.out.println(nomenclature);
    }
}
