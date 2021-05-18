package repositorio.github.ExerciciosJava;

import java.util.Scanner;

public class Exercicio11 {
    public static void main(String[] args) {
        //11-	Escreva um algoritmo que leia 20 números do usuário e exiba quantos números são maiores que 8.
        
        Scanner leitor = new Scanner(System.in);
        int n, aux = 0;
        for(int i=1; i<=3;i++){
            System.out.println("Digite um número: ");
            n = leitor.nextInt();
            
            if(n>8){
                aux = aux + 1;
            }
        }
        System.out.println("A quantidade de números que sao maiores que oito é: "+aux);

    }
}
