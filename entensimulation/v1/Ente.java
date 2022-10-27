package at.entensimulation.v1;

public abstract class Ente {
    private String name;
    private Flugverhalten flugverhalten; // 1: fliegt, 2: nicht fliegt, 3: flattert

    public Ente(String name, Flugverhalten flugverhalten) {
        this.name = name;
        this.flugverhalten = flugverhalten;
    }

    public void quaken() {
        System.out.println("Ente " + name + " quakt");
    }

    public void schwimmen() {
        System.out.println("Ente " + name + " schwimmt");
    }

    public void performFliegen() {

        if(flugverhalten != null){
            flugverhalten.fliegen();
        }else{
            System.out.println("Ente kann nicht fliegen");
        }
    }
        public abstract void anzeigen ();

}
