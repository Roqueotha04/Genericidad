import ejercicio1.ListaGenerica;
import ejercicio2.Intercambiable;
import ejercicio3.*;
import ejercicio5.*;
import ejercicio7.Par;
import ejercicio8y9.*;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        char c='s';
        Scanner teclado= new Scanner(System.in);
        int opcion=0;
        do{
            System.out.println("Que ejercicio desea ver?");
            opcion=teclado.nextInt();
            switch (opcion){
                case 1:
                    ejercicio1();
                    break;
                case 2:
                    ejercicio2();
                    break;
                case 3:
                    ejercicio3();
                    break;
                case 4:
                    LinkedList<Integer>listaNueva= new LinkedList<>();
                    listaNueva.add(5);
                    listaNueva.add(2);
                    listaNueva.add(3);
                    listaNueva.add(1);

                    LinkedList<ClaseSinComparable>listaNueva2= new LinkedList<>();
                    listaNueva2.add(new ClaseSinComparable(4));
                    listaNueva2.add(new ClaseSinComparable(3));
                    listaNueva2.add(new ClaseSinComparable(2));
                    listaNueva2.add(new ClaseSinComparable(1));

                    ejercicio4(listaNueva);
                    //ejercicio4(listaNueva2); Si se descomenta esta línea se puede ver que no se permite implementar clase que no usen comparable en el metodo
                    break;
                case 5:
                    ejercicio5();
                    break;
                case 6:
                    ///metodo estatico generico en el main
                    ejercicio6();
                    break;
                case 7:
                    ejercicio7();
                    break;
                case 8:
                    ///en genericos esto limita el paso de datos por parametro, no se puede enviar una lista de
                    ///tipo ClaseRandomNieto, pero pueden llegar datos de ese tipo si la lista que se recibe es de un tipo de
                    ///dato padre del mismo.
                    LinkedList<ClaseRandom> lista=new LinkedList<>();
                    lista.add(new ClaseRandomHijo(2,"hola",5));
                    lista.add(new ClaseRandom(2,"hola"));
                    lista.add(new ClaseRandomHijo(2,"hola",2));
                    imprimirElementos(lista);
                    break;
                case 9:
                    ejercicio9();
                    break;
                case 10:
                    ejercicio10(5,"UTN");
                    break;
            }
            System.out.println("Desea ver otro ejercicio?");
            c=teclado.next().charAt(0);

        }while(c=='s');
    }
    public static void ejercicio1 (){
        ListaGenerica<Integer> lista=new ListaGenerica<>();
        lista.agregarElemento(5);
        lista.agregarElemento(8);
        lista.agregarElemento(99);

        lista.mostrarListaGenerica();
        lista.obtenerElementoEnPos(2);
    }
    public static void ejercicio2 (){
        Intercambiable<String> intercambiable=new Intercambiable<>("juansito","123");
        intercambiable.mostrar();
        intercambiable.intercambiarValores();
        intercambiable.mostrar();
    }
    public static void ejercicio3(){
        PilaGenerica<Integer> pila=new PilaGenerica<>();
        pila.cargarElementosPila(5);
        pila.cargarElementosPila(3);
        pila.cargarElementosPila(9);
        pila.mostrarPila();
        ///pila.cargarElementosPila(10.5f); casos como este no se permiten por el tipo de dato elegido en linea 57
    }
    public static <T extends  Comparable>void ejercicio4(LinkedList<T>lista){
        for (T elemento:lista){
            System.out.println(elemento);
        }
    }
    public static void ejercicio5(){
        ClasePadreGenerica<Integer> padre = new ClasePadreGenerica<>(5);
        ClaseHijoGenerica<ClasePadreGenerica<Integer>> hijo = new ClaseHijoGenerica<>(padre);
        ///En el primer caso data es la clase padre en si, la direccion de memoria, vuelvo a llamara getData y accedo al dato que posee.
        System.out.println(hijo.getData().getData());
    }
    public static void ejercicio6(){
        int numero=5;
        String palabra="hola";

        System.out.println("resultado de comparar " +numero +" "+ palabra +": " +comparar(numero,palabra));
    }
    public static void ejercicio7(){
        Par<Integer, String> par=new Par<>(2,"Hola");
        par.mostrarElementos();
    }
    public static<T> void imprimirElementos(LinkedList<? super ClaseRandomHijo>lista){
        Iterator<?> iterador = lista.iterator();
        while (iterador.hasNext()) {
            System.out.println(iterador.next().toString());
        }
    }
    public static <T>boolean comparar (T elemento1, T elemento2){
        return elemento1.equals(elemento2);
    }
    public static void ejercicio9 (){
        Contenedor<ClaseRandomHijo>contenedor=new Contenedor<>();
        contenedor.agregarElemento(new ClaseRandomHijo(1,"hola",2));
        contenedor.agregarElemento(new ClaseRandomNieto(2,"hola",2));
        contenedor.agregarElemento(new ClaseRandomHijo(3,"hola",2));
        contenedor.mostrar();
    }
    public static<T,U> void ejercicio10(T elemento1, U elemento2){
        String cadena= "Elemento1 " + elemento1 + " Elemento 2: " + elemento2;
        System.out.println(cadena);
    }

}