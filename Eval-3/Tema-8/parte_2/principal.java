import almacen.*;
import hospital.*;
import java.util.Arrays;
import museo.*;
import plataforma.*;
import tienda.*;
import zoo.*;
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
