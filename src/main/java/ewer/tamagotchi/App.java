package ewer.tamagotchi;

import java.util.Scanner;

// @author Ewerton
public class App {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Nome do seu Tamagotchi: ");
        String nome = input.nextLine();

        Tamagotchi pet = new Tamagotchi(nome);

        while (pet.estaVivo()) {
            System.err.println("");
            pet.status();

            System.out.println("\nO que deseja fazer?");
            System.err.println("1 - Alimentar");
            System.err.println("2 - Brincar");
            System.err.println("3 - Dormir");
            System.err.println("4 - Sair");

            int opcao = input.nextInt();

            switch (opcao) {
                case 1:
                    pet.alimentar();
                    System.out.println("\n- 15 de fome | - 5 energia | + 5 felicidade");
                    break;
                case 2:
                    pet.brincar();
                    System.out.println("\n+ 15 de fome | - 15 energia | + 15 felicidade");
                    break;
                case 3:
                    pet.dormir();
                    System.out.println("\n+ 15 de fome | + 25 energia | - 20 felicidade");
                    break;
                case 4:
                    System.err.println("\nAté mais!!");
                    return;
                default:
                    System.err.println("Opção inválida!!");
            }
        }
        System.err.println("\nInfelizmente, " + nome + " não resistiu e foi de caixa...\nF...");
        input.close();
    }
}
