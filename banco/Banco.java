package banco;

import java.util.Scanner;

public class Banco {

	public static void main(String[] args) {
		ContaBanco cb = new ContaBanco();
		Scanner sc = new Scanner(System.in);
		boolean sair = false;
		while(sair==false) {
			System.out.println("O que deseja? (1)Abrir Conta, (2)Encerrar, (3)debitar, (4)creditar, (5)consultar, (6)sair");
			int opc = sc.nextInt();
			if (opc ==1) {
				cb.abrirConta();
			}
			else if(opc==2) {
				cb.encerrarConta();
			}
			else if(opc==3) {
				cb.debitar();
			} 
			else if(opc==4) {
				cb.creditar();
			} 
			else if(opc==5) {
				cb.consultar();
			} 
			else if(opc==6) {
				System.out.println("Saindo...");
				sair= true;
			} 
			else {
				System.out.println("Essa opção não existe");
			}
		}
	}

}
