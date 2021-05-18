package repositorio.github.ExerciciosJava;

import java.util.Scanner;

public class Exercicio13 {
    public static void main(String[] args) {
        //13-	Faça um algoritmo que leia 20 números e, ao final, escreva quantos estão entre 0 e 100
        
        Scanner leitor = new Scanner(System.in);
        int n, aux = 0;
        for(int i=1; i<=3;i++){
            System.out.println("Digite um número: ");
            n = leitor.nextInt();
            
            if(n>=0 && n<=100){
                aux = aux + 1;
            }
        }
        System.out.println("A quantidade de números que estao entre 1 e 100 é: "+aux);

    }
}
