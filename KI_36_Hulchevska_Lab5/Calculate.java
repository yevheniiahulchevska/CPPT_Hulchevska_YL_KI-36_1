package KI_36_Hulchevska_Lab5;

public class Calculate {
    // Метод обраховує вираз y=1/ctg(2x)
    public double execute(int x) throws CalculateException {
        double y, rad;
        y = 0.0;
        rad = Math.toRadians(2*x);
        try {
            y = Math.tan(rad);
            //якщо результат не є числом, то генеруємо виключення
            if (y == Double.NEGATIVE_INFINITY || y == Double.POSITIVE_INFINITY || Double.isNaN(y) || x == 180 || x == -180) {
                throw new ArithmeticException("Wrong value of x");
            }
        } catch (ArithmeticException e) {
            // обробка виключення
            // виключення вищого рівня з поясненням причини виникнення помилки
                if (Math.abs(rad) == Math.PI / 2.0) {
                    throw new CalculateException("Illegal value of X for cotangent function");
                }
        }
        return y;
    }
}
