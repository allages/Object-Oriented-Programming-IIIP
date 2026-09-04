package Exercicio4;
import java.util.Random;

public class Investimento extends Conta {
    public enum Risco{
        BAIXO(0.85, 0.025),
        MEDIO(0.45, 0.30),
        ALTO(0.2, 1.0);

        private double probSucesso;
        private double rendimento;

        Risco(double probSucesso, double rendimento) {
            this.probSucesso = probSucesso;
            this.rendimento = rendimento;
        }

        public double getRendimento() {
            return rendimento;
        }
        public double getProbSucesso() {
            return probSucesso;
        }
    }

    public void investimento(){
        Random prob = new Random();
    }


}
