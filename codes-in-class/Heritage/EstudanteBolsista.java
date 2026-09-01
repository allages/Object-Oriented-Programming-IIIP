public class EstudanteBolsista extends Estudante{
    private double desconto;
    public EstudanteBolsista(String nome, int matricula, double mensalidade, double desconto, int idade){
        super(nome, matricula, mensalidade, idade);
        this.desconto = desconto;
    }

    public double getDesconto() {
        return desconto;
    }
    public void setDesconto(double desconto) {
        this.desconto = desconto;
    }


}
