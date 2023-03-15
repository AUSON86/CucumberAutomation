package utilities;

import org.openqa.selenium.interactions.Actions;

public class Flow {

    //create a static method wait that accepts integer milisecond
    // the method simply uses Thread sleep with exception handled
    // Flow.wait(500);
    public static void wait(int miliseconds) {
        try {
            Thread.sleep(miliseconds);
        } catch (InterruptedException e) {
            System.out.println("Interruption Happened");
        }
    }

    public static void scrollDown(int deltaY) {
        Actions actions = new Actions(Driver.getDriver());
        actions.scrollByAmount(0, deltaY).perform();

    }

    public static void scrollUp(int deltaY) {
        Actions actions = new Actions(Driver.getDriver());
        actions.scrollByAmount(0, -deltaY).perform();

    }
}