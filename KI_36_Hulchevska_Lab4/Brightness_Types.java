package KI_36_Hulchevska_Lab4;

public class Brightness_Types {
    // Type for brigthness
    enum Types {Medium, Bright, Dark};
    // current type of brightness
    private Types type;
    /**
     * Constructor
     */
    public Brightness_Types()
    {
        type = Types.Medium;
    }
    /**
     * Method sets bright type
     */
    public void setBrightType()
    {
        type = Types.Bright;
    }
    /**
     * Method sets medium type
     */
    public void setMediumType()
    {
        type = Types.Medium;
    }
    /**
     * Method sets dark type
     */
    public void setDarkType()
    {
        type = Types.Dark;
    }
    /**
     * Method resets type of brightness to medium type
     */
    public void reset_Type_of_light()
    {
        setMediumType();
    }
    /**
     * Method returns type of brightness
     * @return Type of brightness of <code>Brightness_Types.Types</code> type
     */
    public Types getType()
    {
        return type;
    }
}
