package tarea1;
import java.util.Scanner;

public class Tarea1 {

    public static void main(String[] args) {
        int añoActual=2021;
        int resultado;
        Scanner entrada= new Scanner (System.in);
        System.out.println( "Introduce el año que quieras");
        int año= entrada.nextInt();
        if(año<añoActual){
            resultado=añoActual-año;
            System.out.println("Han pasado "+resultado+ " años");
        }else{
            resultado=año-añoActual;
            System.out.println("Faltan "+resultado+ " años");
        
        }
    }
    
}
