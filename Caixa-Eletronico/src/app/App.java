package app;

import java.util.concurrent.DelayQueue;

public class App {
    public static void main(String[] args) throws Exception {
        System.out.print("\033\143"); // Comando para apagar o console (Testado no Linux)
        for(int j = 0; j < 3; j++){
            System.out.println("*Iniciando o sistema*");
            System.out.print("*Aguarde ");
            for(int i = 0; i < 4; i++){
                Thread.sleep(1000);
                System.out.print(" .");               
                }
                System.out.print("\033\143");
        }
        System.out.println("Bem vindo ao Caixa Eletronico");
    }
}