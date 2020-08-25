package com.company;

public class Main {

    public static void main(String[] args) {

        Hamburger ham1 = new Hamburger("halal","Chicken",7);
        ham1.addExtras("omato");
        ham1.addExtras("cheese");
        ham1.addExtras("bacon");
        ham1.addExtras("lettuce");
        ham1.addExtras("lettuce");
        ham1.addExtras("lettuce");

        ham1.bill();

//        System.out.println(ham1.getTotalPrice());

        HealthyBurger ham2 = new HealthyBurger();
        ham2.addExtras("cucumber");
        ham2.addExtras("cucumber");
        ham2.addExtras("cucumber");
        ham2.addExtras("lettuce");
        ham2.addExtras("cheese");
        ham2.addExtras("peppers");
        ham2.addExtras("cucumber");

        ham2.bill();

        System.out.println(ham2.getTotalPrice());



        DeluxeHamburger ham3 = new DeluxeHamburger("coca-cola");
        ham3.addBacon(2);
        ham3.bill();
    }
}

