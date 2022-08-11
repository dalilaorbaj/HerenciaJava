public class Perro extends Animal{
    private String nombre;

    /*Se puede generar el constructor automaticamente seleccionando toda la clase haciendo clic derecho, source y generate constructor*/
    public Perro(int edad, char sexo, Raza raza, String nombre) {
        /*Super tiene que ir primero siempre*/
        super(edad, sexo, raza);
        /*Puedo manejar atributos independientemente de la clase padre*/
        this.nombre = nombre;
        /*La palabra reservada super es para hacer referencia a la clase padre, en este caso Animal*/
    }

    public void moverCola(){
        System.out.printIn("Estoy contento");
    }
    
    /*clic derecho, source, create toString(), seleccionar todos los valores*/
    @Override
    public String toString() {
        return "Perro " + super.toString() + " nombre= "+ this.nombre;
    }
    
}