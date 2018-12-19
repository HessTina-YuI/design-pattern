package yui.hesstina.delegated;

public class Main {

    public static void main(String[] args) {
        Charge charge = new AdapterCharge();

        System.out.println(charge.charging() + "V");
    }
}
