package Application;

import java.util.List;
import java.util.Random;
import java.util.ArrayList;
import java.util.Scanner;

public class Application {
		public static void main(String[] args) {			
			
			Scanner sc = new Scanner(System.in);			
			ArrayList<Integer> lista = new ArrayList<Integer>();
			ArrayList<Integer> listaRandom = new ArrayList<Integer>();		
			Random gerador = new Random();
			
			int i;
			
			System.out.println("Digite quantos numeros deseja jogar:");
			int numerosjogados = sc.nextInt();
			int[] aposta = new int[numerosjogados];
		
			for (i = 0; i < numerosjogados ; i++) {
			System.out.println("Digite o " + (i+1) + "° numero jogado:");
			aposta[i] = sc.nextInt();	
			lista.add(aposta[i]);
		}
			
				System.out.println(lista);
			
				
			for (i = 0; i < numerosjogados ; i++) {	
			listaRandom.add(gerador.nextInt(60));
			}
			System.out.println(listaRandom);
			
			
			
			sc.close();
	}
}

