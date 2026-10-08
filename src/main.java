public class main {
    static void main(String[] args) {

        Temporizador temporizador1 = new Temporizador(
                2,
                55
        );

        temporizador1.avanzarSegundos(65);
        temporizador1.avanzarSegundos(40);
        temporizador1.avanzarSegundos(40);
        temporizador1.avanzarSegundos(30);
    }
}
