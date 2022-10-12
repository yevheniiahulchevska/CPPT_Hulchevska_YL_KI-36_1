package KI_36_Hulchevska_Lab4;
import java.io.*;
public class Colour {
    // Type for colour
    enum Types {White, Warm, Mixed_White_Warm, Green, Red, Blue, Pink, Violet};
    // current colour type
    private Types type;
    /**
     * Constructor
     */
    public Colour()
    {
        type = Types.Mixed_White_Warm;
    }
    /**
     * Method sets White colour
     */
    public void setWhite()
    {
        type = Types.White;
    }
    /**
     * Method sets Warm colour
     */
    public void setWarm()
    {
        type = Types.Warm;
    }
    /**
     * Method sets Mixed_White_Warm colour
     */
    public void setMixed_White_Warm()
    {
        type = Types.Mixed_White_Warm;
    }
    /**
     * Method sets Green colour
     */
    public void setGreen()
    {
        type = Types.Green;
    }
    /**
     * Method sets Red colour
     */
    public void setRed()
    {
        type = Types.Red;
    }
    /**
     * Method sets Blue colour
     */
    public void setBlue()
    {
        type = Types.Blue;
    }
    /**
     * Method sets Pink colour
     */
    public void setPink()
    {
        type = Types.Pink;
    }
    /**
     * Method sets Violet colour
     */
    public void setViolet()
    {
        type = Types.Violet;
    }
    /**
     * Method resets colour type to Mixed_White_Warm state
     */
    public void resetColour()
    {
        setMixed_White_Warm();
    }
    /**
     * Method returns scrolling direction
     * @return Scrolling direction of <code>Scrooller.Directions</code> type
     */
    public Types getType()
    {
        return type;
    }
}
