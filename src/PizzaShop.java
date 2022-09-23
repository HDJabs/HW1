import pizzaHelper.CS331Pizza;
import pizzaHelper.CS331Toppings;
import pizzaHelper.PizzaShopHelper;

/**
 * This is our top-level class that represents a PizzaShop!
 */
public class PizzaShop extends PizzaShopHelper{
    
    // this declares our instance variable "toppings"
    private CS331Toppings toppings;
    private Baker barry;
    private CS331Pizza pizza;

    /**
     * This is the constructor of the PizzaShop class. You should initialize all your instalce variables here,
     * and be sure to open shop!
     */

    public PizzaShop() {
        super();
        openShop();
        System.out.println("a new pizza shop has been created");
        //this initializes our instance variable "toppings"
        this.toppings = new CS331Toppings();
        this.barry = new Baker();
    }

    /**
     * This method is called automatically when the user clicks "Order 1". Check out
     * the Javadocs for more information.
     */

    @Override
    public void order1() {
        System.out.println("order 1");
        this.pizza = barry.bakeMushroomPizza();
        displayPrice(this.pizza);
        displayShopUpdate(barry.totalPizza());
    }

    /**
     * This method is called automatically when the user clicks "Order 2". Check out
     * the Javadocs for more information.
     */
    @Override
    public void order2() {
        System.out.println("order 2");
        this.pizza = barry.bakePineapplePizza();
        this.toppings.addPeppers(this.pizza);
        displayPrice(this.pizza);
        displayShopUpdate(barry.totalPizza());
    }

    /**
     * This method is called automatically when the user clicks "Order 3". Check out
     * the Javadocs for more information.
     */
    @Override
    public void order3(){
        System.out.println("order 3");
        this.pizza = barry.bakePineapplePizza();
        this.toppings.addPeppers(this.pizza);
        this.toppings.addTomatoes(this.pizza);
        displayPrice(this.pizza);
        displayShopUpdate(barry.totalPizza());
    }

    /**
     * This method is called automatically when the user clicks "Order 4". Check out
     * the Javadocs for more information.
     */
    @Override
    public void order4() {
        System.out.println("order 4");
        this.pizza = barry.bakeSpinachPizza();
        this.toppings.addPeppers(this.pizza);
        this.toppings.addTomatoes(this.pizza);
        displayPrice(this.pizza);
        displayShopUpdate(barry.totalPizza());
    }
    /*
    public void order5() {
        System.out.println("order 5");
        this.pizza = barry.bakeSpinachPizza();
        this.toppings.addPeppers(thispizza);
        this.toppings.addOnions(this.pizza);
    }
    */
}
