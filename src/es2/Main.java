package es2;

import es2.Calls;
import es2.Sim;

public class Main {

    public static void main(String[] args) {
        Sim sim = new Sim();
        System.out.println(sim.toString());
        sim.setCalls(new Calls[] {
                new Calls("3332457682", 0.24),
                new Calls("3334576498", 2.0),
                new Calls("3384576192", 3.0),
                new Calls("3401276134", 4.0),
                new Calls("3277619285", 5.5)
        });
        System.out.println(sim.toString());
    }

}
