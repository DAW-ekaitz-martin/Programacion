import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
public class E5 {
    public static void main(String[] args) {
        Map<Integer, String> nombresCodigos = new HashMap<>();
        nombresCodigos.put(1,"Ekaitz");
        nombresCodigos.put(2,"Gaizka");
        nombresCodigos.put(3,"Mateo");
        nombresCodigos.put(4,"Brandon");
        nombresCodigos.put(5,"Walid");
        Scanner sc = new Scanner(System.in);
        System.out.print("Ingrese un código: ");
        int codigo = sc.nextInt();
        if(nombresCodigos.containsKey(codigo)) {
            System.out.println("El nombre es: " + nombresCodigos.get(codigo));
        }
        else {
            
            System.out.println("El codigo no se encuentra registrado");
        }

    }
}
