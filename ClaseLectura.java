package Proyecto3EV;
import java.util.Scanner;
public class ClaseLectura {
private Scanner teclado;
	
	public ClaseLectura(){
		teclado = new Scanner(System.in);
	}
	
	public String LeerString(){ //M�todo para leer texto
		String valor="";
		boolean correcto;
	do{
		correcto=true;
		try{
			valor=teclado.nextLine();
		}
		catch(Exception o){
			correcto=false;
			teclado.next();
		}
	}
	while(!correcto);
	return valor;
	}
	
	public int LeerInt(){ //M�todo para comprobar numeros positivos
		int valor=0;
		boolean correcto;
	do{
		correcto=true;
		try{
			valor=teclado.nextInt();
		}
		catch(Exception o){
			correcto=false;
			teclado.next();
		}
		
	}
	while(!correcto);
	return valor;
	}
	
	public double LeerDouble(){ //M�todo para comprobar Double
		double valor=0;
		boolean correcto;
	do{
		correcto=true;
		try{
			valor=teclado.nextDouble();
		}
		catch(Exception o){
			correcto=false;
			teclado.next();
		}
		
	}
	while(!correcto);
	return valor;
	}
}
