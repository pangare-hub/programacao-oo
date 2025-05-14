public abstract class Personagem {
    protected String nome;
    protected int hp;
    protected int ataqueBase;

    public Personagem(String nome, int hp, int ataqueBase) {
        this.nome = nome;
            this.hp = hp;
                this.ataqueBase = ataqueBase;
    }

    public abstract void atacar(Personagem inimigo);

    public abstract void usarHabilidadeEspecial();

    public void defender(int dano) {
        this.hp -= dano;
         if (this.hp < 0) this.hp = 0;
            System.out.println(this.nome + " recebeu " + dano + " de dano. HP atual: " + this.hp);
    }

    public void status() {
        // Corrigido: falta de parênteses no método getSimpleName()
        System.out.println("[" + this.getClass().getSimpleName() + "] " + nome + " - HP: " + hp);
    }

    public boolean estaVivo() {
        return this.hp > 0;
    }
}
