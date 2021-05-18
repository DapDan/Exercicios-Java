package repositorio.github.ExerciciosJava;

import java.util.Scanner;

public class Exercicio08 {
    public static void main(String[] args) {
        
        //8-	Leia a idade de 20 pessoas e exiba quantas pessoas são maiores de idade
        
        Scanner leitor = new Scanner(System.in);
        int id, aux = 0;
        
        for(int i=1;i<=3;i++){
            System.out.println("Digite sua idade: ");
            id = leitor.nextInt();
            
            if(id > 18){
                aux += 1;
            }       
        }
         System.out.println("A quantidade de maiores de idade é: "+aux);

    }
}
