package Exercise17;

import java.util.Arrays;
import java.util.List;

public class Electrodomestico {

//    static final List<String> energy_demand = Arrays.asList("A","B","C","D","E","F");
    //            Arrays.asList("blanco"," negro", "rojo", "azul", "gris");
    static final String color_default = "blanco";
    static final double price_default = 100;
    static final int weight_default = 5;
    static final char energy_default = 'F';
    private char energy_demand = energy_default;
    private double base_price = price_default;
    private String color = color_default;
    private double weight = weight_default;


    public Electrodomestico(){
        this.energy_demand = energy_default;
        this.base_price = price_default;
        this.color = color_default;
        this.weight = weight_default;
    }
    public Electrodomestico(double base_price, double weight){
        this.energy_demand = energy_default;
        this.base_price = base_price;
        this.color = color_default;
        this.weight = weight;
    }
    public Electrodomestico(char energy_demand, double base_price, String color, double weight){
        this.energy_demand = energy_demand;
        this.base_price = base_price;
        this.color = color;
        this.weight = weight;
    }

    public double getBase_price() {
        return base_price;
    }

    public void setBase_price(double base_price) {
        this.base_price = base_price;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }


}
