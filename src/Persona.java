public class Persona {
    String nombre;
    String apellido;

    void mostrarPersona(){
        System.out.println("nombre = " + nombre);
        System.out.println("apellido = " + apellido);
    }

    public static void main(String[] args) {
        System.out.println("***Creacion de Clase y objetos Personas***");
        Persona objeto1 = new Persona();
        objeto1.nombre = "Octavio";
        objeto1.apellido = "Caballero";
        objeto1.mostrarPersona();
        //Segundo objeto
        System.out.println();
        Persona objeto2 = new Persona();
        objeto2.nombre = "Andres";
        objeto2.apellido = "Ortega";
        objeto2.mostrarPersona();

    }
}
