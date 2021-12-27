package indi.chester.adapter;

public class LaptopAdapter extends AC220V implements  DC20V {
    @Override
    public int outputDC20V() {
        int AC220V  = outputAC220V();
        System.out.println("Converting from AC220V to DC 20V.");
        return AC220V/11;
    }
}
