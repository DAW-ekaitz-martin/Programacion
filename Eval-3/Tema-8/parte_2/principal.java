import almacen.*;
import hospital.*;
import instituto.*;

import java.util.Arrays;
import museo.*;
import plataforma.*;
import tienda.*;
import zoo.*;
import gym.*;
import parking.*;
public class principal {
    public static void main(String[] args) {
        //E1
        Object[] almacen = new Object[5];
        Movil movil = new Movil("Xiaomi", 5);
        Planta planta = new Planta("Carnivora", 3, 2);
        Libro libro = new Libro("El libro troll", "ElRubiusOMG");
        Yogurt yogurt = new Yogurt("Danone", 5, 1);
        Yogurt yogurt_2 = new Yogurt("Puleva", 5, 7);

        almacen[0] = movil;
        almacen[1] = planta;
        almacen[2] = libro;
        almacen[3] = yogurt;
        almacen[4] = yogurt_2;


        System.out.println("CANTIDAD DE PRODUCTOS PERECEDEROS URGENTES: ");
        Object[] perecederosUrgentes = buscarUrgentes(almacen);
        for (int i = 0; i <= almacen.length-1; i++) {
            if(perecederosUrgentes[i] != null) {
                System.out.println(perecederosUrgentes[i]);
            }
        }

        System.out.println("CANTIDAD DE PRODUCTOS QUE REQUIEREN EMBALAJE ESPECIAL: " + contarConEmbalaje(almacen));

        System.out.println("ARRAY DE OBJETOS PERECEDEROS ORDENADOS POR CADUCIDAD:");
        ordenarPerecederos(almacen);

        //E2

        Paciente[] pacientes = new Paciente[9];
        Paciente p_1 = new Paciente("Ekaitz", 1, 22, 25, 3);
        Paciente p_2 = new Paciente("Carlos", 2, 19, 43, 1);
        Paciente p_3 = new Paciente("Mateo", 3, 25, 31, 4);
        Paciente p_4 = new Paciente("Gaizka", 4, 29, 2, 5);
        Paciente p_5 = new Paciente("Brandon", 5, 21, 5, 1);
        Paciente p_6 = new Paciente("Walid", 6, 28, 93, 3);
        Paciente p_7 = new Paciente("Hao", 7, 27, 47, 2);
        Paciente p_8 = new Paciente("Julieta", 8, 24, 21, 2);
        Paciente p_9 = new Paciente("Miracle", 9, 19, 37, 1);

        pacientes[0] = p_7;
        pacientes[1] = p_9;
        pacientes[2] = p_3;
        pacientes[3] = p_4;
        pacientes[4] = p_6;
        pacientes[5] = p_5;
        pacientes[6] = p_1;
        pacientes[7] = p_8;
        pacientes[8] = p_2;

        System.out.println("PACIENTES SIN ORDENAR: ");
        printPacientes(pacientes);
        System.out.println("PACIENTES ORDENADOS POR TRIAJE: ");
        ordenarPorTriaje(pacientes.clone());
        System.out.println("PACIENTES ORDENADOS POR TIEMPO DE ESPERA: ");
        ordenarPorEspera(pacientes.clone());
        System.out.println("PACIENTES ORDENADOS POR EDAD: ");
        ordenarPorEdad(pacientes.clone());
        System.out.println("BUSCAR PACIENTE POR ID: ");
        System.out.println(buscarPorId(pacientes, 1));
        System.out.println("BUSCAR PACIENTE POR ID DE MANERA BINARIA: ");
        System.out.println(busquedaBinariaPorId(pacientes,8));

        //E3
        Exhibible[] sala = new Exhibible[15];
        Escultura e1 = new Escultura("David", "Migel Angel", 1504, 85, 90);
        Escultura e2 = new Escultura("Carlos", "Migel Angel", 1504, 23, 32);
        Escultura e3 = new Escultura("Nacho", "Migel Angel", 1504, 88, 25);
        Escultura e4 = new Escultura("Marcos", "Migel Angel", 1504, 75, 70);
        Escultura e5 = new Escultura("Marcos", "Migel Angel", 1904, 75, 70);
        Pintura monalisa = new Pintura("Mona lisa", "Da Vinci", 1506, 45, 80);
        Pintura gernika = new Pintura("Gernika", "Picasso", 1506, 15, 60);
        Pintura monalisa2 = new Pintura("Mona lisa2", "Da Vinci", 1506, 45, 80);
        Pintura gernika2 = new Pintura("Gernika", "Picasso", 1506, 45, 80);
        Pintura gernika3 = new Pintura("Gernika", "Picasso", 1506, 50, 87);
        Fotografia f1 = new Fotografia("Foto 1", "Yo", 2026, 0);
        Fotografia f2 = new Fotografia("Foto 2", "Yo", 2025, 34);
        Fotografia f3 = new Fotografia("Foto 3", "Yo", 2024, 87);
        Fotografia f4 = new Fotografia("Foto 4", "Yo", 2023, 99);
        Fotografia f5 = new Fotografia("Foto 5", "Yo", 2022, 23);
        sala[0] = e1;
        sala[1] = e2;
        sala[2] = e3;
        sala[3] = e4;
        sala[4] = e5;
        sala[5] = monalisa;
        sala[6] = gernika;
        sala[7] = monalisa2;
        sala[8] = gernika2;
        sala[9] = gernika3;
        sala[10] = f1;
        sala[11] = f2;
        sala[12] = f3;
        sala[13] = f4;
        sala[14] = f5;

        System.out.println("IMPRIMIR CARTELAS: ");
        imprimirCartelas(sala);
        System.out.println("ORDENAR POR ATRACTIVO: ");
        ordenarPorAtractivo(sala);

        //E4
        CursoOnline curso0 = new CursoOnline("Python for Beginers", "Ekaitz Martin", 25, 349.35);
        CursoOnline curso1 = new CursoOnline("Java de Cero a Experto", "Alejandro Taboada", 40, 199.99);
        CursoOnline curso2 = new CursoOnline("Master en React", "Fernando Herrera", 35, 150.00);
        CursoOnline curso3 = new CursoOnline("Data Science con R", "Marina Juárez", 50, 450.50);
        CursoOnline curso4 = new CursoOnline("Diseño UX/UI", "Sofía Pérez", 20, 120.25);
        CursoOnline curso5 = new CursoOnline("Ciberseguridad Pro", "Erik Storm", 60, 599.90);
        CursoOnline curso6 = new CursoOnline("Marketing Digital 360", "Laura Ortiz", 15, 89.99);
        CursoOnline curso7 = new CursoOnline("Desarrollo iOS Swift", "Brais Moure", 45, 299.00);
        CursoOnline curso8 = new CursoOnline("Machine Learning", "Andrew Ng", 100, 0.00);
        CursoOnline curso9 = new CursoOnline("SQL Avanzado", "Carlos Slim", 12, 75.60);
        TallerPresencial taller1 = new TallerPresencial("Hackaton Grupal", "Matías Cespedes", 4, 1000);
        TallerPresencial taller2 = new TallerPresencial("Introducción a la Carpintería", "Luis García", 8, 150);
        TallerPresencial taller3 = new TallerPresencial("Cocina Vegana", "Marta Chef", 3, 85);
        TallerPresencial taller4 = new TallerPresencial("Escritura Creativa", "Jorge Volpi", 12, 200);
        TallerPresencial taller5 = new TallerPresencial("Yoga y Mindfulness", "Elena Medita", 2, 50);
        TallerPresencial taller6 = new TallerPresencial("Fotografía Nocturna", "Iker Morán", 5, 120);
        TallerPresencial taller7 = new TallerPresencial("Robótica para Niños", "Tecno Kids", 10, 300);
        TallerPresencial taller8 = new TallerPresencial("Pintura al Óleo", "Antonio López", 20, 500);
        TallerPresencial taller9 = new TallerPresencial("Primeros Auxilios", "Cruz Roja", 6, 20);
        TallerPresencial taller10 = new TallerPresencial("Reparación de PCs", "Taller Central", 15, 400);
        MasterClass masterclass1 = new MasterClass("Cómo convertir más ventas", "Daniel Dalen", 2, 3000);
        MasterClass masterclass2 = new MasterClass("Liderazgo Disruptivo", "Simon Sinek", 3, 5000);
        MasterClass masterclass3 = new MasterClass("Storytelling para Marcas", "Seth Godin", 2, 4500);
        MasterClass masterclass4 = new MasterClass("Inversión en Real Estate", "Robert Kiyosaki", 5, 10000);
        MasterClass masterclass5 = new MasterClass("Biohacking y Salud", "Tim Ferriss", 4, 3500);
        Ofertable[] catalogo = {curso0,curso1,curso2,curso3,curso4,curso5,curso6,curso7,curso8,curso9,
            taller1,taller2,taller3,taller4,taller5,taller6,taller7,taller8, taller9, taller10, masterclass1, masterclass2,masterclass3,masterclass4,masterclass5
        };
        System.out.println("BUSCAR PROFESOR:");
        System.out.println(buscarPorProfesor(catalogo, "Tim Ferriss"));
        System.out.println("CATÁLOGO ORDENADO POR PRECIO:");
        ordenarPorValor(catalogo);
        System.out.println("CANTIDAD DE PRODUCTOS RECOMENDADOS: " + contarRecomendables(catalogo));

        //E5
        Descontable[] carrito = new Descontable[15];
        Ropa r1 = new Ropa("L", 15.20);
        Ropa r2 = new Ropa("S", 12.50);
        Ropa r3 = new Ropa("M", 29.99);
        Ropa r4 = new Ropa("XL", 19.95);
        Ropa r5 = new Ropa("XS", 45.00);

        LibroTienda l1 = new LibroTienda("Invicto", "Marcos Vazquez", 23.89);
        LibroTienda l2 = new LibroTienda("El Alquimista", "Paulo Coelho", 15.00);
        LibroTienda l3 = new LibroTienda("1984", "George Orwell", 12.80);
        LibroTienda l4 = new LibroTienda("Sapiens", "Yuval Noah Harari", 21.90);
        LibroTienda l5 = new LibroTienda("Dune", "Frank Herbert", 25.50);

        Electronica el1 = new Electronica("Xiaomi", "movil", 350.45);
        Electronica el2 = new Electronica("Samsung", "tablet", 420.00);
        Electronica el3 = new Electronica("Apple", "reloj", 399.00);
        Electronica el4 = new Electronica("Logitech", "ratón", 45.30);
        Electronica el5 = new Electronica("HP", "portátil", 750.00);

        carrito[0] = r1;
        carrito[1] = r2;
        carrito[2] = r3;
        carrito[3] = r4;
        carrito[4] = r5;
        carrito[5] = l1;
        carrito[6] = l2;
        carrito[7] = l3;
        carrito[8] = l4;
        carrito[9] = l5;
        carrito[10] = el1;
        carrito[11] = el2;
        carrito[12] = el3;
        carrito[13] = el4;
        carrito[14] = el5;

        System.out.println("EL PRECIO TOTAL DEL CARRITO ES: " + totalPagar(carrito) + "$");
        aplicarCampania(carrito, 15);
        System.out.println("EL PRODUCTO MÁS CARO ES: ");
        System.out.println(masCaro(carrito));

        //E6
        Comible[] animales = new Comible[20];
        Leon le1 = new Leon("Leon", "Carne", 3000);
        Leon le2 = new Leon("León de Katanga", "Búfalo", 4500);
        Leon le3 = new Leon("León del Congo", "Zebra", 3800);
        Leon le4 = new Leon("León de Transvaal", "Ñu", 5000);
        Leon le5 = new Leon("León Asiático", "Ciervo", 3200);
        Leon le6 = new Leon("León de Nubia", "Jabalí", 4100);
        Leon le7 = new Leon("León de África Occidental", "Antílope", 2900);
        Leon le8 = new Leon("León de Masái", "Gacela", 3500);
        Leon le9 = new Leon("León de Etiopía", "Caballo", 3700);
        Leon le10 = new Leon("León del Kalahari", "Oryx", 4300);
        Leon le11 = new Leon("León Blanco", "Carne magra", 4000);
        Jirafa j1 = new Jirafa("Jirafa", "hierba", 4000);
        Jirafa j2 = new Jirafa("Jirafa de Reticulada", "hierba", 3500);
        Jirafa j3 = new Jirafa("Jirafa de Angola", "hierba", 3200);
        Jirafa j4 = new Jirafa("Jirafa de Rotschild", "hierba", 3800);
        Jirafa j5 = new Jirafa("Jirafa de Sudáfrica", "hierba", 4200);
        Jirafa j6 = new Jirafa("Jirafa de Masái", "hierba", 4500);
        Jirafa j7 = new Jirafa("Jirafa del Kordofán", "hierba", 3100);
        Pinguino p1 = new Pinguino("Pinguino Emperador", "Pescado", 200);
        Pinguino p2 = new Pinguino("Pinguino de Adelia", "Krill", 150);
        Pinguino p3 = new Pinguino("Pinguino Barbijo", "Peces pequeños", 180);
        Pinguino p4 = new Pinguino("Pinguino Papúa", "Calamares", 220);

        animales[0] = le1;
        animales[1] = le2;
        animales[2] = le3;
        animales[3] = le4;
        animales[4] = le5;
        animales[5] = le6;
        animales[6] = le7;
        animales[7] = le8;
        animales[8] = le9;
        animales[9] = le10;
        animales[10] = j1;
        animales[11] = j2;
        animales[12] = j3;
        animales[13] = j4;
        animales[14] = j5;
        animales[15] = j6;
        animales[16] = j7;
        animales[17] = p1;
        animales[18] = p2;
        animales[19] = p3;

        System.out.println("LA CANTIDAD DE COMIDA TOTAL PARA TODOS LOS ANIMALES ES: " + comidaTotal(animales) + "gr");
        System.out.println("LA CANTIDAD DE COMIDA TOTAL PARA TODOS LOS ANIMALES QUE COMEN HIERBA ES : " + contarComidaTotalPorTipo(animales, "hierba") + "gr");
        System.out.println("MENU ANIMALES : ");
        imprimirMenu(animales);

        //E7

        Medible[] registro = new Medible[25];
        GrasaCorporal g1 = new GrasaCorporal(5, "kg");
        GrasaCorporal g2 = new GrasaCorporal(8,  "kg");
        GrasaCorporal g3 = new GrasaCorporal(12, "kg");
        GrasaCorporal g4 = new GrasaCorporal(15, "kg");
        GrasaCorporal g5 = new GrasaCorporal(20, "kg");
        GrasaCorporal g6 = new GrasaCorporal(7,  "kg");
        GrasaCorporal g7 = new GrasaCorporal(10, "kg");
        PesoKg ps1 = new PesoKg(92, "kg");
        PesoKg ps2 = new PesoKg(75,  "kg");
        PesoKg ps3 = new PesoKg(110, "kg");
        PesoKg ps4 = new PesoKg(68,  "kg");
        PesoKg ps5 = new PesoKg(85,  "kg");
        PesoKg ps6 = new PesoKg(95,  "kg");
        PesoKg ps7 = new PesoKg(57,  "kg");
        Repeticiones rp1 = new Repeticiones(12, "kg");
        Repeticiones rp2 = new Repeticiones(8,  "reps");
        Repeticiones rp3 = new Repeticiones(15, "reps");
        Repeticiones rp4 = new Repeticiones(6,  "reps");
        Repeticiones rp5 = new Repeticiones(20, "reps");
        Repeticiones rp6 = new Repeticiones(10, "reps");
        Repeticiones rp7 = new Repeticiones(5,  "reps");
        TiempoMin t1 = new TiempoMin(45, "minutos");
        TiempoMin t2 = new TiempoMin(30, "minutos");
        TiempoMin t3 = new TiempoMin(60, "minutos");
        TiempoMin t4 = new TiempoMin(90, "minutos");

        registro[0] = g1;
        registro[1] = g2;
        registro[2] = g3;
        registro[3] = g4;
        registro[4] = g5;
        registro[5] = g6;
        registro[6] = g7;
        registro[7] = ps1;
        registro[8] = ps2;
        registro[9] = ps3;
        registro[10] = ps4;
        registro[11] = ps5;
        registro[12] = ps6;
        registro[13] = ps7;
        registro[14] = rp1;
        registro[15] = rp2;
        registro[16] = rp3;
        registro[17] = rp4;
        registro[18] = rp5;
        registro[19] = rp6;
        registro[20] = rp7;
        registro[21] = t1;
        registro[22] = t2;
        registro[23] = t3;
        registro[24] = t4;

        Medible mayor = maximo(registro);
        System.out.println("LA MEDICIÓN CON MAYOR VALOR: " + mayor.valor() + mayor.unidad());
        System.out.println("LA MEDIA DEL TODOS LOS REGISTROS DE TIEMPO MÍMINO ES: " + mediaTiempoMin(registro) + " minutos");
        System.out.println("LA CANTIDAD DE VECES QUE SE REPITE LA UNIDAD 'Kg' ES: " + contarUnidad(registro, "kg"));

        //E8
        Pagable[] vehiculos = new Pagable[50];
        int[] horas = {1,2,3,4,5,6,7,8,9,45,5,7,4,2,8,4,6,7,8,59,2,6,4,5,7,3,4,9,2,6,3,8,4,5,6,9,4,2,5,8,5,3,9,5,7,3,2,5,6,4};
        Coche c1 = new Coche("Coche", 3.42);
        Coche c2  = new Coche("Coche", 4.10);
        Coche c3  = new Coche("Coche", 5.75);
        Coche c4  = new Coche("Coche", 6.30);
        Coche c5  = new Coche("Coche", 7.00);
        Coche c6  = new Coche("Coche", 4.85);
        Coche c7  = new Coche("Coche", 8.20);
        Coche c8  = new Coche("Coche", 3.90);
        Coche c9  = new Coche("Coche", 6.55);
        Coche c10 = new Coche("Coche", 5.10);
        Coche c11 = new Coche("Coche", 9.00);
        Coche c12 = new Coche("Coche", 4.40);
        Coche c13 = new Coche("Coche", 7.65);
        Coche c14 = new Coche("Coche", 3.15);
        Coche c15 = new Coche("Coche", 5.50);
        Coche c16 = new Coche("Coche", 6.80);
        Coche c17 = new Coche("Coche", 4.25);
        Coche c18 = new Coche("Coche", 8.90);
        Coche c19 = new Coche("Coche", 3.70);
        Coche c20 = new Coche("Coche", 7.35);

        Moto m1 = new Moto("Moto", 1.42);
        Moto m2  = new Moto("Moto", 2.10);
        Moto m3  = new Moto("Moto", 3.00);
        Moto m4  = new Moto("Moto", 1.85);
        Moto m5  = new Moto("Moto", 2.60);
        Moto m6  = new Moto("Moto", 3.45);
        Moto m7  = new Moto("Moto", 1.70);
        Moto m8  = new Moto("Moto", 2.30);
        Moto m9  = new Moto("Moto", 4.00);
        Moto m10 = new Moto("Moto", 1.55);
        Moto m11 = new Moto("Moto", 3.20);
        Moto m12 = new Moto("Moto", 2.80);
        Moto m13 = new Moto("Moto", 1.95);
        Moto m14 = new Moto("Moto", 3.60);
        Moto m15 = new Moto("Moto", 2.45);
        Moto m16 = new Moto("Moto", 1.30);
        Moto m17 = new Moto("Moto", 4.15);
        Moto m18 = new Moto("Moto", 2.05);
        Moto m19 = new Moto("Moto", 3.75);
        Moto m20 = new Moto("Moto", 1.60);

        Furgoneta fu1 = new Furgoneta("Furgoneta", 5);
        Furgoneta fu2  = new Furgoneta("Furgoneta", 7);
        Furgoneta fu3  = new Furgoneta("Furgoneta", 9);
        Furgoneta fu4  = new Furgoneta("Furgoneta", 6);
        Furgoneta fu5  = new Furgoneta("Furgoneta", 11);
        Furgoneta fu6  = new Furgoneta("Furgoneta", 8);
        Furgoneta fu7  = new Furgoneta("Furgoneta", 13);
        Furgoneta fu8  = new Furgoneta("Furgoneta", 10);
        Furgoneta fu9  = new Furgoneta("Furgoneta", 14);
        Furgoneta fu10 = new Furgoneta("Furgoneta", 12);

        vehiculos[0]  = c1;
        vehiculos[1]  = c2;
        vehiculos[2]  = c3;
        vehiculos[3]  = c4;
        vehiculos[4]  = c5;
        vehiculos[5]  = c6;
        vehiculos[6]  = c7;
        vehiculos[7]  = c8;
        vehiculos[8]  = c9;
        vehiculos[9]  = c10;
        vehiculos[10] = c11;
        vehiculos[11] = c12;
        vehiculos[12] = c13;
        vehiculos[13] = c14;
        vehiculos[14] = c15;
        vehiculos[15] = c16;
        vehiculos[16] = c17;
        vehiculos[17] = c18;
        vehiculos[18] = c19;
        vehiculos[19] = c20;
        vehiculos[20] = m1;
        vehiculos[21] = m2;
        vehiculos[22] = m3;
        vehiculos[23] = m4;
        vehiculos[24] = m5;
        vehiculos[25] = m6;
        vehiculos[26] = m7;
        vehiculos[27] = m8;
        vehiculos[28] = m9;
        vehiculos[29] = m10;
        vehiculos[30] = m11;
        vehiculos[31] = m12;
        vehiculos[32] = m13;
        vehiculos[33] = m14;
        vehiculos[34] = m15;
        vehiculos[35] = m16;
        vehiculos[36] = m17;
        vehiculos[37] = m18;
        vehiculos[38] = m19;
        vehiculos[39] = m20;
        vehiculos[40] = fu1;
        vehiculos[41] = fu2;
        vehiculos[42] = fu3;
        vehiculos[43] = fu4;
        vehiculos[44] = fu5;
        vehiculos[45] = fu6;
        vehiculos[46] = fu7;
        vehiculos[47] = fu8;
        vehiculos[48] = fu9;
        vehiculos[49] = fu10;

        System.out.println("EL IMPORTE TOTAL ES DE: "+ racaudacionTotal(vehiculos, horas) + "$");
        System.out.println("QUIEN HA PAGADO MÁS: " + quienPagoMas(vehiculos, horas));
        System.out.println("VEHICULOS CON IMPORTE SUPERIOR AL UMBRAL: " + contarPorEncimaDe(vehiculos, horas, 23));
    
        //E9
        Inscribible[] actividades = new Inscribible[12];
        Taller ta1 = new Taller("Taller de Comunicación", 200, 3,200);
        Taller ta2 = new Taller("Taller de Robótica",          150, 2,          150);
        Taller ta3 = new Taller("Taller de Fotografía",        180, 4,        180);
        Excursion ex1 = new Excursion("Excurion a las Landas", 100, 47, 100);
        Excursion ex2 = new Excursion("Excursión al Guggenheim",     30, 25,     30);
        Excursion ex3 = new Excursion("Excursión a San Sebastián",   50, 60,   50);
        ViajeFinCurso v1 = new ViajeFinCurso("Salou", 300, 500, 500);
        ViajeFinCurso v2 = new ViajeFinCurso("París",         650, 120,         120);
        ViajeFinCurso v3 = new ViajeFinCurso("Roma",          700, 95,          95);
        Competicion co1 = new Competicion("Campeonato España", 20, 20);
        Competicion co2 = new Competicion("Campeonato Euskadi",       15,       15);
        Competicion co3 = new Competicion("Olimpiada Matemáticas",    30,    30);

        actividades[0]  = ta1;
        actividades[1]  = ta2;
        actividades[2]  = ta3;
        actividades[3]  = ex1;
        actividades[4]  = ex2;
        actividades[5]  = ex3;
        actividades[6]  = v1;
        actividades[7]  = v2;
        actividades[8] = v3;
        actividades[9] = co1;
        actividades[10] = co2;
        actividades[11] = co3;

        Alumno a1 = new Alumno("22766404S", "Ekaitz Martin", 22, 1, true);
        Alumno a2  = new Alumno("34512678A", "Laura González",   19, 2, false);
        Alumno a3  = new Alumno("45678912B", "Carlos Fernández", 21, 1, true);
        Alumno a4  = new Alumno("56789123C", "María López",      20, 3, false);
        Alumno a5  = new Alumno("67891234D", "Iker Rodríguez",   23, 2, true);
        Alumno a6  = new Alumno("78912345E", "Ana Martínez",     18, 1, false);
        Alumno a7  = new Alumno("89123456F", "Jon Sánchez",      24, 3, true);
        Alumno a8  = new Alumno("91234567G", "Lucía Pérez",      19, 2, false);
        Alumno a9  = new Alumno("12345678H", "Mikel García",     22, 2, true);
        Alumno a10 = new Alumno("23456789I", "Sara Jiménez",     20, 3, false);
        Alumno a11 = new Alumno("34567890J", "Unai Ruiz",        21, 2, true);
        Alumno a12 = new Alumno("45678901K", "Paula Díaz",       18, 2, false);

        // ===== Array alumnos (posiciones 0-11) =====
        Alumno[] alumnos = new Alumno[12];

        alumnos[0]  = a1;
        alumnos[1]  = a2;
        alumnos[2]  = a3;
        alumnos[3]  = a4;
        alumnos[4]  = a5;
        alumnos[5]  = a6;
        alumnos[6]  = a7;
        alumnos[7]  = a8;
        alumnos[8]  = a9;
        alumnos[9]  = a10;
        alumnos[10] = a11;
        alumnos[11] = a12;

        //Alumno que NO puede participar en ningúna actividad
        ex1.registrarPago(a12,ex1.precio());
        System.out.println(ex1.estaPagado(a5));
        System.out.println("NUMERO DE ACTIVIDADES A LAS QUE EL ALUMNO " + a12.getNombre() + " HA SIDO INSCRITO: " + inscribirAlumnoEnTodo(actividades, a12));
        //Alumno que SI  puede participar en ningúna actividad
        System.out.println("NUMERO DE ACTIVIDADES A LAS QUE EL ALUMNO " + a9.getNombre() + " HA SIDO INSCRITO: " + inscribirAlumnoEnTodo(actividades, a9));
        System.out.println("NUMERO DE ACTIVIDADES A LAS QUE EL ALUMNO " + a5.getNombre() + " HA SIDO INSCRITO: " + inscribirAlumnoEnTodo(actividades, a5));
        System.out.println("LA ACTIVIDAD MÁS SOLICITADA ES: " + masSolicitada(actividades).toString());
        
        /*System.out.println("NUMERO DE PLAZAS RESTANTES EN LAS COMPETICIONES: ");
        System.out.println("ESPAÑA: " + co1.getPlazas());
        System.out.println("EUSKADI: " + co2.getPlazas());
        System.out.println("MATES: " + co3.getPlazas());*/
        System.out.println("ALUMNOS MOROSOS: ");
        pendientesPago(actividades, alumnos);
    }
    public static Alumno[] pendientesPago(Object[] actividades, Alumno[] alumnos) {
        Alumno[] morosos = new Alumno[0];
        int pos = 0;
        for (int i = 0; i <= alumnos.length-1; i++) {
            for (int j = 0; j <= actividades.length-1; j++) {
                if (actividades[j] instanceof Pagablee) {
                    Pagablee temporal = (Pagablee)actividades[j];
                    if (temporal.estaPagado(alumnos[i]) == false) {
                        morosos = Arrays.copyOf(morosos, morosos.length + 1);
                        morosos[pos] = alumnos[i];
                        pos ++;
                        break;
                    }
                }
            }
        }
        for (int i = 0; i <= morosos.length-1; i++) {
            System.out.println(morosos[i]);
        }
        return alumnos;
    }
    public static Inscribible masSolicitada(Object[] actividades) {
        Inscribible masSolicitado = (Inscribible)actividades[0];
        for (int i = 0; i <= actividades.length-1; i ++) {
            if (actividades[i] instanceof Inscribible) {
                Inscribible temporal = (Inscribible) actividades[i];
                // la función plazas diponibles la he usado como medidor de damanda, me devuelve la resta de el aforo y las plazas disponibles. AL ser una interfaz implementada por todas las clases, facilita mucho las cosas si meto esa lógica en esa función en vez de hacerlo en esta función del main
                if ((temporal.plazasDisponibles()) > masSolicitado.plazasDisponibles()) {
                    masSolicitado = temporal;
                }
            }
        }
        return masSolicitado;
    }
    /*public static double recaudacionTotal(Object[] actividades) {
        double totalRecaudado = 0;
        for (int i = 0; i <= actividades.length-1; i++) {
            if (actividades[i] instanceof Excursion) {
                Excursion temporal = (Excursion)actividades[i];
                if(temporal.estaPagado(null)) {
                    numInscripciones ++;
                }
            }
            if (actividades[i] instanceof ViajeFinCurso) {
                ViajeFinCurso temporal = (ViajeFinCurso)actividades[i];
                if(temporal.inscribir(a)) {
                    numInscripciones ++;
                }
                else {
                    System.out.println(temporal.motivoRechazo(a));
                }
            }
        }
        return numInscripciones;
    }*/
    public static int inscribirAlumnoEnTodo(Object[] actividades, Alumno a) {
        int numInscripciones = 0;
        for (int i = 0; i <= actividades.length-1; i++) {
            if (actividades[i] instanceof Taller) {
                Taller temporal = (Taller)actividades[i];
                if(temporal.inscribir(a)) {
                    numInscripciones ++;
                }
                else {
                    System.out.println(temporal.motivoRechazo(a));
                }
            }
            if (actividades[i] instanceof Excursion) {
                Excursion temporal = (Excursion)actividades[i];
                if(temporal.inscribir(a)) {
                    numInscripciones ++;
                }
            }
            if (actividades[i] instanceof ViajeFinCurso) {
                ViajeFinCurso temporal = (ViajeFinCurso)actividades[i];
                if(temporal.inscribir(a)) {
                    numInscripciones ++;
                }
                else {
                    System.out.println(temporal.motivoRechazo(a));
                }
            }
            if (actividades[i] instanceof Competicion) {
                Competicion temporal = (Competicion)actividades[i];
                if(temporal.inscribir(a)) {
                    numInscripciones ++;
                }
                else {
                    System.out.println(temporal.motivoRechazo(a));
                }
            }
        }
        return numInscripciones;
    }
    public static int contarPorEncimaDe(Pagable[] vehiculos, int[] horas, double umbral) {
        int contador = 0;
        for (int i = 0; i <= vehiculos.length-1; i++) {
            if (vehiculos[i].importe(horas[i]) > umbral) {
                contador ++;
            }
        }
        return contador;
    }
    public static Pagable quienPagoMas(Pagable[] vehiculos, int[] horas) {
        Pagable masPagado = vehiculos[0];
        double importe = masPagado.importe(horas[0]);
        for (int i = 0; i <= vehiculos.length-1; i++) {
            if (vehiculos[i].importe(horas[i]) > importe) {
                masPagado = vehiculos[i];
                importe = masPagado.importe(horas[i]);
            }
        }
        return masPagado;
    }
    public static double racaudacionTotal(Pagable[] vehiculos, int[] horas) {
        double total = 0;
        for (int i = 0; i <= vehiculos.length-1; i++) {
            total += vehiculos[i].importe(horas[i]);
        }
        return total;
    }
    public static int contarUnidad(Medible[] registro, String unidad) {
        int cont = 0;
        for (int i = 0; i <= registro.length-1; i++) {
            if (registro[i].unidad().equals(unidad)) {
                cont ++;
            }
        }
        return cont ++;
    }
    public static double mediaTiempoMin(Medible[] registro) {
        double media = 0;
        int cantidad = 0;
        for (int i = 0; i <= registro.length-1; i++) {
            if (registro[i] instanceof TiempoMin) {
                media += registro[i].valor();
                cantidad ++;
            }
        }
        media /= cantidad;
        return media;
    }
    public static Medible maximo(Medible[] registro) {
        Medible mayor = registro[0];
        for (int i = 0; i <= registro.length-1; i++) {
            if(registro[i].valor() > mayor.valor()) {
                mayor = registro[i];
            }
        }
        return mayor;
    }
    public static void imprimirMenu(Comible[] animales) {
        for (int i = 0; i <= animales.length-1; i++) {
            System.out.println(animales[i].toString());
        }

    }
    public static int contarComidaTotalPorTipo(Comible[] animales, String tipo) {
        int comidaTotal = 0;
        for (int i = 0; i <= animales.length-1; i++) {
            if (animales[i].tipoComida().equals(tipo))
            comidaTotal += animales[i].racionDiaria();
        }
        return comidaTotal;

    }
    public static int comidaTotal(Comible[] animales) {
        int comidaTotal = 0;
        for (int i = 0; i <= animales.length-1; i++) {
            comidaTotal += animales[i].racionDiaria();
        }
        return comidaTotal;

    }
    public static Descontable masCaro(Descontable[] carrito) {
        Descontable mas_caro = carrito[0];
        for (int i = 0; i <= carrito.length-1; i++) {
            carrito[i].aplicarDescuento(i);
            if (carrito[i].precioFinal() > mas_caro.precioFinal()) {
                mas_caro = carrito[i];
            }
        }
        return mas_caro;
    }
    public static void aplicarCampania(Descontable[] carrito, double pct) {
        double totalAPargar = totalPagar(carrito);
        totalAPargar -= totalAPargar * (pct/100);
        System.out.println("TOTAL A PAGAR DESPUÉS DE LA CAMPAÑA: " + totalAPargar + "$");
    }
    public static double totalPagar(Descontable[] carrito) {
        double total = 0;
        for (int i = 0; i <= carrito.length-1; i++) {
            if (carrito[i] instanceof Ropa) {
                Ropa producto;
                producto = (Ropa) carrito[i];
                producto.aplicarDescuento(producto.getDescuento());
                total += producto.precioFinal();
            }
            else if (carrito[i] instanceof LibroTienda) {
                LibroTienda producto;
                producto = (LibroTienda) carrito[i];
                producto.aplicarDescuento(producto.getDescuento());
                total += producto.precioFinal();
            }
            else {
                Electronica producto;
                producto = (Electronica) carrito[i];
                producto.aplicarDescuento(producto.getDescuento());
                total += producto.precioFinal();
            }
        }
        return total;
    }
    public static int contarRecomendables(Ofertable[] catalogo) {
        int contador = 0;
        for (int i = 0; i <= catalogo.length-1; i ++) {
            if (catalogo[i].recomendable()) {
                contador ++;
            }
        }
        return contador;
    }
    public static void ordenarPorValor(Ofertable[] catalogo) {
        for (int i = 0; i <= catalogo.length-1; i++) {
            for (int j = i + 1; j <= catalogo.length-1; j ++) {
                if (catalogo[i].precio() > catalogo[j].precio()) {
                    Ofertable aux;
                    aux = catalogo[i];
                    catalogo[i] = catalogo[j];
                    catalogo[j] = aux;
                }
            }
        }
        for(int i = 0; i <= catalogo.length-1; i ++) {
            System.out.println(catalogo[i].toString());
        }

    }
    public static Ofertable buscarPorProfesor(Ofertable[] catalogo, String profesor) {
        for (int i = 0; i <= catalogo.length-1; i++) {
            if (catalogo[i].getProfesor().equals(profesor)) {
                return catalogo[i];
            }
        }
        return null;
    }
    public static void ordenarPorAtractivo(Exhibible[] sala) {
        for (int i = 0; i < sala.length-1; i ++) {
            for (int j = i + 1; j <= sala.length-1; j++) {
                if (sala[i].atractivo() < sala[j].atractivo()) {
                    Exhibible aux;
                    aux=sala[i];
                    sala[i] = sala[j];
                    sala[j] = aux;
                }
            }
        }
        for (int i = 0; i <= sala.length-1; i++) {
            System.out.println(sala[i].cartel());
        }
    }
    public static Restaurable[] filtarRestaurables(Exhibible[] sala) {
        Restaurable[] restaurables = new Restaurable[0];
        int pos = 0;
        for (int i = 0; i <= sala.length-1; i++) {
            if (sala[i] instanceof Escultura) {
                Escultura escultura;
                escultura = (Escultura)sala[i];
                restaurables = Arrays.copyOf(restaurables, restaurables.length+1);
                restaurables[pos] = escultura;
                pos ++;
            }
            else if (sala[i] instanceof Pintura) {
                Pintura pintura;
                pintura = (Pintura)sala[i];
                restaurables = Arrays.copyOf(restaurables, restaurables.length+1);
                restaurables[pos] = pintura;
                pos ++;
            }
        }
        return restaurables;
    }
    public static void imprimirCartelas(Exhibible[] sala) {
        for (int i = 0; i <= sala.length-1; i ++) {
            System.out.println(sala[i].cartel());
        }
    }
    public static void printPacientes(Paciente[] pacientes) {
        for(int i = 0; i < 8; i++) {
            System.out.println(pacientes[i]);
        }
    }
    public static Paciente busquedaBinariaPorId(Paciente[] pacientes, int id) {
        Paciente aux;
        int inicio = 0;
        int fin = pacientes.length-1;
        for (int i = 0; i < pacientes.length-1; i++) {
            for (int j = i + 1; j <= pacientes.length-1; j ++) {
                if (pacientes[i].getId() > pacientes[j].getId()) {
                    aux = pacientes[i];
                    pacientes[i] = pacientes[j];
                    pacientes[j] = aux;
                }
            }
            
        }
        while (inicio <= fin) {
            int pos = inicio + ((fin - inicio) / 2);
            if (id == pacientes[pos].getId()) {
                return pacientes[pos];
            }
            else if (id < pacientes[pos].getId()) {
                fin = pos - 1; // Busco a la izquierda
            }
            else {
                inicio = pos + 1;
            }
        }
        return null;
    }
    public static Paciente buscarPorId(Paciente[] pacientes, int id) {
        Paciente paciente = pacientes[0];
        for (int i = 0; i < 8; i ++) {
            if(pacientes[i].getId() == id) {
                paciente = pacientes[i];
            }
        }
        return paciente;
    }
    public static void ordenarPorEdad(Paciente[] pacientes) {
        Paciente aux;
        for (int i = 0; i < pacientes.length-2; i++) {
            for (int j = 0; j < pacientes.length-2; j ++) {
                if (pacientes[j].getEdad() > pacientes[j + 1].getEdad()) {
                    aux = pacientes[j];
                    pacientes[j] = pacientes[j+1];
                    pacientes[j+1] = aux;
                }
            }
            
        }
        for(int i = 0; i < pacientes.length-1; i++) {
            System.out.println(pacientes[i]);
        }
    }
    public static void ordenarPorEspera(Paciente[] pacientes) {
        Paciente aux;
        for (int i = 0; i < pacientes.length-2; i++) {
            for (int j = 0; j < pacientes.length-2; j ++) {
                if (pacientes[j].getMinutosEspera() > pacientes[j + 1].getMinutosEspera()) {
                    aux = pacientes[j];
                    pacientes[j] = pacientes[j+1];
                    pacientes[j+1] = aux;
                }
            }
            
        }
        for(int i = 0; i < pacientes.length-1; i++) {
            System.out.println(pacientes[i]);
        }
    }
    public static void ordenarPorTriaje(Paciente[] pacientes) {
        Paciente aux;
        for (int i = 0; i < pacientes.length-2; i++) {
            for (int j = 0; j < pacientes.length-2; j ++) {
                if (pacientes[j].getTriaje() > pacientes[j + 1].getTriaje()) {
                    aux = pacientes[j];
                    pacientes[j] = pacientes[j+1];
                    pacientes[j+1] = aux;
                }
            }
            
        }
        for(int i = 0; i < pacientes.length-1; i++) {
            System.out.println(pacientes[i]);
        }
    }
    public static void ordenarPerecederos(Object[] almacen) {
        Perecedero[] perecederos = new Perecedero[almacen.length];
        int j = 0;
        for (int i = 0; i <= almacen.length-1; i++) {
            if (almacen[i] instanceof Planta) {
                Planta nuevaplanta = (Planta) almacen[i];
                perecederos[j] = nuevaplanta;
                j++;

            }
            else if (almacen[i] instanceof Yogurt) {
                Yogurt nuevoyogurt = (Yogurt) almacen[i];
                perecederos[j] = nuevoyogurt;
                j++;
            }
        }
        try {
            for (int i = 0; i <= perecederos.length-2; i++) {
                Perecedero auxiliar;
                if (perecederos[i].diasParaCaducar() > perecederos[i + 1].diasParaCaducar()) {
                    auxiliar = perecederos[i];
                    perecederos[i] = perecederos[i + 1];
                    perecederos[i + 1] = auxiliar;
                }
            }
        } catch (NullPointerException e) {}
        
        for (int i = 0; i <= perecederos.length-1; i++) {
            if (perecederos[i] != null)
                System.out.println(perecederos[i]);
        }
    }
    public static int contarConEmbalaje(Object[] almacen) {
        int cant_embalajes = 0;
        for (int i = 0; i <= almacen.length-1; i++) {
            if (almacen[i] instanceof Planta) {
                Planta nuevaplanta = (Planta) almacen[i];
                if (nuevaplanta.requiereEmbalajeEspecial()) {
                    cant_embalajes ++;

                }

            }
            else if (almacen[i] instanceof Movil) {
                Movil nuevoMovil = (Movil) almacen[i];
                if (nuevoMovil.requiereEmbalajeEspecial()) {
                    cant_embalajes ++;
                }

            }
        }
        return cant_embalajes;
    }
    public static Object[] buscarUrgentes(Object[] almacen) {
        Perecedero[] perecederosUrgentes = new Perecedero[almacen.length];
        int j = 0;
        for (int i = 0; i <= almacen.length-1; i++) {
            if (almacen[i] instanceof Planta) {
                Planta nuevaplanta = (Planta) almacen[i];
                if (nuevaplanta.urgente()) {
                    perecederosUrgentes[j] = nuevaplanta;
                    j++;

                }

            }
            else if (almacen[i] instanceof Yogurt) {
                Yogurt nuevoyogurt = (Yogurt) almacen[i];
                if (nuevoyogurt.urgente()) {
                    perecederosUrgentes[j] = nuevoyogurt;
                    j++;
                }

            }
        }
        return perecederosUrgentes;
    }
}
