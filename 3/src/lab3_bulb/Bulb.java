package lab3_bulb;
import java.io.*;
/**
 * Class </code>Bulb</code> implements bulb
 *
 *
 * */
public class Bulb{
        private Colour colour;
        private Brightness_Types brightness;
        private Position pos;
        private PrintWriter fout;
        /**
         * Constructor
         * @throws FileNotFoundException
         */
        public Bulb() throws FileNotFoundException
        {
            colour = new Colour();
            brightness = new Brightness_Types();
            pos = new Position();
            fout = new PrintWriter(new File("Log.txt"));
        }
        /**
             * Method implements bulb position offset on (xPos, yPos)
             * @param </code>xPos</code> The X coordinate of the bulb position
             * @param </code>yPos</code> The Y coordinate of the bulb position
             */
        public void moveBulb(int xPos, int yPos)
        {
            pos.setXPosition(pos.getXPosition() + xPos);
            pos.setYPosition(pos.getYPosition() + yPos);
            fout.print("Bulb's X position: " + pos.getXPosition() + "\n");
            fout.print("Bulb's Y position: " + pos.getYPosition() + "\n");
        }
        /**
         * Method sets the new bulb position
         * @param </code>xPos</code> The X coordinate of the bulb position
         * @param </code>yPos</code> The Y coordinate of the bulb position
         */
        public void setBulbPosition(int xPos, int yPos)
        {
            pos.setXPosition(xPos);
            pos.setYPosition(yPos);
        }
        /**
         * Method returns bulb's current X position
         * @return Bulb's current X position
         */
        public int getBulbXPosition()
        {
            return pos.getXPosition();
        }
        /**
         * Method returns bulb's current Y position
         * @return Bulb's current Y position
         */
        public int getBulbYPosition()
        {
            return pos.getYPosition();
        }

        /**
         * Method simulates Bright brightness of the bulb
         */
        public void brightness_Bright()
        {
            brightness.setBrightType();
            fout.print("Bulb brightness's is bright\n");
            fout.flush();
        }
        /**
         * Method simulates Dark brightness of the bulb
         */
        public void brightness_Dark()
        {
            brightness.setDarkType();
            fout.print("Bulb brightness's is dark\n");
            fout.flush();
        }
        /**
         * Method simulates bulb's brightness setting in a standart (Medium) type
         */
        public void reset_brightness()
        {
            brightness.reset_Type_of_light();
            fout.print("Bulb brightness's is medium");
            fout.flush();
        }
        /**
         * Method returns bulb's brightness type
         * @return Bulb's brightness type of </code>Brightness_Types.Types</code> type
         */
        public Brightness_Types.Types get_brightness_type()
        {
            return brightness.getType();
        }

        /**
         * Method simulates White colour of the bulb
         */
        public void Colour_White()
        {
            colour.setWhite();
            fout.print("Bulb colour is white\n");
            fout.flush();
        }
        /**
         * Method simulates Warm colour of the bulb
         */
        public void Colour_Warm()
        {
            colour.setWarm();
            fout.print("Bulb colour is warm\n");
            fout.flush();
        }
        /**
         * Method simulates Green colour of the bulb
         */
        public void Colour_Green()
        {
            colour.setGreen();
            fout.print("Bulb colour is green\n");
            fout.flush();
        }
        /**
         * Method simulates Red colour of the bulb
         */
        public void Colour_Red()
        {
            colour.setRed();
            fout.print("Bulb colour is red\n");
            fout.flush();
        }
        /**
         * Method simulates Blue colour of the bulb
         */
        public void Colour_Blue()
        {
            colour.setBlue();
            fout.print("Bulb colour is blue\n");
            fout.flush();
        }
        /**
         * Method simulates Pink colour of the bulb
         */
        public void Colour_Pink()
        {
            colour.setPink();
            fout.print("Bulb colour is pink\n");
            fout.flush();
        }
        /**
         * Method simulates Violet colour of the bulb
         */
        public void Colour_Violet()
        {
            colour.setViolet();
            fout.print("Bulb colour is violet\n");
            fout.flush();
        }
        /**
         * Method simulates bulb's colour setting a standart (Mixed_White_Warm) type
         */
        public void reset_colour()
        {
            colour.resetColour();
            fout.print("Bulb brightness's is mixed (white and warm)");
            fout.flush();
        }
        /**
         * Method returns bulb's colour type
         * @return Bulb's colour type of </code>Colour.Types</code> type
         */
        public Colour.Types get_colour_type()
        {
            return colour.getType();
        }
        /**
         * Method releases used recourses
         */
        public void dispose()
        {
            fout.close();
        }
}
