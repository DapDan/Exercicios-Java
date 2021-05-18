package repositorio.github.ExerciciosJava;

import java.util.Scanner;

public class Exercicio07 {
    public static void main(String[] args) {
        
        //7-	Leia a idade de 20 pessoas e exiba a média das idades
        
        Scanner leitor = new Scanner(System.in);
        double id, soma = 0;

        for(int i=1;i<=3;i++){
            System.out.println("Digite a sua idade: ");
            id = leitor.nextInt();
            
            soma += id;
        }

        soma /= 3;
        System.out.println("A media das idades é: "+soma);

    }
}
