public class Mago extends Personagem{

    public Mago(String nome, String poder, int hp) {
        super(nome, poder, hp);
    }

    @Override
    public void atacar(){
        System.out.println("mago atacando com poderes");
    }

}
