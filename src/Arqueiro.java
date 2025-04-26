public class Arqueiro extends Personagem{

    public Arqueiro(String nome, String poder, int hp) {
        super(nome, poder, hp);
    }

    @Override
    public void atacar(){
        System.out.println("arqueiro atirando flechas");
    }
}
