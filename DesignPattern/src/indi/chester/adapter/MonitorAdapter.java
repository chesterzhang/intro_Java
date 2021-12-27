package indi.chester.adapter;

public class MonitorAdapter implements DC20V {
    private AC220V ac220V;

    public MonitorAdapter(AC220V ac220V) {
        this.ac220V = ac220V;
    }

    @Override
    public int outputDC20V() {
        int AC220V = ac220V.outputAC220V();
        System.out.println("Converting from AC220V to DC 20V.");
        return AC220V/11;
    }
}
