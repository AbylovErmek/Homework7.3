package com.company;

public class Warrior extends Hero implements HavingSuperAbility {

    @Override
    public String applySuperAbility(String superAbilityType) {
        return "Warrior применил суперспособность CRITICAL DAMAGE";
    }
}
