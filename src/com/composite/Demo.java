package com.composite;

public class Demo {
    public static void show(){
        Team team1 = new Team();
        team1.add(new Truck());
        team1.add(new HumanResource());

        Team team2 = new Team();
        team2.add(new Truck());

        team1.add(team2);
        team1.deploy();
    }

}
