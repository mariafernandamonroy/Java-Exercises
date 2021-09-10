package Exercise16;

public class Persona {

    private String nombre = "";
    private int edad = 0;
    private String dni;
    private String sexo = "H";
    private int peso = 0;
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

    public Persona(String nombre, int edad, String sexo, int peso, int altura){
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

    public int getPeso() {
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
}
