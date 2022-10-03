package lab3_bulb;
import static java.lang.System.out;
import java.io.*;
//Lab03 class implements main method for Bulb class possibilities demonstration
public class Lab03 {
    public static void main(String[] args) throws FileNotFoundException
    {
        Bulb bulb = new Bulb();
        //bulb.setBulbPosition(5, -5);
        bulb.moveBulb(5, -5);
        bulb.brightness_Dark();
        bulb.Colour_Warm();
        bulb.dispose();
    }
}
