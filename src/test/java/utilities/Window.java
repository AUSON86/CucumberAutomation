package utilities;

import java.util.Set;

public class Window {

    private static String mainHandle;

    public static void  switchToSecondWindow(){
        Set<String> windowhandles = Driver.getDriver().getWindowHandles();
        String mainHandle = Driver.getDriver().getWindowHandle();
        if (windowhandles.size() < 2){
            System.out.println("No multiple windows found");
        }else{
            for (String windowID: windowhandles){
                if (windowID.equals(mainHandle)){
                    Driver.getDriver().switchTo().window(windowID);
                }
            }
        }
    }

    public static void switchToMainWindow(){
        if (mainHandle != null){
            Driver.getDriver().switchTo().window(mainHandle);
        }
    }

    public static void switchToWindow(String title){
        mainHandle = Driver.getDriver().getWindowHandle();
        Set<String> windowHandles = Driver.getDriver().getWindowHandles();
        if (windowHandles.size() < 2){
            System.out.println("No multiple windows found");
        }else{
            for (String window: windowHandles){
                Driver.getDriver().switchTo().window(window);
                if (title.equals(Driver.getDriver().getTitle())){
                    break;
                }
            }
        }
    }



}

