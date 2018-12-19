package yui.hesstina.delegated;

public class AdapterCharge extends Charge {

    Volt volt = new Volt();

    @Override
    public int charging() {
        return volt.getVoltage() / 10;
    }
}
