package com.company.TallerProgramacion1;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
            String opcion=leerOpcion();
            int valor;
        if(validacionMenu(opcion) == true) {
            if (opcion.equals("b")) {
                //valor = leerNumeroBinario();

            }
            if (opcion.equals("d")) {
                valor = leerNumeroDecimal();
                System.out.println(valor);
            }
            if (opcion.equals("s")) {

            }
        }
        else {
            System.out.println("Opcion ingresa no valida");
            leerOpcion();
        }
            }
    public static String leerOpcion(){
        Scanner teclado = new Scanner(System.in);
        menu();
        String opcion = teclado.next();

    return opcion;
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
    public static int leerNumeroDecimal(){
        Scanner teclado = new Scanner(System.in);
        int numDec =0;
        try {
        System.out.println("Ingrese un numero");
         numDec = teclado.nextInt();
        if (validarDecimal(numDec)== false){
            leerNumeroDecimal();
        }}catch (Exception e){
            teclado.next();
            leerNumeroDecimal();
        }
        return numDec;
    }
   /* public static int[] leerNumeroBinario(){
        Scanner teclado = new Scanner(System.in);
        System.out.println("Ingrese un numero");

    }
    public static boolean validarBinario(int[] numBin ){

    }*/
    public static boolean validarDecimal(int numdec){
        if (numdec >= 0 && numdec <256){
            return true;
        }
        return false;
    }
}
