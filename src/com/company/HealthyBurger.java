package com.company;

class HealthyBurger extends Hamburger {                                                                                 // . Creating a sub-class HealthyBurger.

    private int cucumber;                                                                                               // . Initializing the instance variables.
    private int peppers;


    // CONSTRUCTOR

    public HealthyBurger() {                                                                                            // . Constructor with no parameters.
        super("Brown rye bread roll", "soy souce duck", 7.99);                         // . Calling the parent constructor.
        this.cucumber = 0;
        this.peppers = 0;
    }


    // GET METHODS

    public int getCucumber() {                                                                                          // . Get method for the Cucumber instance.
        return cucumber;
    }

    public int getPeppers() {                                                                                           // . Get method for the peppers instance.
        return peppers;
    }


    // ADD METHODS

    private void addPeppers(int peppers) {                                                                              // . Add method for the peppers instance.
        this.peppers += peppers;
    }

    private void addCucumber(int cucumber) {                                                                            // . Add method for the cucumber instance.
        this.cucumber += cucumber;
    }


    // OVERRIDDEN METHODS

    @Override
    public int countAdditions() {                                                                                       // . Overriding method countAdditions adding the instance variables cucumber and peppers.
        return super.countAdditions() + getCucumber() + getPeppers() ;
    }

    @Override
    public void addExtras(String topping) {                                                                             // . Overriding method addExtras adding the case of the 2 new instances.
        if(countAdditions() < 4){
            switch (topping.toLowerCase()) {
                case "cheese":
                    addCheese(1);
                    break;
                case "bacon":
                    addBacon(1);
                    break;
                case "lettuce":
                    addLettuce(1);
                    break;
                case "tomato":
                    addTomato(1);
                    break;
                case "cucumber":
                    addCucumber(1);
                    break;
                case "peppers":
                    addPeppers(1);
                    break;
                default:
                    System.out.println("invalid topping");
                    break;
            }
        }else{
            System.out.println("Maximum toppings reached.");
        }
    }

    @Override
    public void bill() {                                                                                                // . Overriding the method bill adding the two new instance variables.
        System.out.println("Base  hamburger  : x1 = " +  getPriceBaseHamburger() + "$");
        if(countAdditions() != 0){
            if(getCheese() != 0){
                System.out.println("Cheese  topping  : x" + getCheese() + " = " + getCheese() * getPriceToppings() + "$");
            }
            if(getBacon() != 0){
                System.out.println("Bacon   topping  : x" + getBacon() + " = " + getBacon() * getPriceToppings() + "$");
            }
            if(getLettuce() != 0){
                System.out.println("Lettuce topping  : x" + getLettuce() + " = " + getLettuce() * getPriceToppings() + "$");
            }
            if(getTomato() != 0){
                System.out.println("Tomato topping  : x" + getTomato() + " = " + getTomato() * getPriceToppings() + "$");
            }
            if(getCucumber() != 0){
                System.out.println("Cucumber topping : x" + getCucumber() + " = " + getCucumber() * getPriceToppings() + "$");
            }
            if(getPeppers() != 0){
                System.out.println("Peppers topping  : x" + getPeppers() + " = " + getPeppers() * getPriceToppings() + "$");
            }
        }else {
            System.out.println("No toppings = 0$");
        }
        System.out.println("Total :   " + getPriceBaseHamburger() + " + " + totalToppings() + "   = " + getTotalPrice() + "$");
    }
}
