package Unidad2;

public class Eje_Comparativo {
    public static void main(String[] args) {

        int mayor = encontrarMayor(5,10,15);
        System.out.println("El numero mayor es: " + mayor);
    }
    public static int encontrarMayor(int a, int b, int c) {
        return Math.max(a, Math.max(b, c));
    }

    }
        
 
