package com.company;

public class DeluxeHamburger extends Hamburger {                                                                        // . Creating the sub-class deluxeHamburger.

    private String drink;                                                                                               // . Initializing instance fields.
    private int chips;

    public DeluxeHamburger(String drink){                                                                               // . Constructor with only one parameter, "Drink" type String.
        super("Normal","Cow",8.50);                                                    // . Calling the parent constructor.
        this.drink = drink;
        this.chips = 1;
    }


    @Override
    public void bill() {  System.out.println("Base  hamburger : x1 = " + getPriceBaseHamburger() + "$ \n" +             // . Overriding the method bill passing the necessary values.
                                             "Drink " + this.drink + " : x1 = 0$ \n" +
                                             "Chips           : x1 = 0$ \n" +
                                             "Total                = " + getPriceBaseHamburger() + "$");
    }

    @Override                                                                                                           // . Overriding all the Add methods, making them unavailable for any object DeluxeHamburger.
    public void addCheese(int cheese) {
        System.out.println("Can't add any extras to the meal-deal!");
    }

    @Override
    public void addBacon(int bacon) {
        System.out.println("Can't add any extras to the meal-deal!");
    }

    @Override
    public void addLettuce(int lettuce) {
        System.out.println("Can't add any extras to the meal-deal!");
    }

    @Override
    public void addTomato(int tomato) {
        System.out.println("Can't add any extras to the meal-deal!");
    }

    @Override
    public void addExtras(String topping) {
        System.out.println("Can't add any extras to the meal-deal!");
    }
}
