package app;

import java.util.Scanner;
import java.util.concurrent.DelayQueue;

import javax.security.auth.login.LoginContext;

public class App { 
    public static void iniciar() throws InterruptedException {
        for(int u = 0; u < 3;u++){
         System.out.print("\033\143"); // Comando para apagar o console (Testado no Linux)
                 System.out.printf("%c",9487);
                 for(int y = 0; y < 31; y++){
                     System.out.printf("%c",9473);               
                     }
                 System.out.printf("%c",9491);   
                 System.out.printf("\n%c      Iniciando o sistema      %c",9475,9475);
                 System.out.printf("\n%c        Aguarde                %c",9475,9475);
                 System.out.printf("\n%c",9495);
                 for(int k = 0; k < 31; k++){
                     System.out.printf("%c",9473);               
                     }
                 System.out.printf("%c",9499);
                 Thread.sleep(1000);
                 System.out.print("\033\143"); // Comando para apagar o console (Testado no Linux)
                 System.out.printf("%c",9487);
                 for(int i = 0; i < 31; i++){
                     System.out.printf("%c",9473);               
                     }
                 System.out.printf("%c",9491);   
                 System.out.printf("\n%c      Iniciando o sistema      %c",9475,9475);
                 System.out.printf("\n%c        Aguarde .              %c",9475,9475);
                 System.out.printf("\n%c",9495);
                 for(int i = 0; i < 31; i++){
                     System.out.printf("%c",9473);               
                     }
                 System.out.printf("%c",9499);
                 Thread.sleep(1000);
                 System.out.print("\033\143"); // Comando para apagar o console (Testado no Linux)
                 System.out.printf("%c",9487);
                 for(int i = 0; i < 31; i++){
                     System.out.printf("%c",9473);               
                     }
                 System.out.printf("%c",9491);   
                 System.out.printf("\n%c      Iniciando o sistema      %c",9475,9475);
                 System.out.printf("\n%c        Aguarde . .            %c",9475,9475);
                 System.out.printf("\n%c",9495);
                 for(int i = 0; i < 31; i++){
                     System.out.printf("%c",9473);               
                     }
                 System.out.printf("%c",9499);
                 Thread.sleep(1000);
                 System.out.print("\033\143"); // Comando para apagar o console (Testado no Linux)
                 System.out.printf("%c",9487);
                 for(int i = 0; i < 31; i++){
                     System.out.printf("%c",9473);               
                     }
                 System.out.printf("%c",9491);   
                 System.out.printf("\n%c      Iniciando o sistema      %c",9475,9475);
                 System.out.printf("\n%c        Aguarde . . .          %c",9475,9475);
                 System.out.printf("\n%c",9495);
                 for(int i = 0; i < 31; i++){
                     System.out.printf("%c",9473);               
                     }
                 System.out.printf("%c",9499);
                 Thread.sleep(1000);
     }
    }
     public static void main(String[] args) throws Exception {
      Scanner Input = new Scanner(System.in);
      final String login1 = "12345678900";
      final String login2 = "123.456.789-00";
      final String sn = "01020304";
        // iniciar();
       System.out.print("\033\143");
       System.out.printf("%c",9487);
       for(int y = 0; y < 31; y++){
           System.out.printf("%c",9473);               
           }
       System.out.printf("%c",9491);  
       System.out.printf("\n%c Bem vindo ao Caixa Eletronico %c",9475,9475);
       System.out.printf("\n%c Digite o seu CPF:             %c",9475,9475);
       System.out.printf("\n%c                               %c",9475,9475);
       System.out.printf("\b\b\b\b\b\b\b\b\b\b\b\b\b\b\b\b\b\b\b\b\b\b\b\b\b\b\b\b\b\b\b");
       String cpf = Input.nextLine();
       if(cpf == login1 || cpf == login2){
        System.out.printf("\r%c *Tela de acesso nao permitido*%c",9475,9475);
        System.out.printf("\n%c",9495);
        for(int i = 0; i < 31; i++){
            System.out.printf("%c",9473);               
            }
        System.out.printf("%c",9499);
        System.exit(0);
       }
       System.out.printf("\n%c Digite o a sua senha:         %c",9475,9475);
       String senha = Input.next();
    }
}