package Exercise17;

import java.util.Arrays;
import java.util.List;

public class Electrodomestico {

    static final String color_default = "blanco";
    static final double price_default = 100;
    static final int weight_default = 5;
    static final char energy_default = 'F';
    private char energy_demand = energy_default;
    private double base_price = price_default;
    private String color = color_default;
    private double weight = weight_default;


    public Electrodomestico(){
        this.energy_demand = check_energy_demand(this.energy_demand);
        this.base_price = price_default;
        this.color = check_color(this.color);
        this.weight = weight_default;
    }
    public Electrodomestico(double base_price, double weight){
        this.energy_demand = check_energy_demand(this.energy_demand);
        this.base_price = base_price;
        this.color = check_color(this.color);
        this.weight = weight;
    }
    public Electrodomestico(char energy_demand, double base_price, String color, double weight){
        this.energy_demand = check_energy_demand(energy_demand);
        this.base_price = base_price;
        this.color = check_color(color);
        this.weight = weight;
    }

    public char getEnergy_demand() {
        return energy_demand;
    }

    public double getBase_price() {
        return base_price;
    }

    public String getColor() {
        return color;
    }

    public double getWeight() {
        return weight;
    }
    private char check_energy_demand(char demand){

        char s = energy_demand;
        if('A' == demand || 'B' == demand || 'C' == demand || 'D' == demand || 'F' == demand ){
            s = demand;
        }

        return s;
    }
    private String check_color(String color_input){
        String color = color_default;
        if("blanco".equalsIgnoreCase(color_input) ||
            "negro".equalsIgnoreCase(color_input) ||
            "rojo".equalsIgnoreCase(color_input) ||
            "azul".equalsIgnoreCase(color_input) ||
            "gris".equalsIgnoreCase(color_input))
        {
            color = color_input;
        }
        return color;
    }
    public double final_price() {
        switch (this.energy_demand) {
            case 'A': {
                this.base_price += 100;
                break;
            }
            case 'B': {
                this.base_price += 80;
                break;
            }
            case 'C': {
                this.base_price += 60;
                break;
            }
            case 'D': {
                this.base_price += 50;
                break;
            }
            case 'E': {
                this.base_price += 30;
                break;
            }
            case 'F': {
                this.base_price += 10;
                break;
            }
        }
        if(this.weight >= 0 && this.weight < 19){
            this.base_price += 10;
        }else if(this.weight >= 20 && this.weight < 49){
            this.base_price += 50;
        }else if(this.weight >= 50 && this.weight < 79){
            this.base_price += 80;
        }else if(this.weight >= 80){
            this.base_price += 100;
        }

        return this.base_price;
    }
}
