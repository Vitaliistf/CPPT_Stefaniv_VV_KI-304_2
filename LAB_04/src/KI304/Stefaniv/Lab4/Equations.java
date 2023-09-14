package KI304.Stefaniv.Lab4;

/**
 * The Equations class provides a method to solve a mathematical equation for a given input value 'x'.
 * The equation calculates y = tan(x) * (1 / tan(2x)).
 * If the input 'x' is NaN (Not-a-Number), a CalcException is thrown with an "Invalid input x" message.
 * If an ArithmeticException occurs during the calculation, it is caught, and a CalcException with the
 * same error message as the original exception is thrown.
 */
public class Equations {

    /**
     * Solves the mathematical equation for the given input 'x'.
     *
     * @param x The input value for the equation.
     * @return The result 'y' of the equation.
     * @throws CalcException If 'x' is NaN or if an ArithmeticException occurs during the calculation or result is NaN.
     */
    public double solve(double x) throws CalcException {
        if (Double.isNaN(x)) {
            throw new CalcException("Invalid input x.");
        }
        double y;
        try {
            y = Math.tan(x) * (1 / Math.tan(2 * x));
        } catch (ArithmeticException e) {
            throw new CalcException(e.getMessage(), e);
        }
        if(Double.isNaN(y)) {
            throw new CalcException("Result is not a number.");
        }
        return y;
    }
}


