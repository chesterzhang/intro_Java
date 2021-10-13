import org.junit.Test;

public class CalculatorTest {
    private Calculator cal=new Calculator();

    @Test
    public void add() {
        int result=cal.add(1,2);
        System.out.println(result);
    }

    @Test
    public void divide() {
        float result=cal.divide(1,0);
        System.out.println(result);
    }
}