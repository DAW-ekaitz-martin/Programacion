
import hospital.*;
import transporte_publico.*;
import mini_simulador.*;
import fabrica.*;

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

        //E3
        Personaje[] personajes = new Personaje[6];
        Guerrero g_1 = new Guerrero("Obelix", 200, 50, 50);
        Guerrero g_2 = new Guerrero("Maximo Decimo", 250, 90, 40);
        Mago m_1 = new Mago("Rey Hielo", 100, 50, 100);
        Mago m_2 = new Mago("Mago Eléctrico", 100, 50, 100);
        Arquero a_1 = new Arquero("Legolas", 150, 75);
        Arquero a_2 = new Arquero("Salogel", 150, 75);
        personajes[0] = g_1;
        personajes[1] = g_2;
        personajes[2] = m_1;
        personajes[3] = m_2;
        personajes[4] = a_1;
        personajes[5] = a_2;
        for (int i = 0; i <= personajes.length-2; i ++) {
            if (personajes[i].estaVivo()) {
                //Calculo el daño que el personaje de la posición en la que me encuentro le va a causar al que está en la siguiente posición.
                int danio_a_causar = personajes[i].calcularDanio();
                //Le causo el daño previamente calculado al siguiente del array.
                personajes[i+1].recibirDanio(danio_a_causar);
            }
        }
        //Ahora el personaje que se encuentre en la última posición le debe de causar el daño al que está en la primera posición del array.
        if (personajes[personajes.length-1].estaVivo()) {
            int danio =  personajes[personajes.length-1].calcularDanio();
            personajes[0].recibirDanio(danio);
        }
        System.out.println("ESTADO DE LOS PERSONAJES DESPUÉS DEL ATAQUE");
        for (int i = 0; i <= personajes.length-1; i++) {
            System.out.println(personajes[i].toString());
        }
        System.out.println("PERSONAJES QUE SIGUEN VIVOS");
        for (int i = 0; i <= personajes.length-1; i++) {
            if (personajes[i].estaVivo())
                System.out.println(personajes[i].toString());
        }

        //E4
        Sensor[] sensores = new Sensor[9];
        double[] lectura_st_1 = {1.3,57.8,24.8,42.9,98.1,2.3,5.4};
        double[] lectura_st_2 = {1.3,57.8,24.8,2.9,8.1,2.3,5.4};
        double[] lectura_st_3 = {1.3,57.8,24.8,2.9,8.1,2.3,5.4};

        double[] lectura_sp_1 = {6.3,52.8,24.8,8.9,8.1,8.3,5.4};
        double[] lectura_sp_2 = {1.3,57.8,24.8,2.9,8.1,2.3,5.4};
        double[] lectura_sp_3 = {1.3,57.8,24.8,2.9,8.1,2.3,5.4};

        double[] lectura_sh_1 = {1.3,57.8,47.8,2.9,8.1,2.3,5.4};
        double[] lectura_sh_2 = {1.3,57.8,24.8,2.9,8.1,2.3,5.4};
        double[] lectura_sh_3 = {1.3,57.8,24.8,2.9,8.1,2.3,5.4};

        SensorTemperatura st_1 = new SensorTemperatura(1, "Z1", lectura_st_1, "Temperatura");
        SensorTemperatura st_2 = new SensorTemperatura(2, "Z2", lectura_st_2, "Temperatura");
        SensorTemperatura st_3 = new SensorTemperatura(3, "Z3", lectura_st_3, "Temperatura");
        SensorPresion sp_1 = new SensorPresion(4, "Z1", lectura_sp_1, "Presión");
        SensorPresion sp_2 = new SensorPresion(5, "Z2", lectura_sp_2, "Presión");
        SensorPresion sp_3 = new SensorPresion(6, "Z3", lectura_sp_3, "Presión");
        SensorHumo sh_1 = new SensorHumo(7, "Z1", lectura_sh_1, "Humo");
        SensorHumo sh_2 = new SensorHumo(8, "Z2", lectura_sh_2, "Humo");
        SensorHumo sh_3 = new SensorHumo(9, "Z3", lectura_sh_3, "Humo");
        sensores[0] = st_1;
        sensores[1] = st_2;
        sensores[2] = st_3;
        sensores[3] = sp_1;
        sensores[4] = sp_2;
        sensores[5] = sp_3;
        sensores[6] = sh_1;
        sensores[7] = sh_2;
        sensores[8] = sh_3;
        System.out.println("INFORMACIÓN SOBRE LOS SENSORES: ");
        for (int i = 0; i<= sensores.length-1; i++) {
            System.out.println(sensores[i].toString());
        }
        System.out.println("NUMERO DE SENSORES EN PELIGRO: " + contadorDePeligro(sensores));
        System.out.println("BUSCAR SENSOR POR ID");
        buscarId(sensores, 3);
        buscarId(sensores, -1);
        
    }
    public static void buscarId (Sensor[] sensores, int id_a_buscar) {
        boolean encontrado = false;
        for (int i = 0; i<= sensores.length-1; i++) {
            if(sensores[i].getId() == id_a_buscar) {
                System.out.println(sensores[i].toString());
                encontrado = true;
            }
        }
        if(!encontrado) {
            System.out.println("No se ha encontrado ningún sensor con id " + id_a_buscar);
        }
    }

    public static int contadorDePeligro(Sensor[] sensores) {
        int cont = 0;
        for (int i = 0; i<= sensores.length-1; i++) {
            if(sensores[i].obtenerAlarma().equals("PELIGRO")) {
                cont ++;
            }
        }
        return cont;
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
