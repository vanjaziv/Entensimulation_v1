package at.mitarbeiterprovision;

import java.util.ArrayList;
import java.util.List;

public class MitarbeiterManager {
    private Provisionsverhalten provisionsverhalten;
    private List<Mitarbaiter> mitarbaiterList = null;

    public MitarbeiterManager(Provisionsverhalten s) {
        this.mitarbaiterList = new ArrayList<>();
        System.out.println("Creating Mitarbeitermanager.");
        provisionsverhalten = s;
    }

    public void add(Mitarbaiter m) {
        mitarbaiterList.add(m);
    }



    public void setProvisionsverhalten(Provisionsverhalten s) {
        this.provisionsverhalten = s;
    }

    public void MitarbaiterProvisionberechnen(){
        for (Mitarbaiter m : mitarbaiterList){
            double p = -1;

            p = provisionsverhalten.berechneProvision(m);


            System.out.println("Gehe alle MA durch " + m + "Provision: " + p);
        }
    }
}
