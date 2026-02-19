import armario.*;
import biblioteca.*;
import inventario.*;
import persona.Estudiante;
import universidad.*;
import vehiculo.*;
public class E1 {
    public static void main(String[] args) {
        Estudiante ekaitz = new Estudiante("DAW", "Ekaitz", 22);
        Coche coche = new Coche("Urus");
        Bicicleta bicicleta = new Bicicleta("Mountain bike");
        System.out.println("PRESENTACIÓN DEL ALUMNO");
        System.out.println(ekaitz.presentarse());
        System.out.println("METODOS ACELERAR DE COCHE Y BICICLETA");
        coche.acelerar();
        bicicleta.acelerar();
        //E4
        System.out.println("INFORMACIÓN DEL TELEFONO MÓVIL");
        TelefonoMovil mi_movil = new TelefonoMovil("Xiaomi", 100, "Poco 3Pro", 350.45, 1);
        double total_movil = mi_movil.calcularImpuesto() + mi_movil.getPrecio();
        System.out.println("El precio total del producto es: " + total_movil + " $");
        System.out.println(mi_movil.mostrarDetalles());
        System.out.println("INFORMACIÓN DEL PORTÁTIL");
        Portatil mi_portatil = new Portatil("Asus", 2, 800, "Intel i5", 24);
        double total_portatil = mi_portatil.calcularImpuesto() + mi_portatil.getPrecio();
        System.out.println("El precio total del producto es: " + total_portatil + " $");
        System.out.println(mi_portatil.mostrarDetalles());
        
        System.out.println("ARRAY DE PRODUCTOS");
        Producto[] productos = new Producto[10];
        productos[0] = mi_movil;
        productos[1] = mi_portatil;
        double total_inventario = 0;
        for (int i = 0; i < 2; i++) {
            total_inventario += productos[i].calcularImpuesto() + productos[i].getPrecio();
        }
        System.out.println("Valor total del inventario: " + total_inventario + "$");

        //E5
        Evaluacion[] eval_1 = new Evaluacion[6];

        Examen ex_1 = new Examen("Ekaitz");
        ex_1.aniadirNota(8);
        ex_1.aniadirNota(9);
        ex_1.aniadirNota(10);
        ex_1.aniadirNota(9);
        ex_1.aniadirNota(8);
        eval_1[0] = ex_1;

        Examen ex_2 = new Examen("Ekaitz");
        ex_2.aniadirNota(8);
        ex_2.aniadirNota(9);
        ex_2.aniadirNota(10);
        ex_2.aniadirNota(9);
        ex_2.aniadirNota(8);
        eval_1[1] = ex_2;

        Tarea tarea_1 = new Tarea("Ekaitz");
        tarea_1.aniadirNota(8);
        tarea_1.aniadirNota(9);
        tarea_1.aniadirNota(10);
        tarea_1.aniadirNota(9);
        tarea_1.aniadirNota(8);
        eval_1[2] = tarea_1;

        Tarea tarea_2 = new Tarea("Ekaitz");
        tarea_2.aniadirNota(8);
        tarea_2.aniadirNota(9);
        tarea_2.aniadirNota(10);
        tarea_2.aniadirNota(9);
        tarea_2.aniadirNota(8);
        eval_1[3] = tarea_2;

        Proyecto proyecto_1 = new Proyecto("Ekaitz");
        proyecto_1.aniadirNota(8);
        proyecto_1.aniadirNota(9);
        proyecto_1.aniadirNota(10);
        proyecto_1.aniadirNota(9);
        proyecto_1.aniadirNota(8);
        eval_1[4] = proyecto_1;

        Proyecto proyecto_2 = new Proyecto("Ekaitz");
        proyecto_2.aniadirNota(8);
        proyecto_2.aniadirNota(9);
        proyecto_2.aniadirNota(10);
        proyecto_2.aniadirNota(9);
        proyecto_2.aniadirNota(8);
        eval_1[5] = proyecto_2;

        double nota_final_evaluacion = 0;
        for (int i = 0; i <= eval_1.length-1; i++) {
            nota_final_evaluacion += eval_1[i].calcularNotaFinal();
        }
        System.out.println("NOTA FINAL DE LA EVALUACION");
        nota_final_evaluacion = nota_final_evaluacion / eval_1.length;
        int[] dias_retraso = {3,4,1,7,8,3,4,5,10,5};
        MaterialBiblioteca[] biblioteca = new MaterialBiblioteca[10];
        Libro libro_1 = new Libro("La odisea", "Homero", "Filosofia");
        Libro libro_2 = new Libro("El arte de la guerra", "Sun Tzu", "Desarrollo Personal");
        Libro libro_3 = new Libro("Los Pilares de la Tierra", "Ken Follet", "Fantasía / Historia");
        Libro libro_4 = new Libro("Invicto", "Marcos Vázquez", "Desarrollo Personal");
        Libro libro_5 = new Libro("Las 48 leyes del Poder", "Robert Green", "Desarrollo Personal");
        Libro libro_6 = new Libro("Teo va a la Granja", "Teo", "Física Cuántica");
        Revista rev_1 = new Revista("GQ", "Will Welch", 1);
        Revista rev_2 = new Revista("Spicy4Tuna", "Spicy4Tuna", 2);
        Revista rev_3 = new Revista("HypeBeast", "Kevin Ma", 3);
        Revista rev_4 = new Revista("Panenka", "Aitor Lagunas", 4);
        biblioteca[0] = libro_1;
        biblioteca[1] = libro_2;
        biblioteca[2] = libro_3;
        biblioteca[3] = libro_4;
        biblioteca[4] = libro_5;
        biblioteca[5] = libro_6;
        biblioteca[6] = rev_1;
        biblioteca[7] = rev_2;
        biblioteca[8] = rev_3;
        biblioteca[9] = rev_4;
        System.out.println("ENCONTRAR UN LIBRO EXISTENTE: ");
        buscarMaterial("La odisea", biblioteca);
        
        System.out.println("ENCONTRAR UN LIBRO INEXISTENTE: ");
        buscarMaterial("Harry Potter", biblioteca);

        System.out.println("CALCULAR TOTAL DE RETRASOS: ");
        System.out.println("El importe total por los retrasos es de: ");
        System.out.println(calcularMultaTotal(biblioteca, dias_retraso) + "$");

        //E7
        Armario mi_armario = new Armario();
        Pantalon mi_pantalon = new Pantalon("azul", "L");
        Camiseta mi_camiseta = new Camiseta("roja", "L");
        mi_armario.agregarPrenda(mi_pantalon);
        mi_armario.agregarPrenda(mi_camiseta);
        System.out.println("LAS PRENDAS DE ESTE ARMARIO: ");
        mi_armario.mostrarPrendas();
    }
    public static void buscarMaterial(String titulo, MaterialBiblioteca[] biblioteca) {
        boolean encontrado = false;
        for (int i = 0; i <= biblioteca.length-1; i++) {
            if (biblioteca[i].getTitulo().equals(titulo)) {
                encontrado = true;
                System.out.println(biblioteca[i]);
            }
        }
        if(!encontrado) {
            System.out.println("No se ha encontrado el libro que buscas");
        }
    }
    public static double calcularMultaTotal(MaterialBiblioteca[] biblioteca, int[] dias_retraso) {
        double total = 0;
        for (int i = 0; i <= biblioteca.length-1; i++) {
            total += biblioteca[i].calcularMulta(dias_retraso[i]);
        }
        return total;
    }
}

