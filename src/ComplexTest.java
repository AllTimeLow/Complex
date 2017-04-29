import static org.junit.Assert.*;

/**
 * Created by LaneBoy on 29.04.17.
 */
public class ComplexTest {
    Complex a,b;
    @org.junit.Before
    public void setUp() throws Exception {
        a = new Complex(0,0);
        b = new Complex(0.3,0.5);
    }

    @org.junit.Test
    public void sum() throws Exception {
        double sum =0;
        for(double i=-100;i<100;i+=0.1) {
            sum+=i;
            a=a.sum(new Complex(i,i));
            org.junit.Assert.assertEquals(a.x,sum,1E-7);
            org.junit.Assert.assertEquals(a.y,sum,1E-7);
        }
    }

    @org.junit.Test
    public void minus() throws Exception {

    }

    @org.junit.Test
    public void mult() throws Exception {

    }

    @org.junit.Test
    public void div() throws Exception {

    }

    @org.junit.Test
    public void abs() throws Exception {

    }

    @org.junit.Test
    public void cont() throws Exception {

    }

    @org.junit.Test
    public void arg() throws Exception {

    }

}