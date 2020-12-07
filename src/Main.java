package com.Trainee.AYT;

public class Main {
    public static void main(String[] args) {
        Gold gold;
        gold = new Gold();
        String typeOfMetal = gold.getTypeOfMetal();
        System.out.println(typeOfMetal);

        int metalWeight = gold.metalWeight();
        System.out.println(metalWeight);

        int metalVolume = gold.metalVolume();
        System.out.println(metalVolume);

        String metalColour = gold.metalColour();
        System.out.println(metalColour);

        gold.extractStones();

        gold.cleanStones();

        gold.washStones();

        gold.purifyStones();

        gold.cutStones();

        System.out.println(gold.myVar(9));

        System.out.println(gold.myVar(15));

        System.out.println(gold.myVar(25));

    }
}
