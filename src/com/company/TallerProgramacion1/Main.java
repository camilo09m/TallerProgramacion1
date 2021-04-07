package com.company.TallerProgramacion1;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
            leerOpcion();
            }
    public static void leerOpcion(){
        Scanner teclado = new Scanner(System.in);
        menu();
        String opcion = teclado.next();
        if(validacionMenu(opcion) == true) {
            if (opcion.equals("b")) {

            }
            if (opcion.equals("d")) {

            }
            if (opcion.equals("s")) {

            }
        }
        else {
            System.out.println("Opcion ingresa no valida");
            leerOpcion();
        }
    }
    public static void menu(){
        System.out.println("************************************************");
        System.out.println("* [b]Mostrar representacion binaria (de 8 bits) * \n* [d]Mostrar representacion decimal (Base 10)   *" +
                         "\n* [s]Salir                                       *");
        System.out.println("************************************************");

    }
    public static boolean validacionMenu(String opc){
        if(opc.contains("b") ||opc.contains("d") || opc.contains("s")){
            return true;}
    return false;
    }
    public static int leerNumero(){
        Scanner teclado = new Scanner(System.in);
        System.out.println("Ingrese un numero");
        int valor = teclado.nextInt();
        return valor;
    }
}
