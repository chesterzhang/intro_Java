package indi.chester.exception;

//优雅的处理异常, 抛出自定义异常
public class GraceException {

    public static void display(String errMsg) {
        throw new MyCustomException(errMsg);
    }

}
