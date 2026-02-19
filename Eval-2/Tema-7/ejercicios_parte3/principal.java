
import hospital.*;
import transporte_publico.*;

public class principal {
    public static void main(String[] args) {
        //E1
        ActoMedico[] actoMedico = new ActoMedico[10];
        Consulta consulta_1 = new Consulta(1, "Ekaitz", 15.34, "Otorrino");
        Consulta consulta_2 = new Consulta(2, "Mario", 27.52, "Oculista");
        Consulta consulta_3 = new Consulta(3, "Mario", 57.52, "Otorrinolaringologo");
        Analitica analitica_1 = new Analitica(1, "Ekaitz", 4.90, 3);
        Analitica analitica_2 = new Analitica(2, "Mario", 4.90, 5);
        Analitica analitica_3 = new Analitica(3, "Mario", 4.90, 1);
        Analitica analitica_4 = new Analitica(4, "Ekaitz", 4.90, 1);
        Cirugia cirugia_1 = new Cirugia(1, "Ekaitz", 104.90, 120);
        Cirugia cirugia_2 = new Cirugia(2, "Mario", 124.90, 65);
        Cirugia cirugia_3 = new Cirugia(3, "Ekaitz", 83.20, 75);
        actoMedico[0] = consulta_1;
        actoMedico[1] = consulta_2;
        actoMedico[2] = consulta_3;
        actoMedico[3] = analitica_1;
        actoMedico[4] = analitica_2;
        actoMedico[5] = analitica_3;
        actoMedico[6] = analitica_4;
        actoMedico[7] = cirugia_1;
        actoMedico[8] = cirugia_2;
        actoMedico[9] = cirugia_3;
        System.out.println("INFORMACIÓN DE LOS ACTOS MÉDICOS:");
        for (int i = 0; i <= actoMedico.length-1; i++) {
            System.out.println(actoMedico[i]);
        }
        System.out.println("ACTO MÉDICO MÁS CARO:");
        System.out.println(mas_caro(actoMedico));

        System.out.println("MEDIA DE PRECIO POR TIPO DE ACTO MÉDICO:");
        calcularMedia(actoMedico);
    }
    public static String imprimirFactura(ActoMedico actoMedico) {
        return actoMedico.toString();
    }
    public static ActoMedico mas_caro(ActoMedico[] actoMedico) {
        ActoMedico mas_caro = actoMedico[0];
        for (int i = 0; i <= actoMedico.length-1; i++) {
            if (actoMedico[i].calcularCoste() > mas_caro.calcularCoste()) {
                mas_caro = actoMedico[i];
            }
        }
        return mas_caro;
    }
    public static void calcularMedia(ActoMedico[] actoMedico) {
        double total_consulta = 0;
        int contador_consulta = 0;
        double total_analitica = 0;
        int contador_analitica = 0;
        double total_cirugia = 0;
        int contador_cirugia = 0;
        for (int i = 0; i <= actoMedico.length-1; i++) {
            if (actoMedico[i] instanceof Consulta) {
                total_consulta += actoMedico[i].calcularCoste();
                contador_consulta ++;
            }
            else if (actoMedico[i] instanceof Analitica) {
                total_analitica += actoMedico[i].calcularCoste();
                contador_analitica ++;
            }
            else {
                total_cirugia += actoMedico[i].calcularCoste();
                contador_cirugia ++;
            }
        }
        double media_consulta = (double)total_consulta / contador_consulta;
        double media_analitica = (double)total_analitica / contador_analitica;
        double media_cirugia = (double)total_cirugia / contador_cirugia;
        System.out.println("El coste medio de las consultas es: " + media_consulta + "$");
        System.out.println("El coste medio de las analiticas es: " + media_analitica + "$");
        System.out.println("El coste medio de las cirugias es: " + media_cirugia + "$");

        //E2
        TituloTransporte[] transportes = new TituloTransporte[15];
        BilleteSencillo billete_1 = new BilleteSencillo(1, 1.60, "Z1");
        BilleteSencillo billete_2 = new BilleteSencillo(2, 1.80, "Z2");
        BilleteSencillo billete_3 = new BilleteSencillo(3, 1.70, "Z3");
        TarjetaMonedero tarjeta_1 = new TarjetaMonedero(1, 2, "Z1", 20);
        TarjetaMonedero tarjeta_2 = new TarjetaMonedero(2, 2, "Z2", 0);
        TarjetaMonedero tarjeta_3 = new TarjetaMonedero(3, 2, "Z3", 10);
        AbonoMensual mensual_1 = new AbonoMensual(1, 20, "Z1", 2);
        AbonoMensual mensual_2 = new AbonoMensual(2, 20, "Z2", 4);
        transportes[0] = billete_1;
        transportes[1] = billete_2;
        transportes[2] = billete_3;
        transportes[3] = tarjeta_1;
        transportes[4] = tarjeta_2;
        //Comprobar que descuenta dinero del saldo
        transportes[5] = tarjeta_1;
        transportes[6] = mensual_1;
        transportes[7] = mensual_2;
        //Comprobar que la validación del billete funcione metiendo uno ya usado
        transportes[8] = billete_1;
        
        System.out.println("VALIDACIÓN DE VIAJES");
        int viajes_fallados = 0;
        for (int i = 0; i <= 8; i++) {
            if (transportes[i].validarViaje()) {
                System.out.println("Info del billete/tarjeta: ");
                System.out.println(transportes[i]);
            }
            else {
                viajes_fallados ++;
                System.out.println("Info del billete/tarjeta: ");
                System.out.println(transportes[i]);
            }
        }
        System.out.println("VIAJES FALLIDOS TOTALES: " + viajes_fallados);
        
        System.out.println("BUSCAR VIAJES");
        buscarViaje(5, transportes);
    }
    public static void buscarViaje(int numero_viaje, TituloTransporte[] transportes) {
        boolean encontrado = false;
        for (int i = 0; i <= 8; i++) {
            if (transportes[i].getNumero() == numero_viaje) {
                System.out.println("Billete/tarjeta encontrada: ");
                System.out.println(transportes[i]);
                encontrado = true;
            }
        }
        if (!encontrado) {
            System.out.println("No existe ningún billete/tarjeta con el número que buscas: ");
        }
    }
}
