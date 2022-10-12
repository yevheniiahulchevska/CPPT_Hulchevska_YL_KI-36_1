package KI_36_Hulchevska_Lab4;
import java.io.*;
//Lab03 class implements main method for Bulb class possibilities demonstration
public class Lab04 {
 public static void main(String[] args) throws FileNotFoundException {
     Bulb bulb = new Bulb();
     bulb.setBulbPosition(5, -5);
     //bulb.moveBulb(5, -5);
     bulb.brightness_Dark();
     bulb.Colour_Warm();
     bulb.dispose();
     ESBulb esbulb = new ESBulb();
     esbulb.Colour_Green();
     esbulb.SetTablePosition();
     esbulb.BulbPosition();
     esbulb.dispose();
 }
}
