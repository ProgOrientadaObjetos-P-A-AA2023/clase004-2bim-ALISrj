/*
S — Single responsibility principle 
    Principio de responsabilidad única
 */
package paquete02;

import java.util.ArrayList;

/**
 *
 * @author reroes
 */
public class OperacionesEstudiantes {

    private ArrayList<Persona> estudiantes;
    private double promedioEdades;
    private int edadminima;
    private int edadmaxima;
    private String listaCiudadesEstudiantes;

    public void establecerEstudiante(ArrayList<Persona> lista) {
        estudiantes = lista;
    }

    public ArrayList<Persona> obtenerEstudiante() {
        return estudiantes;
    }

    public void establecerPromedioEdades() {
        double suma = 0;
        for (Persona e : obtenerEstudiante()) {
            suma = suma + e.obtenerEdad();
        }
        promedioEdades = suma / obtenerEstudiante().size();
    }

    public double obtenerPromedioEdades() {
        return promedioEdades;
    }

    public void establecerEdadMinima() {

        int minimo = estudiantes.get(0).obtenerEdad();

        for (Persona e : estudiantes) {
            if (e.obtenerEdad() < minimo) {
                minimo = e.obtenerEdad();
            }
        }

        edadminima = minimo;
    }

    public int obtenerEdadMinima() {
        return edadminima;
    }

    public void establecerEdadMaxima() {
        int maximo = estudiantes.get(0).obtenerEdad();

        for (Persona e : estudiantes) {
            if (e.obtenerEdad() > maximo) {
                maximo = e.obtenerEdad();
            }
        }

        edadmaxima = maximo;
    }

    public int obtenerEdadMaxima() {
        return edadmaxima;
    }
    
    public void establecerListaCiudadesEstudiantes() {
        String mensaje = "";
        for (Persona e : estudiantes) {
            mensaje = String.format("%s%s\n",
                    mensaje,e.obtenerCiudad().obtenerNombreCiudad());
        }
        listaCiudadesEstudiantes = mensaje;
    }

    public String obtenerListaCiudadesEstudiantes() {
        return listaCiudadesEstudiantes;
    }

}
