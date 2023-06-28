package sintaxe_variaveis_e_fluxo;

public class TestaCaracteres {
	
	public static void main(String[] args) {
		
		char letra = 'a';
		System.out.println(letra);//a
		
		char valor = 66;
		System.out.println(valor);//b
		
		valor = (char) (valor + 1);
		System.out.println(valor);//c
		
		String palavra = "alura cursos online de tecnologia";
		System.out.println(palavra);//alura cursos online de tecnologia
		
		palavra += " " + 2020;
		System.out.println(palavra);
	}
}
