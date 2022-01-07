package indi.chester.staticproxy;

public class Application {
    public static void main(String[] args) {
        UserService userService = new UserServiceProxy(new UserServiceImpl() );
        userService.createUser();
    }
}
