package com.company;

class Hamburger {                                                                                                       // . Creating the class Hamburger.

    private String breadRollType;                                                                                       // . Initializing all the instance variables.
    private String meat;
    private int cheese;
    private int bacon;
    private int lettuce;
    public int tomato;
    private double priceBaseHamburger;
    private double priceModifiedHamburger;
    private double priceToppings;


    // CONSTRUCTOR

    public Hamburger(String breadRollType, String meat, double priceBaseHamburger){                                     // . Creating the constructor with only 3 parameters.
        this.breadRollType = breadRollType;
        this.meat = meat;
        this.priceBaseHamburger = priceBaseHamburger;
        this.cheese = 0;                                                                                                // . Setting the intance variables that the constructor doesn't have as a parameter to 0.
        this.bacon = 0;
        this.lettuce = 0;
        this.tomato = 0;
        this.priceModifiedHamburger = 0.00;
        this.priceToppings = 0.50;
    }


    // GET METHODS

    public int getCheese(){                                                                                             // . Get method for the instance cheese.
        return cheese;
    }

    public int getBacon(){                                                                                              // . Get method for the instance bacon.
        return bacon;
    }

    public int getLettuce(){                                                                                            // . Get method for the instance lettuce.
        return lettuce;
    }

    public int getTomato(){                                                                                             // . Get method for the instance tomato.
        return tomato;
    }

    public double getPriceBaseHamburger() {                                                                             // . Get method for the instance priceBaseHamburger.
        return priceBaseHamburger;
    }

    public double getPriceToppings() {                                                                                  // . Get method for the instance priceToppings.
        return priceToppings;
    }


    // ADD METHODS

    public void addCheese(int cheese){                                                                                  // . Add method for the instance variable cheese.
        this.cheese += cheese;
    }

    public void addBacon(int bacon){                                                                                    // . Add method for the instance variable bacon.
        this.bacon += bacon;
    }

    public void addLettuce(int lettuce){                                                                                // . Add method for the instance variable lettuce.
        this.lettuce += lettuce;
    }

    public void addTomato(int tomato){                                                                                  // . Add method for the instance variable tomato.
        this.tomato += tomato;
    }


    // OTHER METHODS


    public void addExtras (String topping){                                                                             // . Method that addExtras to the hamburger passing the name of the topping.
        if(countAdditions() < 4){                                                                                       // . Calling the method "countAdditions" that checks if there are less than 4 toppings.
             switch (topping.toLowerCase()) {                                                                           // . Passing the string with the name of the topping, calling the method toLowerCase() for the String, and checking if a value corresponds to the toppings available.
                case "cheese":
                    addCheese(1);                                                                                       // . If the string corresponds, calling the method addNametopping to increment it by 1.
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
                default:
                    System.out.println("invalid topping");                                                              // . If the topping inserted (String) doesn't match any of the above, prints a string.
                    break;
            }
        }else{
            System.out.println("Maximum toppings reached.");                                                            // . If the number of toppings is already 4, no switch, print String.
        }
    }


    public int countAdditions() {                                                                                       // . Method to count the amount of toppings.
        int sum = getCheese() + getBacon() + getLettuce() + getTomato();
      return sum;
    }


    public double totalToppings(){                                                                                      // . Method that counts the total price for the toppings chosen.
        return (priceToppings * countAdditions());
    }

    public double getTotalPrice(){                                                                                      // . Method that retrieves the total price (priceBase + totalToppings).
        return (totalToppings() + this.priceBaseHamburger);
    }



    public void bill(){                                                                                                 // . Method that prints strings that is the total bill.
        System.out.println("Base  hamburger : x1 = " + this.priceBaseHamburger + "$");
                if(countAdditions() != 0){                                                                              // . Checking if the value of the method countAdditions is not 0.
                    if(getCheese() != 0){                                                                               // . Checking for every topping if is present in the hamburger.
                        System.out.println("Cheese  topping : x" + getCheese() + " = " + getCheese() * priceToppings + "$");
                    }
                    if(getBacon() != 0){
                        System.out.println("Bacon   topping : x" + getBacon() + " = " + getBacon() * priceToppings + "$");
                    }
                    if(getLettuce() != 0){
                        System.out.println("Lettuce topping : x" + getLettuce() + " = " + getLettuce() * priceToppings + "$");
                    }
                    if(getTomato() != 0){
                        System.out.println("Tomato topping : x" + getTomato() + " = " + getTomato() * priceToppings + "$");
                    }
                }else {                                                                                                 // . If there aren't toppings print string.
                    System.out.println("No toppings.");
                }
        System.out.println("Total :    " + this.priceBaseHamburger + " + " + totalToppings() + " = " + getTotalPrice() + "$"); // . Printing the final String.
    }

}
