import Animal.Animal;
import Animal.Gato;
import Animal.Perro;
import Animal.Pez;
public class E2 {
    public static void main(String[] args) {
        Perro toby = new Perro("Toby", 7, "husky", true);
        Perro Jack_Sperrow = new Perro("Jack Sperrow");
        Pez nemo = new Pez("Nemo", "salada", 5);
        Gato garfield = new Gato("Garfield", 8);
        //E2
        System.out.println(toby.mostrarInformacion());
        toby.hacerSonido();
        toby.ladrar();
        //E4 => Metodos de hacer sonido sobreescritos
        System.out.println("LOS METODOS HACERSONIDO() SOBREESCRITOS:");
        toby.hacerSonido();
        garfield.hacerSonido();
        //E5
        System.out.println("RECORRER EL ARRAY Y MOSTRAR EL MÉTODO");
        Animal[] animales = new Animal[5];
        animales[0] = toby;
        animales[1] = garfield;
        for (int i = 0; i < 2; i++) {
            animales[i].hacerSonido();
        }
        //E6
        toby.EsEntrenado();
        //E9
        for (int i = 0; i < 2; i ++) {
            if (animales[i] instanceof Gato) {
                System.out.println(animales[i].mostrarInformacion() + " es un Gato");
            }
            else if (animales[i] instanceof Perro) {
                System.out.println(animales[i].mostrarInformacion() + " es un Perro");
            }
            else {
                System.out.println("El objeto no es de tipo Perro ni Gato");
            }
        }
        //10
        System.out.println("MOSTRAR INFORMACIÓN DEL PEZ");
        System.out.println(nemo.mostrarInformacion());
        nemo.nadar();
    }
}
