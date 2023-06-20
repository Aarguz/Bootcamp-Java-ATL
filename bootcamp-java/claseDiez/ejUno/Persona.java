package claseDiez.ejUno;

public class Persona {
    String id;
    String nombre;
    int edad;
    String fechaNacimiento;
    String dni;

    public Persona(String id, String nombre, int edad, String fechaNacimiento, String dni) {
        this.id = id;
        this.nombre = nombre;
        this.edad = edad;
        this.fechaNacimiento = fechaNacimiento;
        this.dni = dni;
    }
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
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

    public String getFechaNacimiento() {
        return fechaNacimiento;
    }

    public void setFechaNacimiento(String fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public void mostrar() {
        System.out.println("ID: " + getId());
        System.out.println("Nombre: " + getNombre());
        System.out.println("Edad: " + getEdad());
        System.out.println("Fecha de nacimiento: " + getFechaNacimiento());
        System.out.println("DNI: " + getDni());
    }

    public boolean esMayorDeEdad() {
        boolean esMayor = false;

        if (getEdad() >= 18) {
            esMayor = true;
        }
        return esMayor;
    }
}
