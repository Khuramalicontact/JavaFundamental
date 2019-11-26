package be.intecbrussel.Alles.garage;

public class Auto {


    String merkNaam;
    Garage garage;

    Auto(String merkNaam) {
        this.merkNaam = merkNaam;
    }

    Auto(String merkNaam, Garage garage ){
     this.merkNaam = merkNaam;
     this.garage =  garage;

    }

    Auto(Auto auto){
        this.merkNaam = auto.merkNaam;
        this.garage = auto.garage;
    }

    public String getMerkNaam() {
        return merkNaam;
    }

    public void setMerkNaam(String merkNaam) {
        this.merkNaam = merkNaam;
    }

    public Garage getGarage() {
        return garage;
    }

    public void setGarage(Garage garage) {
        this.garage = garage;
    }

    @Override
    public String toString() {
        return "Auto: merknaam:" + this.merkNaam + "Garage: naam:" +this.garage;
    }


}
