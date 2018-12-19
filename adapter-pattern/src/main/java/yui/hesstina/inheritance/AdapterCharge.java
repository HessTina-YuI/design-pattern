package yui.hesstina.inheritance;

public class AdapterCharge extends Volt implements Charge {

    @Override
    public int charging() {
        return stepDown();
    }

    private int stepDown() {
        return getVoltage() / 10;
    }


}
