package OOP.Lesson_2.OOP_seminar_2-main.bin.main.ru.gb.lessons.interfaces.core.personal;

public class personal {
    private String name;
    private Integer age;
    private String profession;
    private Integer yearsOfWork;
    private Boolean heal;
    private Boolean makeAnInjection;
    private Boolean giveApill;
    private Boolean operate;
    private Boolean helpTheDoctor;

    public personal(String name, Integer age, String profession, Integer yearsOfWork,
     Boolean heal, Boolean makeAnInjection, Boolean giveApill, Boolean operate, Boolean helpTheDoctor) {
        this.name = name;
        this.age = age;
        this.profession = profession;
        this.yearsOfWork = yearsOfWork;
        this.heal = heal;
        this.makeAnInjection = makeAnInjection;
        this.giveApill = giveApill;
        this.operate = operate;
        this.helpTheDoctor = helpTheDoctor;

    }

    public personal(String name, Integer age, Boolean heal, Boolean makeAnInjection, Boolean giveApill, Boolean operate, Boolean helpTheDoctor) {
        this.name = name;
        this.age = age;
        this.heal = heal;
        this.makeAnInjection = makeAnInjection;
        this.giveApill = giveApill;
        this.operate = operate;
        this.helpTheDoctor = helpTheDoctor;

    public personal(String name, Integer age) {
        this.name = name;
        this.age = age;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public void toheal() {

        if (this.heal) {
            System.out.println(this.profession + " " + this.name + ": \"heal\" ");
        } else {
            System.out.println("heal ");
        }

    }

    public void tooperate() {

        if (this.operate) {
            System.out.println(this.profession + " " + this.name + ": \"operate\" ");
        } else {
            System.out.println("operate ");
        }

    }

    public void tohelpTheDoctor() {

        if (this.helpTheDoctor) {
            System.out.println(this.profession + " " + this.name + ": \"helpTheDoctor\" ");
        } else {
            System.out.println("helpTheDoctor ");
        }

    }

    public void togiveApill() {

        if (this.giveApill) {
            System.out.println(this.profession + " " + this.name + ": \"I'm doctor\" ");
        } else {
            System.out.println(this.profession + " " + this.name + ": \"Nurse :-(\" ");
        }

    }

    public void tomakeAnInjection() {

        if (this.makeAnInjection) {
            System.out.println(this.profession + " " + this.name + ": \"I'm doctor\" ");
        } else {
            System.out.println(this.profession + " " + this.name + ": \"Nurse :-(\" ");
        }

    }

    @Override
    public String toString() {
        return String.format("Animal: {name = %s, owner = %s}", name, owner);
    }
}
