public abstract class Personagem {

    private String nome;
    private String poder;
    private int hp;
    
    public Personagem(String nome, String poder, int hp) {
        this.nome = nome;
        this.poder = poder;
        this.hp = hp;
    }

    public void atacar(){
        System.out.println("personagem atacando");
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getPoder() {
        return poder;
    }

    public void setPoder(String poder) {
        this.poder = poder;
    }

    public int getHp() {
        return hp;
    }

    public void setHp(int hp) {
        this.hp = hp;
    }
    
    
}
