package at.mitarbeiterprovision;

public class Gewinnsverhalten implements Provisionsverhalten{

    @Override
    public double berechneProvision(Mitarbaiter m){
        System.out.println("Berechne mit Provisionverhalten Gewinns");
        double count = 0;
        count = m.getGewinn() * 0.1;
        return count;
    }
}
