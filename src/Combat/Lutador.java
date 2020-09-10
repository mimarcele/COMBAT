package Combat;

public class Lutador {
    private String nome;
    private String nacionalidade;
    private int idade;
    private float altura;
    private float peso;
    private String categoria;
    private int vitorias, derrotas, empates;


    //METODOS PUBLICOS
    public void apresentar(){
        System.out.println("IIIIT'S TIIIME");
        System.out.println("======================================");
        System.out.println("Lutador: " + this.getNome());
        System.out.println("Nacionalidade: " + this.getNacionalidade());
        System.out.println("Idade: " + this.getIdade());
        System.out.println("Altura: " + this.getAltura());
        System.out.println("Peso: " + this.getPeso());
        System.out.println("Vitórias: " + this.getVitorias());
        System.out.println("Derrotas: " + this.getDerrotas());
        System.out.println("Empates: " + this.getEmpates());

    }

    public void status(){
        System.out.println(this.getNome());
        System.out.println("Pesando: " + this.getPeso() + " na categoria " + this.getCategoria());
        System.out.println(this.getVitorias() + " vitórias");
        System.out.println(this.getDerrotas() + " derrotas");
        System.out.println(this.getEmpates() + " empates");
    }

    public void ganharLuta(){
        this.setVitorias(this.getVitorias() + 1);
    }

    public void perderLuta(){
        this.setDerrotas(this.getDerrotas() + 1);
    }

    public void empatarLuta(){
        this.setEmpates(this.getEmpates() + 1);
    }

    //METODOS ESPECIAIS
    //METODO CONSTRUTOR
    public Lutador(String no, String na, int id, float al, float pe, int vi, int de, int em) {
        this.nome = no;
        this.nacionalidade = na;
        this.idade = id;
        this.altura = al;
        setPeso(pe);
        // this.peso = pe;
        this.vitorias = vi;
        this.derrotas = de;
        this.empates = em;

    }
    private void setNome(String no) {
        this.nome = no;
    }
    String getNome(){
        return this.nome;
    }
    private void setNacionalidade(String na){
        this.nacionalidade = na;
    }
    private String getNacionalidade(){
        return this.nacionalidade;
    }
    private void setIdade(int id){
        this.idade = id;
    }
    private int getIdade(){ // empate derrotas
        return this.idade;
    }
    private void setAltura(float al){
        this.altura = al;
    }
    private float getAltura(){
        return this.altura;
    }
    private void setPeso(float pe){
        this.peso = pe;
        this.setCategoria();
    }
    private void setCategoria(){
        if(this.peso < 52.2){
            this.categoria = "Inválido";
        } else if(this.peso <= 70.3){
            this.categoria = "Leve";
        } else if(this.peso<= 83.9 ){
            this.categoria = "Médio";
        } else if(this.peso <= 120.2) {
            this.categoria = "Pesado";
        } else{
            this.categoria = "Inválido";
        }
    }
    String getCategoria(){
        return this.categoria;
    }
    private float getPeso(){
        return this.peso;
        //setCategoria();
    }

    private void setVitorias(int vi){
        this.vitorias = vi;
    }
    private int getVitorias(){
        return this.vitorias;
    }
    private void setDerrotas(int de){
        this.derrotas = de;
    }
    private int getDerrotas(){
        return this.derrotas;
    }
    private void setEmpates(int em){
        this.empates = em;
    }
    private int getEmpates(){
        return this.empates;
    }
}

