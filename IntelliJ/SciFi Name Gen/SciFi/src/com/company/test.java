package com.company;

public class test {
    public static void main(String args[]){
        String relativeName1 = "Beatrice";
        double ran = (Math.random() * (relativeName1.length() - 1) + 1);
        double rand = (Math.round(ran));
        double rando = (Math.round(rand * 10000.0)/10000.0);
        int random = (int) rando;
        System.out.println(random);
        System.out.println(ran);
        String lastRel1 = relativeName1.substring(random-1);
        System.out.println(lastRel1);

    }
}
