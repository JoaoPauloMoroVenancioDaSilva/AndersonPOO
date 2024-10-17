public class pokemon {
    private String nome;
    private String habilidade;
    private String tipo;
    private String regiao;
    private String ataque1;
    private String ataque2;
    private String ataque3;
    private String ataque4;

    public String getAtaque1() {
        return ataque1;
    }

    public void setAtaque1(String ataque1) {
        this.ataque1 = ataque1;
    }

    public String getAtaque2() {
        return ataque2;
    }

    public void setAtaque2(String ataque2) {
        this.ataque2 = ataque2;
    }

    public String getAtaque3() {
        return ataque3;
    }

    public void setAtaque3(String ataque3) {
        this.ataque3 = ataque3;
    }

    public String getAtaque4() {
        return ataque4;
    }

    public void setAtaque4(String ataque4) {
        this.ataque4 = ataque4;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getHabilidade() {
        return habilidade;
    }

    public void setHabilidade(String habilidade) {
        this.habilidade = habilidade;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getRegiao() {
        return regiao;
    }

    public void setRegiao(String regiao) {
        this.regiao = regiao;
    }

    pokemon(String nome, String habilidade, String tipo, String regiao, String ataque1, String ataque2, String ataque3, String ataque4) {
        nome = this.nome;
        habilidade = this.habilidade;
        tipo = this.tipo;
        regiao = this.regiao;
        ataque1 = this.ataque1;
        ataque2 = this.ataque2;
        ataque3 = this.ataque3;
        ataque4 = this.ataque4;
    }

    public void atacar(){
        System.out.println("Escolha um ataque: ");
        System.out.println("  " + this.ataque1 + "  |  " + this.ataque2);
        System.out.println("-------------------------------------");
        System.out.println("  " + this.ataque3 + "  |  " + this.ataque4);
    }


}
