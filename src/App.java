public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");

        Guerreiro g1 = new Guerreiro("robin", "espada", 100);
        Mago m1 = new Mago("gleison", "magia", 100);
        Arqueiro a1 = new Arqueiro("arqueiro verde", "arco", 100);


        g1.atacar();
        m1.atacar();
        a1.atacar();


    }
}
