
import java.util.Scanner;
import java.util.Stack;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
     Scanner sc = new Scanner(System.in);
        System.out.print("Nome do aluno:");
        String nome = sc.nextLine();
        System.out.print("Endereco residencial:");
        String endereco = sc.nextLine();
        System.out.print("Telefone de contato:");
        String telefone = sc.nextLine();
        System.out.print("Endereco de email:");
        String email = sc.nextLine();
        System.out.print("Matricula do aluno:");
        int matricula = sc.nextInt();
      Aluno aluno = new Aluno(nome,endereco,telefone,email,matricula);
      Principal principal = new Principal(aluno);
    }
}