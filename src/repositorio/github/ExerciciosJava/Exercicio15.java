package repositorio.github.ExerciciosJava;

import java.util.Scanner;

public class Exercicio15 {
    public static void main(String[] args) {
        //15-	Escreva um algoritmo que leia uma sequência de números do usuário e realize a soma desses números. Encerre a execução quando o número negativo for digitado
        
        Scanner leitor = new Scanner(System.in);
        int n = 0, aux = 0;
        
        for(int i=1;i<=4;i++){
            System.out.println("Digite um número: ");
            n = leitor.nextInt();
            
            aux = aux + n;
            
            if(n<0){
                break;
            }
        }
        if(n>0){
        System.out.println("A soma é: "+aux);
        }else{
            System.out.println("Erro!\nDigite apenas números > 0");
        }

    }
}
