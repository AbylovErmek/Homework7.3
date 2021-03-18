package com.company;

import java.lang.reflect.Array;

public class Main {

    public static void main(String[] args) {

        HavingSuperAbility[] havingSuperAbilities ={new  Medic(), new Magic(), new Warrior()};
        for (int i = 0; i < havingSuperAbilities.length; i++) {
            System.out.println(havingSuperAbilities[i].applySuperAbility("Shoot"));
        }
    }
}
