/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paquete02;

import java.util.ArrayList;

public class Principal {

    public static void main(String[] args) {

        ArrayList<Persona> lista = new ArrayList();

        Ciudad c1 = new Ciudad("Quito");
        Ciudad c2 = new Ciudad("Loja");

        Persona p1 = new Persona("Alex R", 18, c1);
        Persona p2 = new Persona("Carlos Mejia", 19, c2);

        lista.add(p1);
        lista.add(p2);

        OperacionesEstudiantes op1 = new OperacionesEstudiantes();

        op1.establecerEstudiante(lista);
        op1.establecerPromedioEdades();
        op1.establecerEdadMinima();
        op1.establecerEdadMaxima();
        op1.establecerListaCiudadesEstudiantes();
        System.out.printf("El promedio de edades es: %.2f\n",
                op1.obtenerPromedioEdades());
        System.out.printf("La edad minima es: %d\n",
                op1.obtenerEdadMinima());
        System.out.printf("La edad maxima es: %d\n",
                op1.obtenerEdadMaxima());
        System.out.printf("\nLa lista de ciudades es:\n%s\n",
                op1.obtenerListaCiudadesEstudiantes());

    }
}
