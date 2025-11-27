package ewer.tamagotchi;

//@author Ewerton
public class Tamagotchi {

    private String nome;
    private int fome = 50;
    private int felicidade = 50;
    private int energia = 50;

    public Tamagotchi(String nome) {
        this.nome = nome;
    }

    public void alimentar() {
        fome -= 15;
        if (fome < 0) {
            fome = 0;
        }
        energia -= 5;
        felicidade += 5;
        System.out.println(nome + " foi alimentado, mas cansou um pouco pra fazer comida!");
    }

    public void brincar() {
        felicidade += 15;
        energia -= 15;
        fome += 15;
        System.out.println(nome + " brincou e está feliz!! mas ficou cansado e com um pouco de fome");
    }

    public void dormir() {
        energia += 25;
        fome += 15;
        felicidade -= 20;
        System.err.println(nome + " dormiu e recuperou energia!! acordou com mó fome e meio na bad!!");
    }

    public void status() {
        System.err.println("\n--- Status de " + nome + " ---");
        System.err.println("Fome: " + fome);
        System.err.println("Felicidade: " + felicidade);
        System.err.println("Energia: " + energia);
    }

    public boolean estaVivo() {
        return fome < 100 && energia > 0 && felicidade > 0; // se fome nao tiver no maximo, energia e felicidade nao zeradas, pet está vivo e continua o game
    }
}
