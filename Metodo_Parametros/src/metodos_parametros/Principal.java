package metodos_parametros;
import java.util.Scanner;
public class Principal {

	public static void main(String[] args) {
		String nomeAluno;
		int idadeAluno;
		Scanner entrada = new Scanner (System.in);
		MandaMensagem oi = new MandaMensagem();
		
		System.out.println("Entre como seu nome: ");
		nomeAluno = entrada.nextLine();
		
		System.out.println("Entre como sua idade: ");
		idadeAluno = entrada.nextInt();
		oi.mandaBoasVindas(nomeAluno, idadeAluno);
		
		System.out.println(" Vai da certo!!!");
		entrada.close();

	}

}
