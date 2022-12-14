package POO_PRACTICA_ENCAPSULACION;

public class Main {
    public static void main(String[] args) {
        Persona persona = new Persona();

        persona.setEdad(18);

        System.out.println(persona.getEdad());

        persona.setNombre("Rodrigo");
        System.out.println(persona.getNombre());
        persona.setTelefono(943687498);
        System.out.println(persona.getTelefono());
    }


}

class Persona {
    private int edad;

    private String nombre;

    private int telefono;

    public void setEdad(int edad){
        this.edad = edad;


    }
    public int getEdad(){
        return this.edad;

    }

    public void setNombre(String nombre){

        this.nombre = nombre;
    }

    public String getNombre(){
        return this.nombre = nombre;

    }
    public void setTelefono(int telefono){

        this.telefono = telefono;

    }

    public int getTelefono(){
        return this.telefono = telefono;
    }
}
