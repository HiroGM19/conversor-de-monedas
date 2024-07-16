import java.util.ArrayList;
import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        var listaDeConversiones = new ArrayList<SolicitarMonedas>();
        API realizarApi = new API();
        int opcion = 0;
        while (opcion != 9 ){

            String menu = """
                     ======== Conversor de Monedas ========
                     
                    1) Convertir Dolares a Soles.
                    2) Convertir Soles a Dolares.
                    3) Convertir Dolares a Euros.
                    4) Convertir Euros a Dolares.
                    5) Convertir Pesos ARG a Dolares.
                    6) Convertir Dolares a Pesos ARG.
                    7) Convertir otro tipo de moneda.
                    8) Historial de conversiones.
                    9) Salir.
                    """;
            System.out.println(menu);
            opcion = teclado.nextInt();
            teclado.nextLine();
            switch (opcion){
                case 1:
                    System.out.println("Ingrese la cantidad que desea convertir:");
                    double monto =teclado.nextDouble();
                    SolicitarAPI resultado = realizarApi.consultarMoneda("USD", "PEN",monto);
                    System.out.println("=====================================");
                    System.out.println("La conversion total es de: " + resultado.conversion_result());
                    System.out.println("=====================================");
                    listaDeConversiones.add(new SolicitarMonedas(resultado));

                    break;

                case 2:
                    System.out.println("Ingrese la cantidad que desea convertir:");
                    double monto2 = teclado.nextDouble();
                    SolicitarAPI resultado2 = realizarApi.consultarMoneda("PEN", "USD",monto2);
                    System.out.println(resultado2.conversion_result());
                    System.out.println("=====================================");
                    System.out.println("La conversion total es de: " + resultado2.conversion_result());
                    System.out.println("=====================================");
                    listaDeConversiones.add(new SolicitarMonedas(resultado2));
                    break;

                case 3:
                    System.out.println("Ingrese la cantidad que desea convertir:");
                    double monto3 = teclado.nextDouble();
                    SolicitarAPI resultado3 = realizarApi.consultarMoneda("USD", "EUR",monto3);
                    System.out.println(resultado3.conversion_result());
                    System.out.println("=====================================");
                    System.out.println("La conversion total es de: " + resultado3.conversion_result());
                    System.out.println("=====================================");
                    listaDeConversiones.add(new SolicitarMonedas(resultado3));
                    break;


                case 4:
                    System.out.println("Ingrese la cantidad que desea convertir:");
                    double monto4 = teclado.nextDouble();
                    SolicitarAPI resultado4 = realizarApi.consultarMoneda("EUR", "USD",monto4);
                    System.out.println(resultado4.conversion_result());
                    System.out.println("=====================================");
                    System.out.println("La conversion total es de: " + resultado4.conversion_result());
                    System.out.println("=====================================");
                    listaDeConversiones.add(new SolicitarMonedas(resultado4));
                    break;

                case 5:
                    System.out.println("Ingrese la cantidad que desea convertir:");
                    double monto5 = teclado.nextDouble();
                    SolicitarAPI resultado5 = realizarApi.consultarMoneda("EUR", "USD", monto5);
                    System.out.println(resultado5.conversion_result());
                    System.out.println("=====================================");
                    System.out.println("La conversion total es de: " + resultado5.conversion_result());
                    System.out.println("=====================================");
                    listaDeConversiones.add(new SolicitarMonedas(resultado5));
                    break;

                case 6:
                    System.out.println("Ingrese la cantidad que desea convertir:");
                    double monto6 = teclado.nextDouble();
                    SolicitarAPI resultado6 = realizarApi.consultarMoneda("EUR", "USD", monto6);
                    System.out.println(resultado6.conversion_result());
                    System.out.println("=====================================");
                    System.out.println("La conversion total es de: " + resultado6.conversion_result());
                    System.out.println("=====================================");
                    listaDeConversiones.add(new SolicitarMonedas(resultado6));
                    break;

                case 7:
                    System.out.println("Ingrese el codigo de su moneda base. ejm: USD");
                    String monedaConvertir = teclado.nextLine();
                    System.out.println("Ingrese el codigo de la moneda a convertir: ejm: EUR");
                    String monedaConvertida = teclado.nextLine();
                    System.out.println("Ingrese la cantidad que desea convertir");
                    double monto7 = teclado.nextDouble();
                    SolicitarAPI resultado7 = realizarApi.consultarMoneda(monedaConvertida, monedaConvertir, monto7 );
                    System.out.println("=====================================");
                    System.out.println("La conversion total es de: " + resultado7.conversion_result());
                    System.out.println("=====================================");
                    listaDeConversiones.add(new SolicitarMonedas(resultado7));
                    break;
                case 8:
                    listaDeConversiones.stream().forEach(System.out::println);
                case 9:
                    System.out.println("¡Hasta luego!");
                    break;

                default:
                    System.out.println("Opción inválida. Inténtelo de nuevo.");
                    break;
            }
        }
    }
}