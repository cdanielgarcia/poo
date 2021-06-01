package poo;

/**
 * @author user
 */
public class persona {
    int id_persona;
    int edad;
    double salario;
    String nombre;

    public persona(int id_persona, int edad, double salario, String nombre) {
        this.id_persona = id_persona;
        this.edad = edad;
        this.salario = salario;
        this.nombre = nombre;
    }

    public persona() {
    }

    public int getId_persona() {
        return id_persona;
    }

    public void setId_persona(int id_persona) {
        this.id_persona = id_persona;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }


}
