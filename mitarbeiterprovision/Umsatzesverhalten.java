package at.mitarbeiterprovision;

public class Umsatzesverhalten implements Provisionsverhalten{
    @Override
    public double berechneProvision(Mitarbaiter m){
        System.out.println("Berechne mit Provisionverhalten Umsatz");
        double count = 0;
        count = m.getUmsatz() * 0.05;
        return count;
    }
}
