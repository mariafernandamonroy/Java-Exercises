package Exercise17;

public class Lavadora extends Electrodomestico{

    static final double charge_default = 5;
    private double charge = charge_default;

    public Lavadora(){
        super();
        this.charge = charge_default;
    }
    public Lavadora(double base_price, double weight){
        super(base_price, weight);
        this.charge = charge_default;
    }
    public Lavadora(char energy_demand, double base_price, String color, double weight,double charge){
        super(energy_demand, base_price,color, weight);
        this.charge = charge;
    }

    public double getCharge() {
        return charge;
    }
    public double final_price(){
        double price;
        price = super.final_price();
        if(this.charge > 30){
            price += 50;
        }
        return price;
    }
}
