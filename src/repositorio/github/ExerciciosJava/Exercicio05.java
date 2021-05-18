package repositorio.github.ExerciciosJava;

import java.util.Scanner;

public class Exercicio05 {
    public static void main(String[] args) {
        
        //5-	Escreva um algoritmo que leia 10 números do usuário e calcule a soma desses números
        
       Scanner leitor = new Scanner(System.in);
       int n, soma = 0;

        for(int i=1;i<=3;i++){
            System.out.println("Digite um número: ");
            n = leitor.nextInt();
            
            soma +=  n;
        }
        System.out.println("A soma dos números é: "+soma);

    }
}
