public class Test{
    public static void main (String[] args){
        /*En el parametro le paso un vector de argumentos que se usa al ejecutar el programa*/
        Perro p = new Perro(3, 'M', Raza.BULLDOG, "pichichus");
        Gato g = new Gato(3,'F' ,Raza.PERSA);
        /*Se puede crear objetos de la clase animal pero no tiene mucho sentido. Podria poner el constructor de la clase Animal como rpotected para que no se pueda instanciar un Animal, pero se podria instanciar en las clases hijas y no esta bueno que puedan. Por eso hacemos que la clase sea abstracta, de modo que no se pueda instanciar*/
        /*Como la clase Animal es abstracta no me va a dejar instanciarla*/
        //Animal a = new Animal(5, 'F', Raza.SIAMES);

        /*Desde test puedo cambiar el valor de un objeto de tipo Perro o Gato*/
        p.setSexo('F');

        /*Esto muestra la direccion de memoria del objeto*/
        System.out.printIn(p);
        System.out.printIn(g);

        /*Asi llamaria a las funciones de las clases hijas*/
        p.moverCola();
        g.moverCola();

        /*Me deja hacer esto porque perro es un animal*/
        Animal a = new Gato(2, 'F', Raza.BOXER);

    }
}