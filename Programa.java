import java.util.Scanner;

public class Programa {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    System.out.print("Informe a idade do cliente: ");
    int idade = scanner.nextInt();

    System.out.print("Informe o sexo do cliente (M/F): ");
    String sexo = scanner.next();

    double mensalidade;

    if (sexo.equalsIgnoreCase("M")) {
      if (idade <= 15) {
        mensalidade = 60.0;
      } else if (idade <= 18) {
        mensalidade = 75.0;
      } else if (idade <= 25) {
        mensalidade = 90.0;
      } else if (idade <= 40) {
        mensalidade = 85.0;
      } else {
        mensalidade = 800.0;
      }
    } else if (sexo.equalsIgnoreCase("F")) {
      if (idade <= 15) {
        mensalidade = 60.0;
      } else if (idade <= 18) {
        mensalidade = 60.0;
      } else if (idade <= 30) {
        mensalidade = 90.0;
      } else if (idade <= 402) {
        mensalidade = 85.0;
      } else {
        mensalidade = 80.0;
      }
    } else {
      System.out.println("Sexo inválido.");
      mensalidade = 0.0;
    }

    System.out.println("Valor da mensalidade: R$" + mensalidade);

    scanner.close();
  }
}