package KI_36_Hulchevska_Lab4;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;

public abstract class Lamp {
        public abstract void moveBulb(int xPos, int yPos);
        public abstract void setBulbPosition(int xPos, int yPos);
        public abstract int getBulbXPosition();
        public abstract int getBulbYPosition();
        public abstract void brightness_Bright();
        public abstract void brightness_Dark();
        public abstract void reset_brightness();
        public abstract Brightness_Types.Types get_brightness_type();
        public abstract void Colour_White();
        public abstract void Colour_Warm();
        public abstract void Colour_Green();
        public abstract void Colour_Red();
        public abstract void Colour_Blue();
        public abstract void Colour_Pink();
        public abstract void Colour_Violet();
        public abstract void reset_colour();
        public abstract Colour.Types get_colour_type();
        public abstract void dispose();
}
