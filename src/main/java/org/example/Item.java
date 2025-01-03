package org.example;

public class Item {
    private String name;
    private int attackBonus;
    private String effect;

    public Item(String name, int attackBonus, String effect) {
        this.name = name;
        this.attackBonus = attackBonus;
        this.effect = effect;
    }

    public String getName() {
        return name;
    }

    public int getAttackBonus() {
        return attackBonus;
    }

    public String getEffect() {
        return effect;
    }
}
