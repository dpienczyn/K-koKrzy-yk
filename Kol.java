package rozmowa;

import java.util.Scanner;

public class Kol {
	
	public static void main(String[] args) {
		int gracz = 0;
		char tab[][] ={	{' ', ' ', ' '},
						{' ', ' ', ' '},
						{' ', ' ', ' '}};;
		char z;
		Scanner s = new Scanner(System.in);
		String k;
		for(int i=0; i<9; i++) {
		k = s.nextLine();
		if(gracz%2==0) {
			if(k.charAt(0)=='1'){
				if(tab[0][0]==' ') {
				tab[0][0]='X';
				System.out.println(tab[0][0]);
				}else {
					System.out.println("Wybierz inne pole");
				gracz--;
				}
			}
			if(k.charAt(0)=='2') {
				if(tab[0][1]==' ') {
				tab[0][1]='X';
				System.out.println(tab[0][1]);
				}else {
					System.out.println("Wybierz inne pole");
				gracz--;
				}
			}
			if(k.charAt(0)=='3') {
				if(tab[0][2]==' ') {
				tab[0][2]='X';
				System.out.println(tab[0][2]);
				}else {
					System.out.println("Wybierz inne pole");
				gracz--;
				}
			}
			if(k.charAt(0)=='4') {
				if(tab[1][0]==' ') {
				tab[1][0]='X';
				System.out.println(tab[1][0]);
				}else {
					System.out.println("Wybierz inne pole");
				gracz--;
				}
			}
			if(k.charAt(0)=='5') {
				if(tab[1][1]==' ') {
				tab[1][1]='X';
				System.out.println(tab[1][1]);
				}else {
					System.out.println("Wybierz inne pole");
				gracz--;
				}
			}
			if(k.charAt(0)=='6') {
				if(tab[1][2]==' ') {
				tab[1][2]='X';
				System.out.println(tab[1][2]);
				}else {
					System.out.println("Wybierz inne pole");
				gracz--;
				}
			}
			if(k.charAt(0)=='7') {
				if(tab[2][0]==' ') {
				tab[2][0]='X';
				System.out.println(tab[2][0]);
				}else {
					System.out.println("Wybierz inne pole");
				gracz--;
				}
			}
			if(k.charAt(0)=='8') {
				if(tab[2][1]==' ') {
				tab[2][1]='X';
				System.out.println(tab[2][1]);
				}else {
					System.out.println("Wybierz inne pole");
				gracz--;
				}
			}
			if(k.charAt(0)=='9') {
				if(tab[2][2]==' ') {
				tab[2][2]='X';
				System.out.println(tab[2][2]);
				}else {
					System.out.println("Wybierz inne pole");
				gracz--;
				}
			}
			gracz++;
		}else if(gracz%2!=0) {
			if(k.charAt(0)=='1') {
				if(tab[0][0]==' ') {
				tab[0][0]='O';
				System.out.println(tab[0][0]);
				}
				else {
					System.out.println("Wybierz inne pole");
				gracz--;
				}
			}
			if(k.charAt(0)=='2') {
				if(tab[0][1]==' ') {
				tab[0][1]='O';
				System.out.println(tab[0][1]);
				}
				else {
					System.out.println("Wybierz inne pole");
				gracz--;
				}
			}
			if(k.charAt(0)=='3') {
				if(tab[0][2]==' ') {
				tab[0][2]='O';
				System.out.println(tab[0][2]);
				}else {
					System.out.println("Wybierz inne pole");
				gracz--;
				}
						
			}
			if(k.charAt(0)=='4') {
				if(tab[1][0]==' ') {
				tab[1][0]='O';
				System.out.println(tab[1][0]);
				}else {
					System.out.println("Wybierz inne pole");
				gracz--;
				}
				
			}
			if(k.charAt(0)=='5') {
				if(tab[1][1]==' ') {
				tab[1][1]='O';
				System.out.println(tab[1][1]);
				}else {
					System.out.println("Wybierz inne pole");
				gracz--;
				}
					
			}
			if(k.charAt(0)=='6') {
				if(tab[1][2]==' ') {
				tab[1][2]='O';
				System.out.println(tab[1][2]);
				}else {
					System.out.println("Wybierz inne pole");
				gracz--;
				}
				
			}
			if(k.charAt(0)=='7') {
				if(tab[2][0]==' ') {
				tab[2][0]='O';
				System.out.println(tab[2][0]);
				}else {
					System.out.println("Wybierz inne pole");
				gracz--;
				}
				
			}
			if(k.charAt(0)=='8') {
				if(tab[2][1]==' ') {
				tab[2][1]='O';
				System.out.println(tab[2][1]);
				}else {
					System.out.println("Wybierz inne pole");
				gracz--;
				}
				
			}
			if(k.charAt(0)=='9') {
				if(tab[2][2]==' ') {
				tab[2][2]='O';
				System.out.println(tab[2][2]);
				}else {
					System.out.println("Wybierz inne pole");
				gracz--;
				}
			}
			gracz++;
		}
		if(tab[0][0]=='X'&&tab[0][1]=='X'&&tab[0][2]=='X') {
			System.out.println("Wygra³ krzy¿yk");
		}else if(tab[0][0]=='O'&&tab[0][1]=='O'&&tab[0][2]=='O') {
			System.out.println("Wygra³o kó³ko");
		}
		else if(tab[0][0]=='X'&&tab[1][0]=='X'&&tab[2][0]=='X') {
			System.out.println("Wygra³ krzy¿yk");
		}
		else if(tab[0][0]=='O'&&tab[1][0]=='O'&&tab[2][0]=='O') {
			System.out.println("Wygra³o kó³ko");
		}
		else if(tab[1][0]=='X'&&tab[1][1]=='X'&&tab[1][2]=='X') {
			System.out.println("Wygra³ krzy¿yk");
		}
		else if(tab[1][0]=='O'&&tab[1][1]=='O'&&tab[1][2]=='O') {
			System.out.println("Wygra³o kó³ko");
		}
		else if(tab[2][0]=='X'&&tab[2][1]=='X'&&tab[2][2]=='X') {
			System.out.println("Wygra³ krzy¿yk");
		}
		else if(tab[2][0]=='O'&&tab[2][1]=='O'&&tab[2][2]=='O') {
			System.out.println("Wygra³o kó³ko");
		}
		else if(tab[0][1]=='X'&&tab[1][1]=='X'&&tab[2][1]=='X') {
			System.out.println("Wygra³ krzy¿yk");
		}
		else if(tab[0][1]=='O'&&tab[1][1]=='O'&&tab[2][1]=='O') {
			System.out.println("Wygra³o kó³ko");
		}
		else if(tab[0][2]=='X'&&tab[1][2]=='X'&&tab[2][2]=='X') {
			System.out.println("Wygra³ krzy¿yk");
		}
		else if(tab[0][2]=='O'&&tab[1][2]=='O'&&tab[2][2]=='O') {
			System.out.println("Wygra³o kó³ko");
		}
		else if(tab[0][0]=='X'&&tab[1][1]=='X'&&tab[2][2]=='X') {
			System.out.println("Wygra³ krzy¿yk");
		}
		else if(tab[0][0]=='O'&&tab[1][1]=='O'&&tab[2][2]=='O') {
			System.out.println("Wygra³o kó³ko");
		}
		else if(tab[0][2]=='X'&&tab[1][1]=='X'&&tab[2][0]=='X') {
			System.out.println("Wygra³ krzy¿yk");
		}
		else if(tab[0][2]=='O'&&tab[1][1]=='O'&&tab[2][0]=='O') {
			System.out.println("Wygra³o kó³ko");
		}
		}
	}
}
