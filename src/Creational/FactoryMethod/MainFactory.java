package Creational.FactoryMethod;

public class MainFactory {
    public static void main(String[] args) {
        Sensable[] sensables = new Sensable[2];
        sensables[0] = new Humanity();
        sensables[1] = new Aliance();

        for (Sensable s : sensables) {
            System.out.println(s.Create());
        }
    }
}
