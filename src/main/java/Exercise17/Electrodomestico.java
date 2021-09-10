package Exercise17;

import java.util.Arrays;
import java.util.List;

public class Electrodomestico {

    private double base_price;
    private double weight;
    private String color;
    static final List<String> energy_demand = Arrays.asList("A","B","C","D","E","F");
//            Arrays.asList("blanco"," negro", "rojo", "azul", "gris");
    static final String color_default = "blanco";
    static final double price_default = 100;
    static final int weight_default = 5;

    public Electrodomestico(){
        this.base_price = 100;
        this.color = color_default;
        this.weight = weight_default;

    }
}
