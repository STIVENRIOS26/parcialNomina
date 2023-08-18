package org.example;

import java.util.Scanner;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        Scanner teclado= new Scanner(System.in);

        Integer opcion;
        Integer numeroHoras;
        Double precioHora;
        String nombreEmpleado;
        Double nominaEmpleado;

        do{
            System.out.println("NOMINA EMPLEADOS SURA");
            System.out.println("Elige una opcion del menu.");
            System.out.println("1. Para calcular el salario \uD83E\uDDEE");
            System.out.println("2. Para pagar la nomina. \uD83D\uDCB8\uD83D\uDCB8");
            System.out.println("3. Para salir. 🚪");

            System.out.println("Digite una opcion✍: ");
            opcion=teclado.nextInt();
            teclado.nextLine();

            switch (opcion){
                case 1:
                    System.out.println("Digite por favor el numero de horas trabajadas por el empleado⌛: ");
                    numeroHoras= teclado.nextInt();
                    System.out.println("Ingrese el valor por hora trabajadapesos\uD83D\uDCB2: $");
                    precioHora= teclado.nextDouble();

                    System.out.println("El salario base es por un valor de: $"+numeroHoras*precioHora);
                    break;

                case 2:
                    System.out.println("Digite el nombre del empleado: ");
                    nombreEmpleado= teclado.nextLine();
                    System.out.println("Digite el salario a pagar: ");
                    nominaEmpleado= teclado.nextDouble();
                    System.out.println("Se realizo el pago por un valor de $"+nominaEmpleado*0.92+" a "+nombreEmpleado+"🤩🤩");
                    break;
                case 3:
                    System.out.println("Hasta luego🖐🖐");
                    break;
                default:
                    System.out.println("Opción invalida❌");
                    break;
            }

        }while (opcion!=3);

    }
}