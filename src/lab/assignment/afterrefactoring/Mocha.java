package lab.assignment.afterrefactoring;

public class Mocha extends CoffeeMaker
{
    public void addIngredients()
    {
        System.out.println("Adding cocoa powder");
        System.out.println("Adding hot milk");
    }

    public void finalTouch()
    {
        System.out.println("Adding sugar");
    }
}