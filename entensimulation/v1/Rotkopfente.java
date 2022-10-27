package at.entensimulation.v1;

public class Rotkopfente extends Ente {
    public Rotkopfente(String name){
        super(name, new SegelFlugverhalten());
    }

    @Override
    public void anzeigen() {
        System.out.println("Rotkopfente zeigt stolz ihren roten Kopf");
    }

}
