import java.util.Scanner;

public class E6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese la unidad de medida de la tempratura: ");
        String unidad = scanner.nextLine();

        System.out.print("Ingrese la unidad de medida de conversion: ");
        String conversion = scanner.nextLine();

        System.out.print("Ingrese la temperatura: ");
        double temperatura = scanner.nextInt();

        if (unidad.equals("Celsius")) {
            if (conversion.equals("Kelvin")) {
                double kelvin = temperatura + 273.15;
                System.out.println(temperatura + "ºC equivalen a: " + kelvin + " ºK");
            }
            else if (conversion.equals("Fahrenheit")){
                double fahrenheit = (temperatura * 9 / 5) + 32;
                System.out.println(temperatura + "ºC equivalen a: " + fahrenheit + " ºF");
            }
            else if (conversion.equals("Rankine")) {
                double fahrenheit = (temperatura * 9 / 5) + 32;
                double rankine = fahrenheit + 459.67;
                System.out.println(temperatura + "ºC equivalen a: " + rankine + " ºR");
            }
        }

        else if (unidad.equals("Fahrenheit")) {
            if (conversion.equals("Celsius")) {
                double celsius = 5* (temperatura - 32) / 9;
                System.out.println(temperatura + "ºF equivalen a: " + celsius + " ºC");
            }
            else if (conversion.equals("Kelvin")){
                double celsius = 5* (temperatura - 32) / 9;
                double kelvin = celsius + 273.15;
                System.out.println(temperatura + "ºF equivalen a: " + kelvin + " ºK");
            }
            else if (conversion.equals("Rankine")) {
                double rankine = temperatura + 459.67;
                System.out.println(temperatura + "ºC equivalen a: " + rankine + " ºR");
            }
        }

        else if (unidad.equals("Kelvin")) {
            if (conversion.equals("Fahrenheit")) {
                double fahrenheit = (temperatura - 273.15) * 9 / 5 + 32;
                System.out.println(temperatura + "ºK equivalen a: " + fahrenheit + " ºF");
            }
            else if (conversion.equals("Celsius")){
                double fahrenheit = (temperatura - 273.15) * 9 / 5 + 32;
                double celsius = 5* (fahrenheit - 32) / 9;
                System.out.println(temperatura + "ºK equivalen a: " + celsius + " ºC");
            }
            else if (conversion.equals("Rankine")) {
                double fahrenheit = (temperatura - 273.15) * 9 / 5 + 32;
                double rankine = fahrenheit + 459.67;
                System.out.println(temperatura + "ºK equivalen a: " + rankine + " ºR");
            }
        }

        else if (unidad.equals("Rankine")) {
            if (conversion.equals("Fahrenheit")) {
                double fahrenheit = temperatura - 459.67;
                System.out.println(temperatura + "ºR equivalen a: " + fahrenheit + " ºF");
            }
            else if (conversion.equals("Celsius")){
                double fahrenheit = temperatura - 459.67;
                double celsius = 5* (fahrenheit - 32) / 9;
                System.out.println(temperatura + "ºR equivalen a: " + celsius + " ºC");
            }
            else if (conversion.equals("Kelvin")) {
                double fahrenheit = temperatura - 459.67;
                double celsius = 5* (fahrenheit - 32) / 9;
                double kelvin = celsius + 273.15;
                System.out.println(temperatura + "ºR equivalen a: " + kelvin + " ºK");
            }
        }
        scanner.close();
    }
}
