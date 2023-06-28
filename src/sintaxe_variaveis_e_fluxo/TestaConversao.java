package sintaxe_variaveis_e_fluxo;

public class TestaConversao {
	
	public static void main(String[] args) {
		double salario = 1270.50;
		int valor = (int) salario;
		System.out.println(valor);
		
		float pontoFlutuante = 3.14f;
		System.out.println(pontoFlutuante);
		long numeroGrande = 32432423523L;
		System.out.println(numeroGrande);
		short valorPequeno = 2131;
		System.out.println(valorPequeno);
		byte b = 123;
		System.out.println(b);
		
		double valor1 = 0.2;
		double valor2 = 0.1;
		double total = valor1 + valor2;
		
		System.out.println(total);
		//foco no double, int e talvez o long
		
	}
}
