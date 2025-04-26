public class Guerreiro extends Personagem{

    public Guerreiro(String nome, String poder, int hp) {
        super(nome, poder, hp);
    }

    @Override
    public void atacar(){
        System.out.println("guerreiro atacando com espada");
    }
    
}
