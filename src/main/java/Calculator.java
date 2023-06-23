public class Calculator {
    private String level;

    public int sum(int a, int b) {
        return a + b;
    }

    public int divInt(int a, int b){
        if (b==0) {
            throw new ArithmeticException("Can't divide by zero!!!");
        }
        return a / b;
    }
   public int divDouble(double a, double b){
       if (b==0) {
           throw new ArithmeticException("Can't divide by zero!!!");
       }
        return (int) (a / b);
    }

    public String getLevel() {
        return level;
    }

    public void setLevel(String level) {
        this.level = level;
    }

}
