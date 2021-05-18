package repositorio.github.ExerciciosJava;

import java.util.Scanner;

public class Exercicio10 {
    public static void main(String[] args) {
        
        //10-	Crie um algoritmo que leia um número do usuário e exiba a sua tabuada de multiplicação
        
        Scanner leitor = new Scanner(System.in);
        
        int n, aux = 0;
        System.out.println("Digite um número para a tabuada: ");
        n =leitor.nextInt();
        
        for(int i=1;i<=10;i++){
            aux = n*i;
            System.out.println(n+" * "+i+" = "+aux);
        }  

    }
 
}
