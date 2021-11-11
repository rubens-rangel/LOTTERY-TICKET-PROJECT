package Application;

import java.util.List;
import java.util.Random;
import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Application {
		public static void main(String[] args) {			
			
			Scanner sc = new Scanner(System.in);			
			ArrayList<Integer> lista = new ArrayList<Integer>();
			ArrayList<Integer> listaRandom = new ArrayList<Integer>();		
			Random gerador = new Random();
			int NumerosAcertados = 0;
			
			System.out.println("--------Bem vindo a Megaloto---------");

			System.out.println("Digite quantos numeros deseja jogar, (Min: 6 Max: 14):");
			int numerosjogados = sc.nextInt();
			int[] aposta = new int[numerosjogados];
			
			if (numerosjogados > 14 || numerosjogados < 6) {
			System.out.println("Quantidade invâlida! Tente novamente!");		
			System.exit(numerosjogados);
			} 
		  		
			for (int i = 0; i < numerosjogados ; i++) {
			System.out.println("Digite o " + (i+1) + "° numero jogado:");
			aposta[i] = sc.nextInt();	
			lista.add(aposta[i]);
			}
			
				System.out.println(lista);
			
				
			for (int i = 0; i < numerosjogados ; i++) {	
			listaRandom.add(gerador.nextInt(60));
			}
			System.out.println(listaRandom);
			
			
			
			for (int i = 0; i < numerosjogados ; i++) {
				if (listaRandom.contains(aposta[i])) {
					NumerosAcertados++;
				}
				}
			System.out.println("Você Acertou " + NumerosAcertados + " Numeros");
			if (NumerosAcertados == 0) {System.out.println("Não foi dessa vez, Tente novamente!");}
			if (NumerosAcertados > 2) {System.out.println("Parabéns");}
			if (NumerosAcertados >= 5) {System.out.println("Nossa, jogue na loteria real");}
	
			
			sc.close();
	}
}

