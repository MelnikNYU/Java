package finish_p_j.java_toys.pr_1;

import finish_p_j.java_toys.pr_1.Winner;

public class Toys {
    private String id;
    private Integer age;
    private String weight;
    private String color;
    private String species;
    private Winner winner;
    private Boolean action;

    public Toys(String id, Integer age, String weight, String color,
            String species, Winner winner, Boolean action) {
        this.id = id;
        this.age = age;
        this.color = color;
        this.species = species;
        this.winner = winner;
        this.action = action;
    }


    // public Toys(String id, Integer age, String weight, String color,
    //         String species, Winner winner, Boolean action) {
    //     this.id = id;
    //     this.age = age;
    //     this.color = color;
    //     this.species = species;
    //     this.winner = winner;
    //     this.action = action;
    // }

    public Toys(String id, String weight) {
        this.id = id;
        this.weight = weight;
    }

    public String getWeight() {
        return weight;
    }

    public void setWeight(String weight) {
        this.weight = weight;
    }

    public void toAction() {

        if (this.action) {
            System.out.println(this.species + " " + this.id + ": \"action\" ");
        } else {
            System.out.println("stand ");
        }
//     @Override
//     final String toString() {
//         return String.format("Toys: {id = %s, winner = %s}", id, winner);
//     }
    }
}
