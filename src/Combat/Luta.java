package Combat;

import java.util.Random;

public class Luta {
    //ATRIBUTOS
    private Lutador desafiado;
    private Lutador desafiante;
    private int rounds;
    private boolean aprovada;

        //METODOS PUBLICOS
        public void marcarLuta(Lutador l1, Lutador l2){
            if(l1.getCategoria().equals(l2.getCategoria())
                    &&  l1 != l2){
                this.aprovada = true;
                this.desafiado = l1;
                this.desafiante = l2;
            } else {
                this.aprovada = false;
                this.desafiado = null;
                this.desafiante = null;
            }

        }
        public void lutar(){
            if(this.aprovada){
                System.out.println("========DESAFIADO==========");
                this.desafiado.apresentar();
                System.out.println("========DESAFIANTE=========");
                this.desafiante.apresentar();

                Random aleatorio = new Random();
                int vencedor = aleatorio.nextInt(3);
                System.out.println("======== R E S U L T A D O ============");
                switch(vencedor){
                    case 0: // Empate
                        System.out.println("Empatou");
                        this.desafiado.empatarLuta();
                        this.desafiante.empatarLuta();
                        break;
                    case 1: // Desafiado vence
                        System.out.println(this.desafiado.getNome() + " vencedor da luta");
                        this.desafiado.ganharLuta();
                        this.desafiante.perderLuta();
                        break;

                    case 2: //Desafiante vence
                        System.out.println(this.desafiante.getNome() + " vencedor da luta");
                        this.desafiado.perderLuta();
                        this.desafiante.ganharLuta();
                        break;

                }
                System.out.println("======================");


            } else{
                System.out.println("Luta não pode acontecer");
            }

        }

        //METODOS ESPECIAS
        private void setDesafiado(Lutador desafiado){
            this.desafiado = desafiado;
        }
        private Lutador getDesafiado(){
            return this.desafiado;
        }
        private void setDesafiante(Lutador desafiante){
            this.desafiante = desafiante;
        }
        private Lutador getDesafiante(){
            return this.desafiante;
        }
        private void setRounds(int rounds){
            this.rounds = rounds;
        }
        private int getRounds(){
            return this.rounds;
        }
        private void setAprovada(boolean aprovada){
            this.aprovada = aprovada;
        }
        private boolean getAprovada(){
            return this.aprovada;
        }
    }

