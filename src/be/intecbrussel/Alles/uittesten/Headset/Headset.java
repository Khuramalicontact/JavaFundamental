package be.intecbrussel.Alles.uittesten.Headset;

import java.util.Scanner;

public class Headset {

    Scanner scan = new Scanner(System.in);

    private String charge = "Micro usb";
    private String color = "Red";
    private boolean bluetooth = false;
    private boolean power = false;
    private int volume = 0;
    private int song = 0;
    private boolean playing = false;
    private boolean pauzing = true;
    private String welcome = "Welcome bij mijn headset app";


    public void power() {


        System.out.println("Maak u keuze: \n 1.PowerOnn \n 2.PowerOff");
        String power = scan.nextLine();

        String on = "1";
        String off = "2";

        do {
            if (power.equals(on)) {
                powerOn();
                powerMenu();
                break;


            } else if (power.equals(off)) {
                powerOff();
                System.out.println("U headset zal afsluiten");
                System.exit(0);

            } else {
                System.out.println("incorrecte invoer maak u keuze:  \n 1.PowerOnn \n 2.PowerOff");
                power = scan.next();
            }
        } while (true);
    }

    public void powerOn() {
        power = true;
    }

    public void powerOff() {
        power = false;
    }

    public void setBluetooth(boolean bluetooth) {
        this.bluetooth = bluetooth;

    }

    public boolean isPlaying() {
        return playing;
    }

    public void setPlaying(boolean playing) {
        this.playing = playing;
    }

    public boolean isPauzing() {
        return pauzing;
    }

    public void setPauzing(boolean pauzing) {
        this.pauzing = pauzing;
    }

    public int getSong() {
        return song;
    }

    public void setSong(int song) {
        this.song = song;
    }

    public String getWelcome() {
        return welcome;
    }

    public void setWelcome(String welcome) {
        this.welcome = welcome;
    }

    public void powerMenu() {
        int userChoice = -1;

        do {

            System.out.println("Voer de opdracht in \n 1. Bluethooth connecten \n 2. Power Off \n 3. Volume Up \n 4. Volume down \n 5. Skip a song \n 6. Play song \n 7. Pause Song");


            if (scan.hasNextInt()) {
                userChoice = scan.nextInt();
            } else {
                System.out.println("Verkeerde ingave");
            }

            }while (userChoice < 0 || userChoice > 7) ;

            switch (userChoice) {

                case 1:
                    System.out.println("Bluetooth is now connected".toUpperCase());
                    setBluetooth(true);
                    break;
                case 2:
                    System.out.println("U headset sluit af".toUpperCase());
                    powerOff();
                    System.exit(0);

                    break;
                case 3:
                    System.out.println("Volume up >".toUpperCase());
                    volume++;
                    break;
                case 4:
                    System.out.println("Volume <".toLowerCase());
                    volume--;
                    break;
                case 5:
                    System.out.println("Song skipped".toUpperCase());
                    song++;
                    break;
                case 6:
                    System.out.println("Play".toUpperCase());
                    setPlaying(true);
                    setPauzing(false);
                    break;
                case 7:
                    System.out.println("Pauze".toLowerCase());
                    setPauzing(true);
                    setPlaying(false);
                    break;
                default:
                    System.out.println("foute ingave".toUpperCase());

            }
}
    }








