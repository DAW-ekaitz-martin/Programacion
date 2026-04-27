import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
public class E3 {
    public static void main(String[] args) {
        Map<String, Integer> baseDeDatos = new HashMap<>();
        boolean finalizar = false;
        do {
            Scanner scanner = new Scanner(System.in);
            System.out.print("Nombre de usuario(f para finalizar): ");
            String usuario = scanner.nextLine();
            if(baseDeDatos.containsKey(usuario)) {
                baseDeDatos.put(usuario, baseDeDatos.get(usuario) + 1);
            }
            else if(usuario.equals("f")) {
                finalizar = true;
            }
            else {
                baseDeDatos.put(usuario, 1);
            }
            for(Map.Entry<String, Integer> entrada: baseDeDatos.entrySet()) {
                System.out.println("-" + entrada.getKey()+":"+entrada.getValue());
            }
        } while(!finalizar);
        
        
        
    }
}
