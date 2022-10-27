package at.mitarbeiterprovision;

public class main {

    public static void main(String[] args) {
        System.out.println("Starting up...");

        MitarbeiterManager mgr = new MitarbeiterManager(new Gewinnsverhalten());

        mgr.add(new Mitarbaiter("Marko", 15, 20 ));
        mgr.add(new Mitarbaiter("Susi", 25, 10 ));
        mgr.add(new Mitarbaiter("Peter", 5, 30 ));

        mgr.MitarbaiterProvisionberechnen();

        mgr.setProvisionsverhalten(new Umsatzesverhalten());

        mgr.MitarbaiterProvisionberechnen();



        System.out.println("Shutting down...");

    }
}
