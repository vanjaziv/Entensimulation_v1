package at.entensimulation.v1;

public class Stockente extends Ente {
    public Stockente(String name){
        super(name, new FlatterFlugverhalten());
    }

    @Override
    public void anzeigen() {
        System.out.println("Stockente stolpert über Stock");
    }

}
