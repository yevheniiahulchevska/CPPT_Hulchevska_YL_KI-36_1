package KI_36_Hulchevska_Lab4;

// Class <code>Position</code> implements relative positioning
 //       coordinate system
public class Position {
    // coordinates of the mouse position
    private int x, y;
    /**
     * Constructor
     */
    public Position()
    {
        x = 0;
        y = 0;
    }
    /**
     * Constructor
     * @param </code>xPos</code> The X coordinate value
     * @param </code>yPos</code> The Y coordinate value
     */
    public Position(int xPos, int yPos)
    {
        x = xPos;
        y = yPos;
    }
    /**
     * Method returns the X coordinate value
     * @return The X coordinate value
     */
    public int getXPosition()
    {
        return x;
    }
    /**
     * Method returns the Y coordinate value
     * @return The Y coordinate value
     */
    public int getYPosition()
    {
        return y;
    }

    /**
     * Method returns coordinates of the position in the <code>obj</code>,
     that is passed into method through method parameter
     * @param </code>obj</code> The object, where coordinates of the current
    position are set
     */
    public void getPosition(Position obj)
    {
        obj.x = x;
        obj.y = y;
    }
    /**
     * Method sets the X coordinate value
     * @param </code>xPos</code> The X coordinate value
     */
    public void setXPosition(int xPos)
    {
        x = xPos;
    }
    /**
     * Method sets the Y coordinate value
     * @param </code>yPos</code> The Y coordinate value
     */
    public void setYPosition(int yPos)
    {
        y = yPos;
    }
}
