package technics;

/**
 * Created by ArtemPopov on 03.07.2019.
 */
public class Desktop extends Gadget implements Computer {

    private int displaysCount;
    private boolean externalCooling;

    public Desktop(double benchmark, double price, String name, int displaysCount, boolean externalCooling) {
        super(benchmark, price, name);
        this.displaysCount = displaysCount;
        this.externalCooling = externalCooling;
    }

    public String getAllInformation() {
        return "Desktop:\nName: " + this.getName()
                + "\nPrice: " + this.getPrice()
                + "\nBenchmark: " + this.getBenchmark()
                + "\nDisplaysCount: " + displaysCount + "\nExternalCooling: " + externalCooling;

    }

    public String getDifferences() {
        return "DisplaysCount: " + displaysCount + "\nExternalCooling: " + externalCooling;
    }
}
