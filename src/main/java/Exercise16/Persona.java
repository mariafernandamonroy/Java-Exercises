package Exercise16;

public class Persona {

    private String nombre = "";
    private int edad = 0;
    private String dni;
    private String sexo = "H";
    private double peso = 0;
    private double altura = 0;

    public Persona(){
        this.nombre = "";
        this.edad = 0;
        this.sexo = "H";
        this.peso = 0;
        this.altura = 0;
    }

    public Persona(String nombre, int edad, String sexo){
        this.nombre = nombre;
        this.edad = edad;
        this.sexo = sexo;
        this.peso = 0;
        this.altura = 0;
    }

    public Persona(String nombre, int edad, String sexo, double peso, double altura){
        this.nombre = nombre;
        this.edad = edad;
        this.sexo = sexo;
        this.peso = peso;
        this.altura = altura;
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

}
