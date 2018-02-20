/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package calculosconhoras;
import java.util.Scanner;
/**
 *
 * @author JuanJ
 */
public class CalculosConHoras {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int horasIng;
        int horas;
        int dias;
        int semanas;
        int temporal;
        int hrDia = 24;
        int hrSemana = (hrDia*7);
        
        Scanner sc = new Scanner(System.in);
        System.out.print("Introduzca el número de horas (entero): ");
	horasIng = sc.nextInt();
        
       temporal = horasIng%hrSemana;
       semanas = (horasIng-temporal)/hrSemana;
       horas = temporal;
       temporal = temporal%hrDia;
       dias = (horas-temporal)/hrDia;
       horas = temporal;
       System.out.println("Semanas: " + semanas);
       System.out.println("Días: " + dias);
       System.out.println("Horas: " + horas);
    }
    
}
