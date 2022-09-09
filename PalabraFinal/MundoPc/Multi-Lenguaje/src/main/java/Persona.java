
public class Persona {

    private String nombre;
    private String Sexo;
    private int edad;
    private float estatura;
    private String correoElectronico;
    
    public Persona() {
    }

    public Persona(String nombre, String Sexo, int edad, float estatura, String correoElectronico) {
        this.nombre = nombre;
        this.Sexo = Sexo;
        this.edad = edad;
        this.estatura = estatura;
        this.correoElectronico = correoElectronico;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getSexo() {
        return Sexo;
    }

    public void setSexo(String Sexo) {
        this.Sexo = Sexo;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public float getEstatura() {
        return estatura;
    }

    public void setEstatura(float estatura) {
        this.estatura = estatura;
    }

    public String getCorreoElectronico() {
        return correoElectronico;
    }

    public void setCorreoElectronico(String correoElectronico) {
        this.correoElectronico = correoElectronico;
    }

    @Override
    public String toString() {
        return "Persona{" + "nombre=" + nombre + ", Sexo=" + Sexo + ", edad=" + edad + ", estatura=" + estatura + ", correoElectronico=" + correoElectronico + '}';
    }
    
}
