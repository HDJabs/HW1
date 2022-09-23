import pizzaHelper.CS331Pizza;

public class Baker {

    private int numPizza;

    public Baker(){
        numPizza = 0;
        System.out.println("new baker has been instantiated");
        System.out.println("there should be 0 pizzas made");
        System.out.println("numPizza - " + this.numPizza);
    }
    //default no args constructor

    public CS331Pizza bakeMushroomPizza(){
        CS331Pizza mushPizza = new CS331Pizza();
        mushPizza.addMushrooms();
        this.numPizza++;
        return mushPizza;
    }

    public CS331Pizza bakePineapplePizza(){
        CS331Pizza pinePizza = new CS331Pizza();
        pinePizza.addPineapple();
        this.numPizza++;
        return pinePizza;
    }

    public CS331Pizza bakeSpinachPizza(){
        CS331Pizza spinPizza = new CS331Pizza();
        spinPizza.addSpinach();
        this.numPizza++;
        return spinPizza;
    }

    public String totalPizza(){
        return("the baker has made " + this.numPizza + " pizzas");
    }
}
