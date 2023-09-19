package ejercici;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Main {

	static Scanner sc = new Scanner(System.in);
	static Integer[] meses31 = { 1, 3, 5, 7, 8, 10, 12 };
	static ArrayList<Integer> listm30 = new ArrayList<Integer>(Arrays.asList(meses31));
	static Integer[] meses30 = { 4, 6, 9, 11 };
	static ArrayList<Integer> listm31 = new ArrayList<Integer>(Arrays.asList(meses30));
	//static Integer[] mes02 = { 28, 29 };

	public static void main(String[] args) {
		System.out.println("Entrar una fecha xx/xx/xxxx");
		String entrada = sc.nextLine();
		String[] los3 = entrada.split("/");
		int dia = Integer.parseInt(los3[0]);
		int mes = Integer.parseInt(los3[1]);
		int ani = Integer.parseInt(los3[2]);

		
		boolean mesControl = (mes >= 1 && mes <= 12);

		if (mesControl && (mes != 2)) {
			
			if (listm30.contains(mes)) {
				if (dia <= 30 && dia >= 1) {
					System.out.println("correcta");
				} else {
					System.out.println("error");
				}

			} else if (listm31.contains(mes)) {
				if (dia <= 31 && dia >= 1) {
					System.out.println("correcta");
				} else {
					System.out.println("error");
				}

			}

		} else if ((mes == 2) {
			if (((ani % 4 == 0) && (ani % 100 != 0)) || (ani % 400 == 0)) {
				if (dia <= 29 && dia >= 1) {
					System.out.println("correcta");
				} else {
					System.out.println("error");
				}
			} else {
				if (dia <= 28 && dia >= 1) {
					System.out.println("correcta");
				} else {
					System.out.println("error");
				}
			}
		}

	}

}
