package technics;

/**
 * Created by ArtemPopov on 03.07.2019.
 */
public class Laptop extends Gadget implements Computer {

    private String lightColor;
    private boolean touchpad;


    public Laptop(double benchmark, double price, String name, String lightColor, boolean touchpad) {
        super(benchmark, price, name);
        this.lightColor = lightColor;
        this.touchpad = touchpad;
    }


    public String getAllInformation() {
        return "Laptop:\nName: " + this.getName()
                + "\nPrice: " + this.getPrice()
                + "\nBenchmark: " + this.getBenchmark()
                + "\nLightColor: " + lightColor + "\nTouchpad: " + touchpad;

    }

    public String getDifferences() {
        return "LightColor: " + lightColor + "\nTouchpad: " + touchpad;
    }


}
