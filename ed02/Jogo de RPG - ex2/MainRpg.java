public class MainRpg {
    public static void main(String[] args) {
        Guerreiro g = new Guerreiro("Thorgal");
        Mago m = new Mago("Merlino");
        Arqueiro a = new Arqueiro("Legolis");

        // Exibição do status inicial
        g.status();
        m.status();
        a.status();

        // Execução das ações
        g.atacar(m);
        m.usarHabilidadeEspecial();
        a.usarHabilidadeEspecial();

        // Exibição do status final
        g.status();
        m.status();
        a.status();
    }
}
