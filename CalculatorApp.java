import java.util.ArrayList;

interface MathOperation {
    public double compute(double a, double b);
}

public class CalculatorApp {

    public static MathOperation sub() {
        // TODO: Define a class named SubtractionOperation that implements
        // MathOperation within this java source file, and outside of this
	// CalculatorApp class definition.  Note that this class definition
	// cannot be public because it is not being defined inside a file
	// that matches this class name.  The compute method in this class
	// should be defined to return the difference (first minus second)
	// of it's operands.  On the line below, return an instance of this
	// class from this method (instead of returning null).
	return null;
    }

    public static MathOperation add() {
        // TODO:  Return a new instance (instead of the null below) of an
	// anonymous class that implements MathOperation and defines its
	// compute method to return the sum of its operands. 
	return null;
    }

    public static MathOperation mul() {
        // TODO: Use a lambda expression on the line below to create and
        // return (instead of the null below) an object with a compute method
	// that returns the product of its operands.
	return null;
    }

    /**
     * DO NOT MAKE ANY CHANGES TO THE MAIN METHOD BELOW FOR THIS ACTIVITY.
     * 
     * This main method uses the objects returned by the methods above to
     * display the sum, difference, and product of operands between 1 and 5.
     * @param args is not used by this program
     */
    public static void main(String[] args) {
        // add all math operations to this array
        ArrayList<MathOperation> ops = new ArrayList<>();
        ops.add( add() );
        ops.add( sub() );
        ops.add( mul() );

        // display table of math operations applied to operands
        System.out.println("Operands:  add  sub  mul");
        for(int b = 1; b < 6; b++) // second operand (b) goes from 1 to 5
            for(int a = b + 1; a < 6; a++) { // first operand from b+1 to 5
                System.out.print("     "+a+","+b+":"); // print operands first
                for(MathOperation op: ops)
                    if(op != null) // then print out result of operation
                        System.out.printf( "%5.1f", op.compute(a,b) );
                    else // or a dash when the operation is null
                        System.out.print("    -");
                System.out.println(); // print each operand pair on a new line
            }
    }
}
