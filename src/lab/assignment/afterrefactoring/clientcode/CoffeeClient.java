package lab.assignment.afterrefactoring.clientcode;

import lab.assignment.afterrefactoring.CoffeeMaker;
import lab.assignment.afterrefactoring.Mocha;
import lab.assignment.afterrefactoring.Americano;
import lab.assignment.afterrefactoring.Capuccino;

public class CoffeeClient {


    public static void main(String[] args) {
        CoffeeMaker starbuzz = new Mocha();
        starbuzz.prepareCoffee();
        System.out.println("********************");
        
        starbuzz = new Capuccino();
        starbuzz.prepareCoffee();
        System.out.println("********************");

        starbuzz = new Americano();
        starbuzz.prepareCoffee();
    }

}
