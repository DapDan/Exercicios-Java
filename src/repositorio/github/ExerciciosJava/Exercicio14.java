package repositorio.github.ExerciciosJava;

import java.util.Scanner;

public class Exercicio14 {
    public static void main(String[] args) {
        //14-	Faça um algoritmo que leia 20 números e, ao final, escreva quantos estão entre 0 e 100, quantos estão entre 101 e 200 e quantos são maiores que 200
        
        Scanner leitor = new Scanner(System.in);

        int n, aux = 0, aux1 = 0, aux2= 0;
        for(int i=1; i<=3;i++){
            System.out.println("Digite um número: ");
            n = leitor.nextInt();
            
            if(n>=0 && n<=100){
                aux = aux + 1;
            }
            else if(n>=101 && n<=200){
                aux1 = aux1 + 1;
            }
            else if(n>200){
                aux2 = aux2 + 1;
            }
        }
        System.out.println("A quantidade de números que estao entre 1 e 100 é: "+aux+
                "\nA quantidade de números que estao entre 101 e 200 é: "+aux1+
                "\nA quantidade de números que sao maiores que 200 é: "+aux2);

    }
 
}
