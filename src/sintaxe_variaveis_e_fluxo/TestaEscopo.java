package sintaxe_variaveis_e_fluxo;

public class TestaEscopo {
	public static void main(String[] args) {
		System.out.println("testando condicionais");
		
		int idade = 18;
		int quantidadePessoas = 1;
		
		boolean acompanhado = quantidadePessoas >= 2;
				
		if (quantidadePessoas >= 2) {
			acompanhado = true;
		} else {
			acompanhado = false;
		}
		
		System.out.println("Valor de acompanhado = " + acompanhado);
		
		if (idade >= 18 && acompanhado) {			
			System.out.println("seja bem vindo!");
		} else {
			System.out.println("infelizmente você não pode entrar");
		}
	}
}
