package sintaxe_variaveis_e_fluxo;

public class TestaIR {
	public static void main(String[] args) {

		double salario = 1900.0;

		if (salario >= 1900.0 && salario <= 2800.0) {
			System.out.println("o IR é de 7.5% e pode deduzir na declaração o valor de R$ 142");
		} else {
			if (salario > 2800.0 && salario <= 3751) {
				System.out.println("o IR é de 15% e pode deduzir R$ 350");
			} else {
				if (salario > 3751 && salario <= 4664.00) {
					System.out.println("o IR é de 22.5% e pode deduzir R$ 636");
				}
			}
		}
	}
}
