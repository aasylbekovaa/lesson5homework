package com.company;

public class Main {

    public static void main(String[] args) {
        Boss b1= new Boss();
        b1.setHealth(1000);
        b1.setDamage(500);
        b1.setProtection("wall");
        System.out.println("здоровье босса" + b1.getHealth () + + b1.getDamage () + b1.getProtection ());
        for (int i = 0; i < createHeroes().length; i++) {
            System.out.println("health:" + " " + createHeroes()[i].getHealth() + "damage:" + " " +  createHeroes()[i].getDamage()+ "superpower:" + " " + createHeroes()[i].getSuperpower());
        }
    }
    public static Hero[] createHeroes() {
            Hero h1=new Hero(3000, 200,"wall");
            Hero h2=new Hero(3500,678);
            Hero h3= new Hero(4678,30, "Stealth");
             Hero[] heroes = { h1,h2,h3};
             return heroes ;



    }
}

