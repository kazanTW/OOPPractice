public class Fraction {
    protected int dividend;
    protected int divisor;

    public Fraction(int dividend, int divisor) {
        this.dividend = dividend;
        this.divisor = divisor;
    }
    
    public void frac1() {
        try {
            System.out.println(this.dividend / this.divisor);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    public void frac2() throws DivZeroException {
        if (this.divisor == 0) throw new DivZeroException();
        else System.out.println(this.dividend / this.divisor);
    }

    public static void main(String[] args) {
        Fraction division1 = new Fraction(12, 5);
        Fraction division2 = new Fraction(12, 0);
        
        System.out.print("12 / 5: ");
        division1.frac1();
        System.out.println("12 / 0: ");
        division2.frac1();

        try {
            division2.frac2();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}

class DivZeroException extends Exception {
    public DivZeroException() {
        super("Divided by ZERO.");
    }
}
