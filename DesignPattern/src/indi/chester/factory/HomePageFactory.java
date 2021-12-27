package indi.chester.factory;

public class HomePageFactory {
    public static IHomePage getHomePage(String country){
        switch (country){
            case "China":
                return new ChineseHomePage();
            case "USA":
                return new EnglishHomePage();
            default:
                return null;
        }

    }
}
