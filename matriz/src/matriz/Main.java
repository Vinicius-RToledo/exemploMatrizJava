package matriz;

public class Main {

		public static void main(String[] args) {

			String dadosVeiculo[][] = { { "Pálio", "SPM-9374" }, { "Astra", "GFT-3000" }, { "Gol", "JTF-3390" } };
			// usando for each

			for (String[] contador : dadosVeiculo) {
				for (String x : contador) {
					System.out.print(x + " ");
				}

				System.out.println();
			}

			System.out.println("");

			// usando for
			for (int i = 0; i < dadosVeiculo.length; i++) {
				for (int c = 0; c < dadosVeiculo[i].length; c++) {
					System.out.print(dadosVeiculo[i][c] + " ");
				}
				System.out.println();

			}
		}
	}
