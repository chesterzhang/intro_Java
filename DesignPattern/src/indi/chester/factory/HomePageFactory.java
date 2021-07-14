package indi.chester.factory;

public class HomePageFactory {
    public static IHomePage getHomePage(String country){
        if (country.equals("China")){
            return new ChineseHomePage();
        }else if (country.equals("USA")){
            return new EnglishHomePage();
        }else {
            return null;
        }
    }
}
