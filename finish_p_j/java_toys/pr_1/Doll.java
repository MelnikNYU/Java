package finish_p_j.java_toys.pr_1;

public class Doll extends Toys {
    String id = "id";
    String species = "doll";
    String weight = "g";
    Boolean action = false;


    public Doll(String id, String species, String weight, Boolean action) {
        super(id, null, weight, weight, species, null, action);
    //     this id = id;
    //     this species = "Doll";
    //     this weight = "g";
    //     this action = false;
    // }

    // public Doll(String id, String weight) {
    //     super(id, weight);
    //     this id = "id";
    //     this weight = "g";
    }
}