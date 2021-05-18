package repositorio.github.ExerciciosJava;

import java.util.Scanner;

public class Exercicio04 {
    public static void main(String[] args) {
        
        //4-	Leia o nome um número do usuário um número N e escreva o nome dele na tela N vezes
        
        Scanner leitor = new Scanner(System.in);
        
        String nome;
        int n;
    
        System.out.println("Digite seu nome: ");
        nome = leitor.next();
        
        System.out.println("Digite a quantidade de vezes: ");
        n = leitor.nextInt();
        
        for(int i=1;i<=n;i++){
            System.out.println("Seu nome é: "+nome+"   "+i);
        }

    }
}
