
public class Calculator {
    public int add(int a, int b){
        return a+b;
    }

    public float divide(int a, int b){
        if (b==0){
            throw new ArithmeticException("除数不能为0!");
        }
        return a*1f/b;
    }
}
