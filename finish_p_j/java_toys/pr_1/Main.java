package finish_p_j.java_toys.pr_1;

import finish_p_j.java_toys.pr_1.Doll;
import finish_p_j.java_toys.pr_1.Robot;

public class Main {
    public static void main(String[] args) {
        System.out.println();
        Doll 3 = new Doll(id:"3", species:"Doll", weight:"200", action:"false");
        3.toAction();
        System.out.println();

        Robot 2 = new Robot(id:"2", species:"Robot", weight:"300", action:"true");
        2.toAction();
        System.out.println();
    }
    
}

