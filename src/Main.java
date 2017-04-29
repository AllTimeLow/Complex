
public class Main {
    public static void main(String[] args) {
        Complex c=new Complex(0.9,0.8);
        Complex b=c.sum(new Complex(0.9,0.8));
        Complex x = new Complex(0,0);
        try {
            x.arg();
        }
        catch(Exception ex) {
            System.out.print(ex.getMessage());
        }
    }
}
