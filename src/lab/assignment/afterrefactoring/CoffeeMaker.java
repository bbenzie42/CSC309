package lab.assignment.afterrefactoring;

public abstract class CoffeeMaker {

    public final void prepareCoffee()
    {
        boilWater();
        brewEspresso();
        addIngredients();
        finalTouch();
        System.out.println(">>Serving coffee");
    }

    public void boilWater() {
        System.out.println("Boiling water");
    }

    public void brewEspresso() {
        System.out.println("Brewing espresso");
    }

    public abstract void addIngredients();
    public abstract void finalTouch();

}
