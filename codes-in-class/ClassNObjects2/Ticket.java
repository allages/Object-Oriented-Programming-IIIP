package ClassNObjects2;

public enum Ticket{
    NORMAL(1.0, "CODIGO PROMOCIONAL"), // São objetos/instâncias, é como se eu criasse 3 tickets diferentes. Acontece nos enums
    MEIA_ENTRADA(0.5, "SEM CODIGO PROM"),
    VIP(0.1, "CODIGO PROMOCIONAL");
    
    double desconto; // Atributos
    String codigo;

    Ticket (double d, String codigo){ // Construtor, ele está associado aos atributos
        this.desconto = d; // Aqui ele está "levando" o valor do enum lá em cima é associado a variável correspondente
        this.codigo = codigo;
    }

    // Os getters são métodos que possibilitam que outras classes recebam o valor da variável sem poder modificar ele
    public double getDesconto(){
        return desconto;
    }

    public String getCodigo(){
        return codigo;
    }
}

