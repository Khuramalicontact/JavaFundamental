package be.intecbrussel.Alles.association;

import java.util.Random;

public class HigherLower {

    public int value;
    public   int max;
    public Random rand;
    private String welcome = "W";

    public  HigherLower(int max) {

        this.max = max;
        rand = new Random();
        reset();
    }


    public  void reset () {
        value = rand.nextInt(max + 1);
    }

    public String getWelcome() {
        return welcome;
    }

    public void setWelcome(String welcome) {
        this.welcome = welcome;
    }


    public  int guess (int guessValue){
  if(guessValue < value){
      return -1;

  } else if (guessValue > value) {
      return 1;

  } else {
      return 0;
  }



}}
