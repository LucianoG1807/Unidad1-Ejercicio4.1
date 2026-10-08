public class Temporizador {
    /*
    4 — Simulación de Temporizador Digital

Contexto

Los sistemas de automatización de hogares (domótica) y dispositivos electrónicos emplean contadores
de tiempo regresivo para apagar luces, sistemas de riego o alarmas.

Consigna

Desarrollar una clase en Java que modele un temporizador digital con control de minutos y segundos restantes.

Desarrollo requerido

Definir la clase Temporizador con los atributos minutos (int) y segundos (int).

Incorporar un constructor que inicialice el tiempo, validando que los segundos se encuentren estrictamente
entre 0 y 59, y los minutos no sean negativos.

Implementar un método avanzarSegundos(int cantidad) que actualice correctamente la relación entre minutos y
segundos cuando el tiempo transcurra.

En el método main, instanciar un temporizador con un valor inicial, simular el paso de una cantidad específica
de segundos y mostrar el estado final del reloj por consola.
     */

    int minutos;
    int segundos;

    Temporizador (int minutos, int segundos) {

        if (segundos >= 0 && segundos <= 59) {
            this.segundos = segundos;
        }
        else {
            throw new IllegalArgumentException("Los segundos restantes deben ser entre 0 y 59.");
        }

        if (minutos > 0) {
            this.minutos = minutos;
        }
        else {
            throw new IllegalArgumentException("La cantidad no puede ser negativa.");
        }
    }

    void avanzarSegundos(int cantidad) {
        if (cantidad < 0) {
            throw new IllegalArgumentException("La cantidad no puede ser negativa.");
        }

        int totalSegundos = minutos * 60 + segundos;

        totalSegundos = Math.max(0, totalSegundos - cantidad);

        minutos = totalSegundos / 60;
        segundos = totalSegundos % 60;

        if (totalSegundos > 0) {
            System.out.println("TIEMPO RESTANTE: " + minutos + " minutos y " + segundos + " segundos.");
        }
        else {
            System.out.println("Tiempo finalizado.");
        }

    }
}
