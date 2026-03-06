import biblioteca.*;
import centro_educativo.*;
import reproductor_musica.SmartPhone;
import smartphone.*;
import videoclub.*;

public class principal {
    public static void main(String[] args) {
        //E1
        Alumno pepe = new Alumno("22766404S", "Pepe", "Iglesias", "Rondón");
        Alumno maria = new Alumno("22765408N", "Maria", "Fedez", "Merino");
        Alumno luis = new Alumno("22766404S", "Luis", "Hustle", "Hard");
        ExamenesEscritos pepe_escrito = new ExamenesEscritos("20-04-2025", 75, 7);
        ExamenesOrales pepe_oral = new ExamenesOrales("20-04-2025","Notable");
        pepe.addExamen(pepe_oral);
        pepe.addExamen(pepe_escrito);

        
        ExamenesEscritos maria_escrito = new ExamenesEscritos("20-04-2025", 89, 7);
        ExamenesEscritos maria_escrito_2 = new ExamenesEscritos("20-04-2025", 50, 6);
        ExamenesOrales maria_oral = new ExamenesOrales("20-04-2025","Bien");
        maria.addExamen(maria_escrito);
        maria.addExamen(maria_escrito_2);
        maria.addExamen(maria_oral);

        ExamenesEscritos luis_escrito = new ExamenesEscritos("20-04-2025", 91, 7);
        ExamenesOrales luis_oral = new ExamenesOrales("20-04-2025","Bien");
        ExamenesOrales luis_oral_2 = new ExamenesOrales("20-04-2025","Insuficiente");
        luis.addExamen(luis_escrito);
        luis.addExamen(luis_oral);
        luis.addExamen(luis_oral_2);

        Alumno[] alumnos = {pepe, maria, luis};
        int cant_alumnos_aprobados = cantAprobados(alumnos);
        System.out.println("CANTIDAD DE ALUMNOS APROBADOS: " + cant_alumnos_aprobados );
        //E2
        
        System.out.println("");
        Publicacion[] publicaciones = new Publicacion[4];
        Libro la_odisea = new Libro(1, -700, "La odisea");
        Libro El_arte_de_la_guerra = new Libro(2, -200, "El arte de la guerra");
        Revista hypebeast = new Revista(3, 2015, "Hypebeast", 26);
        Revista panenka = new Revista(4, 2012, "Panenka", 22);
        la_odisea.prestar();
        publicaciones[0] = la_odisea;
        publicaciones[1] = El_arte_de_la_guerra;
        publicaciones[2] = hypebeast;
        publicaciones[3] = panenka;

        System.out.println("MOSTRAR INFO DE LAS PUBLICACIONES:");
        for (int i = 0; i <= publicaciones.length-1; i++) {
            System.out.println(publicaciones[i].toString());
        }
        System.out.println("CANTIDAD DE PUBLICACIONES PRESTADAS: " + cuentaPrestados(publicaciones));
        System.out.println("CANTIDAD DE PUBLICACIONES ANTERIORES A 1990: " + publicacionesAnterioesA(publicaciones, 1990));

        //E3
        System.out.println("");
        System.out.println("EJERCICIO 3");
        Smartphone mi_movil = new Smartphone();
        System.out.println("PASAR A LA SIGUIENTE CANCIÓN: ");
        mi_movil.siguiente();

        //E4
        System.out.println("");
        System.out.println("EJERCICIO 4");
        SmartPhone mi_movil_2 = new SmartPhone();
        mi_movil_2.iniciar();
        mi_movil_2.detener();
        mi_movil_2.pausar();
        mi_movil_2.siguiente();

        //E5
        System.out.println("");
        System.out.println("EJERCICIO 5");
        mi_movil.obtenerCoordenadas();
        mi_movil.iniciarRadio();
        mi_movil.detenerRadio();

        //E6
        System.out.println("");
        Serie[] series = new Serie[5];
        Videojuego[] videojuegos = new Videojuego[5];

        Serie got = new Serie("Game Of Thrones", "David Benioff");
        Serie succession = new Serie();
        Serie allAmerican = new Serie("All American", "Deportes y Drama", "April Blair", 7);
        Serie breakingBad = new Serie("Breaking Bad", "Drama, Crimen", "April Blair", 7);
        Serie suits = new Serie("Suits", "Drama, Abogacía", "Aaron Kors", 9);

        Videojuego tlou = new Videojuego("The Last Of US", 50);
        Videojuego persona = new Videojuego();
        Videojuego gow = new Videojuego("God Of War", "Ciancia Ficción, Mitologia", "Sony", 47);
        Videojuego fifa = new Videojuego("Fifa", "Deportes, Simulador deportivo", "EA", 0);
        Videojuego madden = new Videojuego("Madden", "Deportes, Simulador deportivo", "EA", 900);
        
        succession.prestar();
        suits.prestar();
        persona.prestar();
        madden.prestar();

        series[0] = got;
        series[1] = succession;
        series[2] = allAmerican;
        series[3] = breakingBad;
        series[4] = suits;

        videojuegos[0] = tlou;
        videojuegos[1] = gow;
        videojuegos[2] = persona;
        videojuegos[3] = fifa;
        videojuegos[4] = madden;


        System.out.println("JUEGOS Y SERIES PRESTADAS: " + contarPrestados(series, videojuegos));
        System.out.println("LA SERIES MÁS LARGA ES: " + serieMasLarga(series));
        System.out.println("EL VIDEOJUEGO MÁS LARGO ES: " + videojuegoMasLargo(videojuegos));


    }
    public static Serie serieMasLarga(Serie[] series) {
        Serie mas_larga = series[0];
        for (int i = 0; i < series.length -1; i++) {
            if(series[i + 1].compareTo(series[i])) {
                mas_larga = series[i + 1];
            }
        }
        return mas_larga;
    }
    public static Videojuego videojuegoMasLargo(Videojuego[] videojuegos) {
        Videojuego mas_largo = videojuegos[0];
        for (int i = 0; i < videojuegos.length -1; i++) {
            if(videojuegos[i + 1].compareTo(videojuegos[i])) {
                mas_largo = videojuegos[i + 1];
            }
        }
        return mas_largo;
    }
    public static int contarPrestados(Serie[] series, Videojuego[] videojuegos) {
        int prestados = 0;
        for (int i = 0; i < series.length; i++) {
            if(series[i].isPrestado()) {
                prestados ++;
                series[i].devolver();
            }
        }
        for (int i = 0; i < videojuegos.length; i++) {
            if(videojuegos[i].isPrestado()) {
                prestados ++;
                videojuegos[i].devolver();
            }
        }
        return prestados;
    }
    public static int cuentaPrestados(Object[] publicaciones) {
        int cant_prestados = 0;
        for (int i = 0; i <= publicaciones.length-1; i++) {
            if(publicaciones[i] instanceof Libro) {
                Libro libro = (Libro) publicaciones[i];
                if(libro.prestado()) {
                    cant_prestados ++;
                }
            }
            else if(publicaciones[i] instanceof Revista) {
                Revista revista = (Revista) publicaciones[i];
                if(revista.prestado()) {
                    cant_prestados ++;
                }
            }
        }
        return cant_prestados;
    }

    public static int publicacionesAnterioesA(Publicacion[] publicaciones, int anio) {
        int libros_publicados_antes_de_fecha = 0;
        for (int i = 0; i <= publicaciones.length-1; i++) {
            if (publicaciones[i].getAnio() < anio) {
                libros_publicados_antes_de_fecha ++;
            }
        }
        return libros_publicados_antes_de_fecha;
    }
    public static int cantAprobados(Alumno[] alumnos) {
        int cant_aprobados = 0;
        for (int i = 0; i <= alumnos.length -1; i++) {
            boolean aprobado = true;
            for (int j = 0; j < alumnos[i].getCantExamenes(); j++) {
                if (!alumnos[i].getExamenes()[j].aprobado()) {
                    aprobado = false;
                }
            }
            if(aprobado) {
                cant_aprobados ++;
            }
        }
        return cant_aprobados;
    }
}
