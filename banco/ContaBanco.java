package banco;

import java.util.Scanner;

public class ContaBanco {
	private double saldo; 
	private String nomeA;
	private String numeroA;
	private String nomeB;
	private String numeroB;
	private int tipo;
	private boolean estadoConta = true;
	
	
	Scanner sc = new Scanner(System.in);
	
	public void consultar() {
		System.out.println("Saldo"+this.getSaldo());
		System.out.println("Nome Agencia"+this.getNomeA());
		System.out.println("Numero Agencia"+this.getNumeroA());
		System.out.println("Nome Banco"+this.getNomeB());
		System.out.println("Numero Banco"+this.getNumeroB());
		System.out.println("Tipo:"+this.getTipo());
		System.out.println("estado"+this.getEstadoConta());
		
	}

	public void abrirConta() {
		System.out.println("Por favor informe o nome da Agência: ");
		this.setNomeA(sc.next());
		System.out.println("Por favor informe o número da Agência: ");
		this.setNumeroA(sc.next());
		
		System.out.println("Por favor informe o nome do Banco: ");
		this.setNomeB(sc.next());
		System.out.println("Por favor informe o número do Banco: ");
		this.setNumeroB(sc.next());
		
		System.out.println("Por favor informe o tipo de conta que deseja abrir 1(Corrente) 2(Poupança) 3(Conjunta)");
		int n = sc.nextInt();
		if (n == 1) {
			this.setTipo(1);
			System.out.println("Conta Corrente criada com sucesso");
			estadoConta = true;
			this.setEstadoConta(estadoConta);
		}

		else if (n == 2) {
			this.setTipo(2);
			System.out.println("Conta Poupança criada com sucesso");
		} else if(n == 3){
			this.setTipo(3);
			System.out.println("Conta Conjuta criada com sucesso");
		}
		else {
			System.out.println("Essa opção não existe");
		}
	}

	public void encerrarConta() {
		if (estadoConta==true) {
			if (saldo>0) {
				System.out.println("Vamos Encerrar sua conta, você vai retirar: "+saldo);
				this.setSaldo(0);
				this.setEstadoConta(false);
				this.setTipo(4);
				System.out.println("Conta encerrada com sucesso!");
				
			} else {
				System.out.println("Seu Saldo está negativo, pague sua divida para encerrar a conta");
			}
		}
		else {
			System.out.println("Essa Conta já foi encerrada!");
		}
	}
	
	public void creditar() {
		if (estadoConta==true) {
			System.out.println("Digite o valor que deseja depositar: ");
			this.setSaldo(this.getSaldo()+sc.nextInt());
			System.out.println("Saldo depositado com sucesso!");
		}
		else {
			System.out.println("Essa Conta já foi encerrada!");
		}
	}
	
	public void debitar() {
		if (estadoConta==true) {
			System.out.println("Digite o valor que deseja retirar: ");
			int valor = sc.nextInt();
			if (this.getSaldo()>=valor) {
				System.out.println("Saldo retirado com sucesso!");
			} else {
				System.out.println("Você não tem Saldo Suficiente, deseja pegar emprestado do banco? \n 1(sim) 2(não)");
				int opc = sc.nextInt();
				if (opc ==1) {
					this.setSaldo(this.getSaldo()-valor);
					System.out.println("Emprestimo realizado com sucesso, veja seu saldo :"+this.getSaldo());
				} else if(opc==2) {
					System.out.println("Operação Cancelada ");
				}
				else {
					System.out.println("Essa opção não existe");
				}
			}
		}
		else {
			System.out.println("Essa Conta já foi encerrada!");
		}
	}
	
	
	
	
	
	
	
	public double getSaldo() {
		return saldo;
	}

	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}

	public String getNomeA() {
		return nomeA;
	}

	public void setNomeA(String nomeA) {
		this.nomeA = nomeA;
	}

	public String getNumeroA() {
		return numeroA;
	}

	public void setNumeroA(String numeroA) {
		this.numeroA = numeroA;
	}

	public String getNomeB() {
		return nomeB;
	}

	public void setNomeB(String nomeB) {
		this.nomeB = nomeB;
	}

	public String getNumeroB() {
		return numeroB;
	}

	public void setNumeroB(String numeroB) {
		this.numeroB = numeroB;
	}

	public int getTipo() {
		return tipo;
	}

	public void setTipo(int tipo) {
		this.tipo = tipo;
	}

	public boolean getEstadoConta() {
		return estadoConta;
	}

	public void setEstadoConta(boolean estadoConta) {
		this.estadoConta = estadoConta;
	}
	
	
	
	
	
	


	
	

}
