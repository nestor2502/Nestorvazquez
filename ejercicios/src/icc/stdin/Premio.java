package icc.stdin;
/**
 *@author(Nestor vazquez)
 *@date(23/09/18)
 *
 *
 */
import java.util.Scanner;
public class Premio{
    public static void main (String [] args){
	Scanner teclado = new Scanner(System.in);
	double n, s,t;
	System.out.println("Hola ingresa un numero:");
	n= teclado.nextDouble();
	if (n%2==0){
	    s= Math.pow(n,2);
	    System.out.println("EL numero que ingrtesaste es par por lo tanto tu premio corresponde a: "+s);
	    }
	else{
	    t= Math.pow(2,n);
	    System.out.println("El numero que ingresaste es impar lor lo tanto tu premio corresponde a: "+t);
	}
    }

}
