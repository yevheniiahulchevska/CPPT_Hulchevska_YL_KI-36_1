package KI_36_Hulchevska_Lab6;

public class Equation {

    // метод повертає y=2*tan(x) як double

    public static double calculate(double xDegrees) throws CalculateException {
        //виключення вищого рівня з поясненням причини виникнення помилки
        if (xDegrees % 180.0d == 0.0d)
            throw new CalculateException("Degrees have illegal value for equation: y=sin(x)/1/(8*tan(x))");

        double rad = Math.toRadians(2*xDegrees);
        double y = Math.tan(rad);
        //якщо результат не є числом, генеруємо виключення
        if (y == Double.NaN || Double.isInfinite(y))
            throw new CalculateException("Unknown reason caused throw during calculations");

        return y;
    }
}
