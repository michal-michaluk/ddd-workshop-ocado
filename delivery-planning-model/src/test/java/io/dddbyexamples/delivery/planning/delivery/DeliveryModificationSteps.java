package io.dddbyexamples.delivery.planning.delivery;

import cucumber.api.PendingException;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import io.dddbyexamples.delivery.planning.delivery.DeliveryService;
import io.dddbyexamples.delivery.planning.delivery.Payload;
import io.dddbyexamples.delivery.planning.delivery.ScheduleDelivery;
import io.dddbyexamples.delivery.planning.delivery.Transport;
import lombok.Value;

import java.util.List;

public class DeliveryModificationSteps {

    DeliveryService deliveryService;

    @When("^new delivery is scheduled at \"([^\"]*)\" with \"([^\"]*)\" of capacity (\\d+):$")
    public void newDeliveryIsScheduledAtWithOfCapacity(String time,
                                                       String transportType, int capacity,
                                                       List<ProductPayload> payload) throws Throwable {
        ScheduleDelivery command = new ScheduleDelivery(
                new Transport(time, transportType, capacity),
                new Payload(ProductPayload.toPayload(payload))
        );

        deliveryService.schedule(command);
    }

    @Given("^(\\d+) pieces of product \"([^\"]*)\" are stored on \"([^\"]*)\"$")
    public void piecesOfProductAreStoredOn(int arg0, String arg1, String arg2) throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        throw new PendingException();
    }

    @Given("^customers demands for tomorrow:$")
    public void customersDemandsForTomorrow() throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        throw new PendingException();
    }

    @Then("^plan was changed$")
    public void planWasChanged() throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        throw new PendingException();
    }

    @And("^Transport capacity is not exceeded$")
    public void transportCapacityIsNotExceeded() throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        throw new PendingException();
    }

    @And("^customers demands are fulfilled$")
    public void customersDemandsAreFulfilled() throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        throw new PendingException();
    }

    @Then("^plan was NOT changed$")
    public void planWasNOTChanged() throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        throw new PendingException();
    }

    @And("^Transport capacity is exceeded$")
    public void transportCapacityIsExceeded() throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        throw new PendingException();
    }

    @And("^customers demands are not fulfilled$")
    public void customersDemandsAreNotFulfilled() throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        throw new PendingException();
    }

    @Given("^delivery \"([^\"]*)\" scheduled at \"([^\"]*)\" with \"([^\"]*)\" of capacity (\\d+):$")
    public void deliveryScheduledAtWithOfCapacity(String arg0, String arg1, String arg2, int arg3) throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        throw new PendingException();
    }

    @When("^delivery \"([^\"]*)\" is cancelled$")
    public void deliveryIsCancelled(String arg0) throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        throw new PendingException();
    }

    @Value
    public static class ProductPayload {
        String product;
        int storageUnits;

        public static Object toPayload(List<ProductPayload> list) {
            return null;
        }
    }
}
