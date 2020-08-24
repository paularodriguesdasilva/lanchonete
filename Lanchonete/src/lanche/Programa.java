package lanche;

import java.util.Scanner;

public class Programa {
	static Scanner teclado = new Scanner(System.in);

	public static void main(String[] args) {
		Lanche lanche;
		int opcao;

		System.out.println("Bem vindo(a) ao nosso delivery \n");
		System.out.println("Selecione o seu lanche: ");
		System.out.println("[1] Sanduíches \n[2] Massas\n[3] Bolos");
		opcao = teclado.nextInt();

		while (opcao != 1 && opcao != 2 && opcao != 3) {
			System.out.println("Opção inválida. Tente novamente\n\n");
			System.out.println("Selecione o seu lanche: ");
			System.out.println("[1] Sanduíches \n[2] Massas\n[3] Bolos");
			opcao = teclado.nextInt();
		}

		switch (opcao) {
		case 1:
			lanche = new Sanduiche();
			menuSanduiche((Sanduiche) lanche);
			break;
		case 2:
			lanche = new Massa();
			menuMassa((Massa) lanche);
			break;
		case 3:
			lanche = new Bolo();
			menuBolo((Bolo) lanche);
			break;
		}

	}

	public static void menuSanduiche(Sanduiche lanche) {
		String[] ingredientes = new String[10];
		String ingrediente = "";
		int i = 0;
		int distancia;

		System.out.println("\nVocê selecionou sanduíche\n");
		System.out.println("Escolha entre os seguintes ingredientes (digite 0 para finalizar a escolha)");
		System.out.println("- Pão\n- Queijo\n- Presunto\n- Hamburguer\n- Maionese\n- Ketchup");

		while (i < 10 && !ingrediente.equals("0")) {
			ingrediente = teclado.nextLine();
			if (!ingrediente.equals("0")) {
				ingredientes[i] = ingrediente;
				i++;

			}
		}

		lanche.setPreco(8.00);
		lanche.setIngredientes(ingredientes);
		System.out.println("Informe sua distância (em Km): ");
		distancia = teclado.nextInt();

		System.out.println("Seu sanduíche contendo:" + lanche.getIngredientes() + "\n");
		System.out.println(
				"Levará aproximadamente " + lanche.calculaTempo(distancia) + " minutos para chegar na sua casa!");
		System.out.println("O valor do seu lanche é: " + lanche.getPreco() + " reais\n");
		System.out.println("Obrigado pela prefêrencia!!");

	}

	public static void menuMassa(Massa lanche) {
		int distancia;
		int escolha;

		System.out.println("Você selecionou massa\n");
		System.out.println("Selecione a massa desejada: ");
		System.out.println("[1] Macarrão\n[2] Pizza\n[3] Lasanha");
		escolha = teclado.nextInt();

		switch (escolha) {
		case 1:
			System.out.println("Você escolheu macarrão\n");
			Macarrao macarrao = new Macarrao();
			macarrao.setMolho("molho");
			macarrao.setMacarrao("macarrao");
			macarrao.setPreco(20.00);

			System.out.println("Informe sua distância (em Km): ");
			distancia = teclado.nextInt();

			System.out.println("Seu macarrão levará aproximandamente " + macarrao.calculaTempo(distancia)
					+ " minutos para chegar na sua casa!");
			System.out.println("O valor do seu pedido é: " + macarrao.getPreco() + " reais\n");
			System.out.println("Obrigado pela preferência!!");

			break;
		case 2:
			System.out.println("Você escolheu pizza\n");
			Pizza pizza = new Pizza();
			pizza.setMolho("molho");
			pizza.setPizza("pizza");
			pizza.setPreco(30.00);

			System.out.println("Informe sua distância (em Km): ");
			distancia = teclado.nextInt();

			System.out.println("Sua pizza levará aproximandamente " + pizza.calculaTempo(distancia)
					+ " minutos para chegar na sua casa!");
			System.out.println("O valor do seu pedido é: " + pizza.getPreco() + " reais\n");
			System.out.println("Obrigado pela preferência!!");
			break;
		case 3:
			System.out.println("Você escolheu lasanha\n");
			Lasanha lasanha = new Lasanha();
			lasanha.setMolho("molho");
			lasanha.setLasanha("lasanha");
			lasanha.setPreco(50.00);

			System.out.println("Informe sua distância (em Km): ");
			distancia = teclado.nextInt();

			System.out.println("Sua lasanha levará aproximandamente " + lasanha.calculaTempo(distancia)
					+ " minutos para chegar na sua casa!");
			System.out.println("O valor do seu pedido é: " + lasanha.getPreco() + " reais");
			System.out.println("Obrigado pela preferência!!");
			break;

		}

	}

	public static void menuBolo(Bolo lanche) {
		String[] recheios = new String[4];
		String recheio = "";
		int i = 0;
		int distancia;

		System.out.println("Você selecionou bolo\n");
		System.out.println("Escolha o que você quer em seu bolo (digite 0 para finalizar a escolha)");
		System.out.println("- Massa\n- Recheio\n- Cobertura");

		while (i < 4 && !recheio.equals("0")) {
			recheio = teclado.nextLine();
			if (!recheio.equals("0")) {
				recheios[i] = recheio;
				i++;

			}
		}

		lanche.setPreco(10.00);
		lanche.setIngredientes(recheios);
		System.out.println("Informe sua distância (em Km): ");
		distancia = teclado.nextInt();

		System.out.println("Seu bolo contendo: " + lanche.getIngredientes() + "\n");
		System.out.println(
				"Levará aproximadamente " + lanche.calculaTempo(distancia) + " minutos para chegar na sua casa!");
		System.out.println("O valor do seu lanche é: " + lanche.getPreco() + " reais\n");
		System.out.println("Obrigado pela prefêrencia!!");

	}

}
