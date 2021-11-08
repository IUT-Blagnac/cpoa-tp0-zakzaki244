import io.cucumber.java.en.*;
import java.util.List;
import static org.junit.Assert.*;

public class StepDefinitions {

    private Order o;

    // @Given("Romeo who wants to create an Order")
    // public void creating_an_order() {
    //     o = new Order(); 
    //     o.setOwner("Romeo");
    // }
    
    @Given("{word} who wants to create an Order")
    public void creating_an_order(String who) {
        o = new Order();
        o.setOwner(who);
    }
    
    // @When("Juliet is declared as recipient")
    // public void declaring_recipient(){ 
    //   o.setRecipient("Juliet");  
    // }
    
    @When("{word} is declared as recipient")
    public void declaring_recipient(String who){
        o.setRecipient(who);
    }
    
    @Then("the order does not contain any drinks")
    public void check_emptiness() {
        List<Order.Drink> drinks = o.getDrinks();
        assertEquals(0, drinks.size());
    }

    // @When("a {string} is added to the order")
    // public void add_drink_to_the_order(String drinkName){
    //     o.getDrinks().add(new Order.Drink(drinkName));
    // }
    
    // @Then("the order contains {int} drink")
    // public void check_order_size(int size) {
    //     assertEquals(size, o.getDrinks().size());
    // }

    @When("a(nother?) {string} is added to the order")
    public void add_drink_to_the_order(String drinkName){ 
        o.getDrinks().add(new Order.Drink(drinkName));
    }

    @Then("the order contains {int} drink(s?)")
    public void check_order_size(int size) { 
        assertEquals(size, o.getDrinks().size());
    }

    @Then("the order contains {int} {string}")
    public void check_order_contents(int size, String drink) {
        long count = o.getDrinks().stream()
                    .filter(d -> d.getName().equals(drink))
                    .count();
        assertEquals(size,count);
    }

}
