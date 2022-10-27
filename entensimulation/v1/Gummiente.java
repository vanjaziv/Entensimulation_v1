package at.entensimulation.v1;

public class Gummiente extends Ente{

    public Gummiente(String name) {
        super(name, null);
    }

    @Override
    public void anzeigen() {
        System.out.println("Gummiente ist hier.");
    }

    @Override
    public void quaken() {
        System.out.println("Gummiente quietschen");
    }
}
