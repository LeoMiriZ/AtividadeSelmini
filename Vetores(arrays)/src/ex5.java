import java.util.Scanner;

public class ex5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner teclado = new Scanner(System.in);

		double[] x = new double[7];
		String[] dias = { "Domingo", "Segunda-feira", "Ter�a-feira", "Quarta-feira", "Quinta-feira", "Sexta-feira",
				"S�bado" };

		for (int i = 0; i < x.length; i++) {

			System.out.println("Insira a temperatura m�xima di�ria do(a) " + dias[i] + " ->");
			x[i] = teclado.nextDouble();

		}

		System.out.println();

		for (int i = 0; i < x.length; i++) {

			System.out.print(dias[i] + "  ");

			for (int j = 1; j <= x[i]; j++) {

				System.out.print("*");
			}

			System.out.println();

		}

	}

}
