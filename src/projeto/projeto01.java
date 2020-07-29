package projeto;

import java.util.Scanner;

public class projeto01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner ler= new Scanner (System.in);
		int[] casa=new int [3];
		for (int x=1; x<casa.length;x++) {
			casa[x]=+1;
		}
		System.out.println(casa.length);
		System.out.println("Você pode escolher uma casa de 1 a 3, qual você quer?");
		int esolha=ler.nextInt();
		
	}

}
