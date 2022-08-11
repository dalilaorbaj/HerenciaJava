public class Gato extends Animal{
    /*Aca le extiendo la clase Animal, aplicando el concepto de herencia*/


    /*Se puede generar el constructor automaticamente seleccionando toda la clase haciendo clic derecho, source y generate constructor*/
    public Gato(int edad, char sexo, Raza raza) {
        super(edad, sexo, raza);
        /*La palabra reservada super es para hacer referencia a la clase padre, en este caso Animal*/
    }

    public void moverCola(){

    }

    /*clic derecho, source, create toString(), seleccionar todos los valores*/
    @Override
    public String toString() {
        return "Perro "+ super.toString();
    }
}