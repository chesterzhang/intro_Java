package indi.chester.factory;

public class ChineseHomePage implements IHomePage{
    @Override
    public String showInfo() {
        return "这是中文首页.";
    }
}
