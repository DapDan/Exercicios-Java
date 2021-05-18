package repositorio.github.ExerciciosJava;

import java.util.Scanner;

public class Exercicio03 {
    public static void main(String[] args) {
        //3-	Leia o nome do usuário e escreva o nome dele na tela 10 vezes
        Scanner leitor = new Scanner(System.in);

        String n;
        System.out.println("Digite seu nome: ");
        n = leitor.next();
        
        for(int i=1;i<=10;i++){
            System.out.println(n+" "+i);
        }

    }
}
