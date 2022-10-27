package at.mitarbeiterprovision;

public class Mitarbaiter {
    private String name;
    private double umsatz, gewinn;

    public Mitarbaiter(String name, double umsatz, double gewinn) {
        this.name = name;
        this.umsatz = umsatz;
        this.gewinn = gewinn;
    }

    public String getName() {
        return name;
    }

    public double getUmsatz() {
        return umsatz;
    }

    public double getGewinn() {
        return gewinn;
    }

    @Override
    public String toString() {
        return "Mitarbaiter{" +
                "name='" + name + '\'' +
                ", umsatz=" + umsatz +
                ", gewinn=" + gewinn +
                '}';
    }
}


