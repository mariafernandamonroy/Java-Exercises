package Exercise16;

import java.util.Arrays;
import java.util.List;

public class Persona {

    static final List<String> LETRAS_DNI= Arrays.asList("T","R","W","A","G","M","Y","F","P","D","X","B","N","J","Z","S","Q","V","H","L","C","K","E");
    private String nombre = "";
    private int edad = 0;
    private String dni;
    private String sexo = "M";
    private double peso = 0;
    private double altura = 0;

    public Persona(){
        this.nombre = "";
        this.edad = 0;
        this.sexo = check_sex(this.sexo);
        this.peso = 0;
        this.altura = 0;
        generate_DNI();
    }

    public Persona(String nombre, int edad, String sexo){
        this.nombre = nombre;
        this.edad = edad;
        this.sexo = sexo;
        this.peso = 0;
        this.altura = 0;
        generate_DNI();
    }

    public Persona(String nombre, int edad, String sexo, double peso, double altura){
        this.nombre = nombre;
        this.edad = edad;
        this.sexo = sexo;
        this.peso = peso;
        this.altura = altura;
        generate_DNI();
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(int peso) {
        this.peso = peso;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }
    public double calculate_IMC(){

        double imc;
        double result = 0;
        double low_imc = -1;
        double adequate_imc = 0;
        double high_imc = 1;
        double low_limit_imc = 20;
        double high_limit_imc = 25;
        imc = getPeso() / getAltura();
        if(imc < low_limit_imc){
            result = low_imc;
        }else if(imc >= low_limit_imc && imc <= high_limit_imc ){
            result = adequate_imc;
        }else if(imc > high_limit_imc ){
            result = high_imc;
        }

        return result;
    }
    public boolean is_legal_age(){

        boolean result = false;
        double legel_age = 18;
        double age = getEdad();
        if(age >= legel_age){
            result = true;
        }else if(age < legel_age) {
            result = false;
        }

        return result;
    }
    private String check_sex(String sex){

        String default_sex = getSexo();
        if(sex.equalsIgnoreCase("F")){
            default_sex = "F";
        }

        return default_sex;
    }
    public String toString(){

        String object;
        object = "Persona{" + "nombre: "+ nombre +
                    ", edad: " + edad +
                    ", peso: " + peso +
                    ", altura: " + altura +
                    ", sexo: " + sexo +
                    ", DNI: "+ dni + "}";
        return object;
    }
    public void generate_DNI(){

        int dni;
        int remainder;
        int divident = 23;
        dni =  (int) (100000000 * Math.random());
        remainder = dni % divident;
        this.dni =dni + "-"+LETRAS_DNI.get(remainder);

    }
}
