import javafx.application.Application;
import javafx.stage.Stage;
import pizzaHelper.CS331PizzaFrame;

public class App extends Application {

    @Override
    public void start(Stage stage) throws Exception {
        // This sets up the empty GUI (Graphical User Interface) frame!
        new CS331PizzaFrame(stage);
        
        PizzaShop countryFresh = new PizzaShop(); // Country Fresh is an independant pizza shop from my home town
        // todo Instantiate the PizzaShop here
        countryFresh.displayShopUpdate("we are open for business");
    }
    /**
     * This is the main method. Don't worry about it, as it just makes an instance of the App class.
     * 
     * DO NOT CHANGE THIS CODE.
     */
    public static void main(String[] args) throws Exception {
        launch(args);
    }
}
