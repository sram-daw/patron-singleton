public class Main {
    public static void main(String[] args) {
        // Creamos un objeto
        Singleton instanciaUnica = Singleton.getInstance();
        // especificamos los atributos
        instanciaUnica.setNombre("Singleton");
        instanciaUnica.setEdad(30);
        //Comprobamos los atributos del objeto con un sout
        System.out.println(instanciaUnica.toString());

        //Creamos otro objeto Singleton. Como ya hay uno instanciado, el método getInstance nos devolverá el que ya existe.
        Singleton otraInstancia= Singleton.getInstance();
        // podemos cambiar la edad
        otraInstancia.setEdad(25);
        //Comprobamos que el objeto es el mismo y que hemos modificado la edad.
        System.out.println(otraInstancia.toString());

    }
}