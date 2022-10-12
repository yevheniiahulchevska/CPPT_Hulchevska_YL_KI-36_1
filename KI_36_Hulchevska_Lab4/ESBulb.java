package KI_36_Hulchevska_Lab4;
import java.io.*;

public class ESBulb extends Bulb implements ESBulbInterface{
    public ESBulb() throws FileNotFoundException {
        new Bulb();
    }
    public void SetTablePosition()
    {
        setBulbPosition(26,-7);
    }
}
