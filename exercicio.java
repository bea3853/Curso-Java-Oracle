/*package introducao.java;*/

import java.util.Scanner;

public class GalToList {

	public static void main(String[] args) {

	     // 2. Cria o objeto Scanner
        Scanner scanner = new Scanner(System.in);

        // 3. Lê a entrada e armazena em variáveis
        System.out.println("Qual o seu nome?");
        String nome = scanner.nextLine();

        System.out.println("Qual a sua idade?");
        int idade = scanner.nextInt();

        System.out.println("Qual a sua altura? (Ex: 1,75)");
        double altura = scanner.nextDouble();
       
        System.out.println("Nome: " + nome);
        System.out.println("Idade: " + idade + " anos");
        System.out.println("Altura: " + altura + " m");

        // 4. Fechar o objeto Scanner
        scanner.close();

	}

}
