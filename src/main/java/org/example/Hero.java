package org.example;

public class Hero {
    private int innerDemons;
    private String name;
    private int health;
    private int attackPower;
    private String inventory;

    // Constructor for Hero
public Hero(String name, int health, int attackPower, String items) {
        this.name = name;
        this.health = health;
        this.attackPower = attackPower;
        this.items = items;
        public void meditate(int time) {
        innerDemons -= time / 10;
        if (innerDemons < 0) innerDemons = 0;
        System.out.println(name + " meditates for " + time + " minutes, fighting inner demons.");
    }

    public void fightInnerDemons() {
        if (innerDemons > 0) {
            System.out.println(name + " fights inner demons fiercely.");
            innerDemons -= 1;
        } else {
            System.out.println(name + " is at peace. No inner demons left.");
        }
    }
}
    public void meditate(int time) {
        innerDemons -= time / 10;
        if (innerDemons < 0) innerDemons = 0;
        System.out.println(name + " meditates for " + time + " minutes, fighting inner demons.");
    }

    public void fightInnerDemons() {
        if (innerDemons > 0) {
            System.out.println(name + " fights inner demons fiercely.");
            innerDemons -= 1;
        } else {
            System.out.println(name + " is at peace. No inner demons left.");
        }
    }
}
