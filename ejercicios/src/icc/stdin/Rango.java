package icc.stdin;
/**
 *@author(Nestor vazquez)
 *@date(23/09/18)
 *
 *
 */
import java.util.Scanner;
public class Rango{
    public static void main (String [] args){

	double x, y;
	Scanner teclso = new Scanner(System.in);
	System.out.println("Hola este es un programa para aplicar una funcion al valor que tu ingreses");
	System.out.println("");
	System.out.println("Ingresa un valor:");
	x= teclado.nextDouble();
	if(x>2){
	    y = -(Math.pow(x,2))-3*x+2;
	    System.out.println("y= "+y);
	}    
	if(x>0 && x<=2){
	    y= 2*x-5;
		System.out.println("y= "+y);
		}
	else{
	    y= Math.pow(x,2)+2*x-1;
	    System.out.println("y= "+y);	
	}
	    


    }
}
