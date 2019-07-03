package technics;

/**
 * Created by ArtemPopov on 03.07.2019.
 */
public class Smartphone extends Gadget implements Computer {

    private boolean keyboard;
    private String network;

    public Smartphone(double benchmark, double price, String name, boolean keyboard, String network) {
        super(benchmark, price, name);
        this.keyboard = keyboard;
        this.network = network;
    }

    public String getAllInformation() {
        return "Smartphone:\nName: " + this.getName()
                + "\nPrice: " + this.getPrice()
                + "\nBenchmark: " + this.getBenchmark()
                + "\nKeyboard: " + keyboard + "\nNetwork: " + network;

    }

    public String getDifferences() {
        return "Keyboard: " + keyboard + "\nNetwork: " + network;
    }


}
