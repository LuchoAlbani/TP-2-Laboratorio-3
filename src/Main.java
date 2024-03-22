import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int opcion;
        char continuar = 's';

        System.out.println("MENU");
        while (continuar == 's') {

            System.out.printf("Seleccione una opcion (1-10):");
            opcion = scanner.nextInt();

            switch(opcion) {

                case 1:
                    sumarEnteros();
                    break;

                case 2:
                    float promedio = promedioDecimal();
                    System.out.println("El promedio de los decimales es: " +promedio);//Punto 2
                    break;

                case 3:
                    float grados = pasarCelsiusaFahrenheit();                     //Punto 3
                    System.out.printf("Tus grados en Fahrenheit son: " + grados);
                    break;

                case 4:
                    float area = areaRectangulo();                                //Punto 4
                    System.out.printf("El area del rectangulo es: " + area);
                    break;

                case 5:
                    float bmi = calcularIndiceMasaCorporal();                     //Punto 5
                    System.out.println("Su Indice de Masa Corporal es: " + bmi);
                    break;

                case 6:
                    float segundos = horasSegundos();                              //Punto 6
                    System.out.println("El total de segundos es: " + segundos);
                    break;

                case 7:
                    float minutos = diasAminutos();                               //Punto 7
                    System.out.println("El total de minutos es " + minutos);
                    break;

                case 8:
                    float millasKilometros=millas();
                    System.out.println("El paso de millas a kilometros es: " + millasKilometros);
                    break;

                case 9:
                    float interes=interesSimple();
                    System.out.println("Su interes simple es: " +interes);
                    break;

                case 10:
                    float dolarAeuro=moneda();
                    System.out.println("Su cambio de Dolar a Euro es: " +dolarAeuro);
                    break;



                default:
                    System.out.println("La opcion que ingreso es incorrecta...");


            }

            System.out.println("Desea ingresar otra opcion? (S/N)");
            continuar = scanner.next().charAt(0); //Ponemos 0 para tomar el primer caracter que seleccione el usuario

        }

        scanner.close();

    }

      //PUNTO 1. Suma de dos números enteros: Solicita al usuario que ingrese dos números enteros,
    //  luego calcula y muestra la suma de estos números.

    public static void sumarEnteros(){
        Scanner scanner = new Scanner(System.in);

        int numero1, numero2, suma;

        System.out.println("Ingrese dos numeros enteros que sumaremos ");

        System.out.println("Numero 1: ");
        numero1 = scanner.nextInt();
        System.out.println("Numero 2: ");
        numero2 = scanner.nextInt();

        suma = numero1 + numero2;

        System.out.println("La suma de los numeros enteros es: " + suma);

    }

   // 2. Promedio de tres números decimales: Pide al usuario que ingrese tres números decimales, calcula su promedio y
    // muestra el resultado

    public static float promedioDecimal(){
        Scanner scanner = new Scanner(System.in);

        float numero1, numero2, numero3, promedio;

        System.out.println("Ingrese tres numeros decimales para sumarlos");

        System.out.println("Numero 1: ");
        numero1= scanner.nextFloat();
        System.out.println("Numero 2: ");
        numero2= scanner.nextFloat();
        System.out.println("Numero 3: ");
        numero3= scanner.nextFloat();


        promedio = (numero1 + numero2 + numero3) / 3;

        return promedio;
    }

    //PUNTO 3. Conversión de grados Celsius a Fahrenheit:
    // Solicita al usuario que ingrese una temperatura en grados Celsius y muestra la
    //temperatura equivalente en grados Fahrenheit. Utiliza la fórmula de conversión:
    //Fahrenheit = (Celsius * 9/5) + 32.

    public static float pasarCelsiusaFahrenheit(){

        Scanner scanner = new Scanner(System.in);

    float celsius, fahrenheit;

        System.out.println("Ingrese su temperatura Celsius: ");
        celsius = scanner.nextFloat();

        return fahrenheit = (celsius * 9/5) + 32;

    }

    //4. Área de un rectángulo:
    // Pide al usuario que ingrese la base y la altura de un rectángulo, luego calcula y
    //muestra su área.

    public static float areaRectangulo(){
        Scanner scanner = new Scanner(System.in);
        float base, altura, area;

        System.out.println("Ingresar la base y la altura del rectangulo ");

        System.out.println("Base: ");
        base = scanner.nextFloat();

        System.out.println("Altura: ");
        altura = scanner.nextFloat();

        return area = base * altura;

    }

    //5. Calculadora de BMI (Índice de Masa Corporal):
    // Solicita al usuario que ingrese su peso en kilogramos y su altura en metros, luego
    //calcula su BMI utilizando la fórmula: BMI = peso / (altura * altura). Muestra el BMI
    //resultante.


    public static float calcularIndiceMasaCorporal(){

        Scanner scanner = new Scanner(System.in);
        float peso, altura, bmi;

        System.out.println("Ingresar su peso y altura ");

        System.out.println("Peso: ");
        peso = scanner.nextFloat();

        System.out.println("Altura: ");
        altura=scanner.nextFloat();

        return bmi = peso / (altura * altura);

    }

    //6. Conversión de horas, minutos y segundos a segundos:
    //Pide al usuario que ingrese horas, minutos y segundos, luego calcula y muestra el total de segundos.

    public static float horasSegundos(){

        Scanner scanner = new Scanner(System.in);

        float horas, minutos, segundo;

        System.out.println("Ingrese la cantidad de horas: ");
        horas = scanner.nextFloat();

        horas = horas * 3600;

        System.out.println("Ingrese la cantidad de minutos: ");

        minutos = scanner.nextFloat();

        minutos = minutos * 60;

        System.out.println("Ingrese la cantidad de segundos: ");
        segundo = scanner.nextFloat();

        return segundo = segundo + horas + minutos;

    }

    //7. Días, horas y minutos a minutos:
    //Solicita al usuario que ingrese días, horas y minutos, luego calcula y muestra el total de minutos.

    public static float diasAminutos(){

        Scanner scanner = new Scanner(System.in);

        float dias, horas, minutos;

        System.out.println("Ingrese la cantidad de dias: ");
        dias = scanner.nextFloat();

        dias = dias * 1440;

        System.out.println("Ingrese la cantidad de horas: ");

        horas = scanner.nextFloat();

        horas = horas * 60;

        System.out.println("Ingrese la cantidad de minutos: ");
        minutos = scanner.nextFloat();

        return minutos =  dias + horas + minutos;

    }

    //8. Conversión de millas a kilómetros:Pide al usuario que ingrese una distancia en millas y muestra la distancia equivalente
    // en kilómetros. Utiliza la relación de conversión: 1 milla = 1.60934 kilómetros.

    public static float millas(){

        Scanner scanner = new Scanner(System.in);

        float millas, kilometros;

        System.out.println("Ingresar la cantidad de millas que desea convertir a kilometros: ");
        millas=scanner.nextFloat();

        kilometros = (millas * 1.60934f); //Si se multiplica por un float tiene que ser con punto y tener una F al final


        return kilometros;
    }

    //9. Calculadora de interés simple:
    //Solicita al usuario que ingrese el monto principal, la tasa de interés anual y el período en años.
    // Luego calcula y muestra el interés simple utilizando la fórmula: Interés = Principal * Tasa * Tiempo.

    public static float interesSimple(){

        Scanner scanner = new Scanner(System.in);

        float montoPrincipal, interesAnual = 0, periodoAno, interes;

        System.out.println("Ingrese su monto principal: ");
        montoPrincipal=scanner.nextFloat();

        System.out.println("Ingrese su tasa de interes anual: ");
        periodoAno=scanner.nextFloat();

        System.out.println("Ingrese su periodo en años: ");
        periodoAno=scanner.nextFloat();

        return interes = montoPrincipal * interesAnual * periodoAno;

    }

    //10. Conversión de moneda:Pide al usuario que ingrese una cantidad en dólares y muestra la cantidad equivalente en euros.
    // Utiliza una tasa de conversión fija y muestra el resultado.

    public static float moneda(){
        Scanner scanner = new Scanner(System.in);

        float dolar, euro;

        System.out.println("Ingresa la cantidad de dolares: ");
        dolar = scanner.nextFloat();

        return euro = dolar / 1.08644873f;

    }

}
