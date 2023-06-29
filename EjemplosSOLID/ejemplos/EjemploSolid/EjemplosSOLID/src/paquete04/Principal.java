/*
 * O — Open/closed principle (Principio abierto/cerrado)
 */
package paquete04;

import java.util.ArrayList;

/**
 *
 * @author reroes
 */
public class Principal {

    public static void main(String[] args) {
        TransporteBus bus = new TransporteBus();
        bus.establecerCooperativaBus("24 Mayo");

        TransporteTaxi taxi = new TransporteTaxi();
        taxi.establecerCooperativaTaxi("Yahuarcuna");

        TransporteTransvia transvia = new TransporteTransvia();
        transvia.establecerCooperativaTrasnvia("70 Julio");
        
        ArrayList<Transporte> lista = new ArrayList();
        lista.add(bus);
        lista.add(taxi);
        lista.add(transvia);

        for (Transporte t : lista) {
            t.establecerTarifa();
        }

        TiposTransporte tipos = new TiposTransporte();
        tipos.establecerTransportes(lista);
        tipos.establecerPromedioTarifas();

        System.out.printf("Promedio de Tarifas: %.2f\n",
                tipos.obtenerPromedioTarifas());

    }
}
