public class E18_while {
    public static void main(String[] args) {
        int horas = 0;
        int minutos = 0;
        int segundos = 0;
        while (horas <= 23) {
            while (minutos < 60) {
                while (segundos < 60) {
                    System.out.println(horas + ":" + minutos + ":" + segundos);
                    segundos ++;
                }
                segundos = 0;
                minutos ++;
            }
            minutos = 0;
            horas ++;
        }
    }
}
