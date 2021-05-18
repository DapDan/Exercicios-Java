package repositorio.github.ExerciciosJava;

import java.util.Scanner;

public class Exercicio09 {
    public static void main(String[] args) {
        
       // 9-	Leia o nome e a idade de 10 pessoas e exiba o nome da pessoa mais nova
       
        Scanner leitor = new Scanner(System.in);
        int id1,id2, aux = 0;
        String n1,n2;
        
        for(int i=1;i<=1;i++){
            System.out.println("Digite seu nome: ");
            n1 = leitor.next();
            
            System.out.println("Digite sua idade: ");
            id1 = leitor.nextInt(); 
            
            System.out.println("Digite seu nome: ");
            n2 = leitor.next();
            
            System.out.println("Digite sua idade: ");
            id2 = leitor.nextInt();        
            
            if(id1 < id2){
                String auxS = n1;  
                System.out.println("A pessoa mais nova é: "+auxS);
            }else{
                String auxS = n2;
                System.out.println("A pessoa mais nova é: "+auxS);
            }       
        }

    }
}
