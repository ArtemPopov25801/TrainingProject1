package technics;

/**
 * Created by ArtemPopov on 03.07.2019.
 */
public class Gadget {

    private double price;
    private String name;
    private double benchmark;

    public Gadget() {

    }

    public Gadget(double benchmark, double price, String name) {
        this.benchmark = benchmark;
        this.price = price;
        this.name = name;
    }


    public double getPrice() {
        return price;
    }

    public String getName() {
        return name;
    }

    public double getBenchmark() {
        return benchmark;
    }
}
