/*Asi defino a una clase como abstracta*/
public abstract class Animal {
    private int edad;
    private char sexo;
    Raza raza;
    /*Si los atributos estan PRIVATE las clases hijas no van a poder acceder a ellos.*/
    /*PROTECTED se comporta como publico para aquellas clases que son hijas*/
    /*Si pongo protected tendria que validar para que no puedan poner -3*/
    /*Conviene dejar los atirbutos privados */
    
    public Animal(int edad, char sexo, Raza raza) {
        super();
        this.edad = edad;
        this.sexo = sexo;
        this.raza = raza;
    }

    /*Si tengo un metodo abstracto la clase tiene que ser abstracta si o si*/
    /*Esto obliga a las clases hijas a tener un metodo que se llame moverCola() */
    public abstract void moverCola();

    /*Con source tambien podemos generar los getters y setters*/
    protected int getEdad() {
        /*Los getters y setters quedan como PROTECTED*/
        return edad;
    }

    protected void setEdad(int edad) {
        this.edad = edad;
    }

    protected char getSexo() {
        return sexo;
    }

    protected void setSexo(char sexo) {
        this.sexo = sexo;
    }

    protected Raza getRaza() {
        return raza;
    }

    protected void setRaza(Raza raza) {
        this.raza = raza;
    }

    /*No me queda claro para que es el toString, creo que para que te muestre los atributos del objeto cuando printees en lugar de la direccion de memoria*/
    @Override
    public String toString() {
            return "[edad=" + edad + ", raza=" + raza + ", sexo=" + sexo + "]";
    }

    /*Un metodo abstracto es un metodo en el que ...... */
}
