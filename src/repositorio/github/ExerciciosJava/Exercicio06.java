package repositorio.github.ExerciciosJava;

import java.util.Scanner;

public class Exercicio06 {
    public static void main(String[] args) {
        
        //6-	Leia a idade de 20 pessoas e exiba a soma das idades
        Scanner leitor = new Scanner(System.in);
        
        int id, soma = 0;

        for(int i=1;i<=3;i++){
            System.out.println("Digite a sua idade: ");
            id = leitor.nextInt();
            
            soma += id;
        }
        
        System.out.println("A soma das idades é: "+soma);

    }
}
