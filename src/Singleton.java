public class Singleton {

    private String nombre;
    private int edad;

    //Atributo necesario para que el método getInstance compruebe si existe la instancia única del objeto.
    private static Singleton instance = null;


    /**
     * Si el objeto no existe, lo instancia.
     * *
     * @return la instancia única del objeto. Si no existe la crea primero.
     */
    public static Singleton getInstance() {
        if (instance == null) {
            instance = new Singleton();
        }
        return instance;
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
}
