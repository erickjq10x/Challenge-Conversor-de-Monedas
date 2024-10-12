import java.util.Scanner;

public class Menu {
    String lista = """
            ===================================== 
            
             Conversão de Moeda:
            
             1. Dolar para Peso Argentino 
             2. Peso Argentino para Dolar 
             3. Dolar para Real Brasileño 
             4. Real Brasileño para Dolar 
             5. Dolar para Euro
             6. Euro para Dolar 
             7. Salir 
            =====================================""";

    public void conversorMenu() {
        Scanner scanner = new Scanner(System.in);
        int option;
        double monto;
        Api api = new Api();
        do {
            System.out.println(lista);
            option = scanner.nextInt();
            switch (option) {
                case 1:
                    System.out.println("Ingresar el monto a cambiar:");
                    monto = scanner.nextDouble();
                    Moneda moneda = api.callApi("USD", "ARS", monto);
                    System.out.println("El valor de "+monto+" "+moneda);
                    break;
                case 2:
                    System.out.println("Ingresar el monto a cambiar:");
                    monto = scanner.nextDouble();
                    moneda = api.callApi("ARS","USD", monto);
                    System.out.println("El valor de "+monto+" "+moneda);
                    break;
                case 3:
                    System.out.println("Ingresar el monto a cambiar:");
                    monto = scanner.nextDouble();
                    moneda = api.callApi("USD", "BRL", monto);
                    System.out.println("El valor de "+monto+" "+moneda);
                    break;
                case 4:
                    System.out.println("Ingresar el monto a cambiar:");
                    monto = scanner.nextDouble();
                    moneda = api.callApi("BRL","USD", monto);
                    System.out.println("El valor de "+monto+" "+moneda);
                    break;
                case 5:
                    System.out.println("Ingresar el monto a cambiar:");
                    monto = scanner.nextDouble();
                    moneda = api.callApi("USD","EUR", monto);
                    System.out.println("El valor de "+monto+" "+moneda);
                    break;
                case 6:
                    System.out.println("Ingresar el monto a cambiar:");
                    monto = scanner.nextDouble();
                    moneda = api.callApi("EUR","USD", monto);
                    System.out.println("El valor de "+monto+" "+moneda);
                    break;
                case 7:
                    System.out.println("Saliendo del programa.");
                    break;
                default:
                    System.out.println("Esta opcion no es valida seleccione una de las opciones sugeridas");
                    break;
            }
        } while (option != 7);


    }
}
