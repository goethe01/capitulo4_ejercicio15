package com.mycompany.cap4_ejeresuelto15;
import java.util.Scanner;
public class Cap4_ejeResuelto15 {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int PESOA, PESOB, PESOC, PESOD;
        
        System.out.print("DAME EL PESO DE LA ESFERA A: ");
        PESOA = entrada.nextInt();
        System.out.print("DAME EL PESO DE LA ESFERA B: ");
        PESOB = entrada.nextInt();
        System.out.print("DAME EL PESO DE LA ESFERA C: ");
        PESOC = entrada.nextInt();
        System.out.print("DAME EL PESO DE LA ESFERA D: ");
        PESOD = entrada.nextInt();
        
        if(PESOA == PESOB && PESOA == PESOC){
            System.out.println("LA ESFERA D ES LA DIFERENTE");
        if(PESOD > PESOA){
            System.out.println("Y ES DE MAYOR PESO");
        }else{
            System.out.println("Y ES DE MENOR PESO");
        }}else if(PESOA == PESOB && PESOA == PESOD){
            System.out.println("LA ESFERA C ES LA DIFERENTE");
        if(PESOC > PESOA){
            System.out.println("Y ES DE MAYOR PESO");
        }else{
            System.out.println("Y ES DE MENOR PESO");
        }}else if(PESOA == PESOC && PESOA == PESOD){
            System.out.println("LA ESFERA B ES LA DIFERENTE");
        if(PESOB > PESOD){
            System.out.println("Y ES DE MAYOR PESO");
        }else{
            System.out.println("Y ES DE MENOR PESO");
        }}else{
            System.out.println("LA ESFERA A ES LA DIFERENTE");
            if(PESOA > PESOB){
                System.out.println("Y ES DE MAYOR PESO");
            }else{
                System.out.println("Y ES DE MENOR PESO");
            }
        }
        
    }
}
