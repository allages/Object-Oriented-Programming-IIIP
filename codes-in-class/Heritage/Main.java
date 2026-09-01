public class Main {
    public static void main(String[] args) {
        Estudante e = new Estudante("Allan", 860499, 1200.00, 20);
        e.entrarEmAula();
        e.sairEmAula();

        EstudanteBolsista eb = new EstudanteBolsista("Maria", 870229, 1200.00, 0.80, 20);
        eb.entrarEmAula();
        eb.sairEmAula();


    }
}
