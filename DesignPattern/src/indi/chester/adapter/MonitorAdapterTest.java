package indi.chester.adapter;

public class MonitorAdapterTest {
    public static void main(String[] args) {
        DC20V monitorAdapter = new MonitorAdapter(new AC220V());
        monitorAdapter.outputDC20V();
    }
}
