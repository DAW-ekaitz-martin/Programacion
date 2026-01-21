public class E4 {
    public static void main(String[] args) {
        Persona yo = new Persona("Ekaitz", 22);
        Persona yo_menor_de_edad = new Persona("Ekaitz", 17);
        Persona yo_18_anios = new Persona("Ekaitz", 18);
        System.out.println(yo.esMayorDeEdad());
        System.out.println(yo_menor_de_edad.esMayorDeEdad());
        System.out.println(yo_18_anios.esMayorDeEdad());
    }
    
}
