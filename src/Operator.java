import javafx.scene.input.KeyCode;

import java.awt.*;
import java.awt.event.KeyEvent;

public class Operator
{
    public static void main(String[] args) {
        try
        {
            Robot robot = new Robot();
            Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
            while (true)
            {
                if (robot.getPixelColor(screenSize.width/2,screenSize.height/2).toString() == "java.awt.Color[r=0,g=255,b=0]"){
                Thread.sleep(1000);
                robot.keyPress(KeyEvent.VK_ENTER);
                robot.keyRelease(KeyEvent.VK_ENTER);
                
                }
            }
        }
        catch (Exception e)
        {
            System.out.println(e.getMessage());
        }
    }

    public static void keyClick(Robot robot, int keyCode)
    {
        robot.keyPress(keyCode);
        robot.keyRelease(keyCode);
    }

}
