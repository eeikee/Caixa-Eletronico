package app;

import java.util.Scanner;
import java.util.concurrent.DelayQueue;

import javax.security.auth.login.LoginContext;
import javax.swing.JOptionPane;

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
      String cpf, passw,opt2;
      int try1 = 3, opt = 0;
      double saldo = 1000.00;
        iniciar();
       System.out.print("\033\143");
       System.out.printf("%c",9487);
       for(int y = 0; y < 31; y++){
           System.out.printf("%c",9473);               
           }
       System.out.printf("%c",9491);  
       System.out.printf("\n%c Bem vindo ao Caixa Eletronico %c",9475,9475);
       System.out.printf("\n%c ------------------------------%c",9475,9475); 
       System.out.printf("\n%c Digite o seu CPF:             %c",9475,9475);
       System.out.printf("\n%c                               %c",9475,9475);
       System.out.printf("\b\b\b\b\b\b\b\b\b\b\b\b\b\b\b\b\b\b\b\b\b\b\b\b\b\b\b\b\b\b\b");
       cpf = Input.next();
       if(cpf.equals(login1) || cpf.equals(login2)){
        System.out.printf("%c ------------------------------%c\n",9475,9475); 
        do{
            if(try1 == 0){
                System.out.printf("%c ------------------------------%c",9475,9475); 
                System.out.printf("\n%c       *Conta bloqueada*       %c\n",9475,9475); 
                System.out.printf("%c",9495);
                for(int i = 0; i < 31; i++){
                    System.out.printf("%c",9473);               
                    }
        System.out.printf("%c\n",9499);
                System.exit(0);
            }
            else if(try1 < 3){
                System.out.printf("%c ------------------------------%c\n",9475,9475);
                System.out.printf("%c        *Senha Invalida*       %c\n",9475,9475); 
                System.out.printf("%c     Tentativas restantes %d    %c\n",9475,try1,9475); 
                System.out.printf("%c ------------------------------%c\n",9475,9475); 
            }
            System.out.printf("%c Digite o a sua senha:         %c",9475,9475);
            System.out.printf("\n%c                               %c",9475,9475);
            System.out.print("\b\b\b\b\b\b\b\b\b\b\b\b\b\b\b\b\b\b\b\b\b\b\b\b\b\b\b\b\b\b\b");
            passw = Input.next();
            try1--;
           }while(passw.equals(sn) == false);
           do{
           do{
            System.out.print("\033\143");
            System.out.printf("%c",9487);
             for(int y = 0; y < 31; y++){
                 System.out.printf("%c",9473);               
                 }
             System.out.printf("%c",9491);  
             System.out.printf("\n%c    Menu - Caixa Eletronico    %c",9475,9475);
             System.out.printf("\n%c    1 – Saldo                  %c",9475,9475);
             System.out.printf("\n%c    2 – Depósito               %c",9475,9475);
             System.out.printf("\n%c    3 – Saque                  %c",9475,9475);
             System.out.printf("\n%c    0 – Sair                   %c",9475,9475);
             System.out.printf("\n%c    Selecione uma opcao:       %c",9475,9475);
             System.out.printf("\b\b\b\b\b\b\b");
             opt = Input.nextInt();
             switch(opt){
                case 1: System.out.printf("\n%c    Saldo atual: %f              %c",9475,saldo,9475);
                case 2: System.out.printf("\n%c Selecione uma opcao:          %c",9475,9475);
                break;
                case 3: System.out.printf("\n%c Selecione uma opcao:          %c",9475,9475);
                break;
                case 0: System.out.printf("%c ------------------------------%c",9475,9475); 
                System.out.printf("\n%c           Ate logo!           %c",9475,9475);
                System.out.printf("\n%c",9495);
                 for(int i = 0; i < 31; i++){
                     System.out.printf("%c",9473);               
                     }
                 System.out.printf("%c\n",9499);
                Thread.sleep(2000);
                System.exit(0);
                default: System.out.printf("%c ------------------------------%c",9475,9475); 
                System.out.printf("\n%c      *Opcao invalida*         %c",9475,9475);
                System.out.printf("\n%c",9495);
                 for(int i = 0; i < 31; i++){
                     System.out.printf("%c",9473);               
                     }
                 System.out.printf("%c",9499);
                Thread.sleep(1000);
            }
           }while(opt != 0 || opt != 1 || opt != 2 || opt != 3);
           System.out.printf("\n%c ------------------------------%c",9475,9475); 
           System.out.printf("\n%c Deseja continuar(Y/N):        %c",9475,9475); 
           opt2 = Input.next();
        }while(opt2.equals("Y") == true || opt2.equals("y") == true);
        System.out.printf("%c ------------------------------%c",9475,9475); 
                System.out.printf("\n%c           Ate logo!           %c",9475,9475);
                System.out.printf("\n%c",9495);
                 for(int i = 0; i < 31; i++){
                     System.out.printf("%c",9473);               
                     }
                 System.out.printf("%c\n",9499);
                Thread.sleep(2000);
                System.exit(0);
            }
      else{
        System.out.printf("\r%c *Tela de acesso nao permitido*%c",9475,9475);
        System.out.printf("\n%c",9495);
        for(int i = 0; i < 31; i++){
            System.out.printf("%c",9473);               
            }
        System.out.printf("%c\n",9499);
        System.exit(0);
      }
    }
}