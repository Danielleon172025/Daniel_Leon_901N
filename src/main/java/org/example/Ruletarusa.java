package org.example;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Ruletarusa {
private List<Integer> tambor;
private int bala;
private int posicionActual;
private Random random;


public Ruletarusa() {
    random = new Random();
    reiniciarJuego();
}

public List<Integer> getTambor() {
    return tambor;
}

public void setTambor(List<Integer> tambor) {
    this.tambor = tambor;
}

public int getBala() {
    return bala;
}

public void setBala(int bala) {
    this.bala = bala;
}

public int getPosicionActual() {
    return posicionActual;
}

public void setPosicionActual(int posicionActual) {
    this.posicionActual = posicionActual;
}

public Random getRandom() {
    return random;
}

public void setRandom(Random random) {
    this.random = random;
}


    public boolean disparar() {
        boolean resultado = (posicionActual == bala);
        setPosicionActual((getPosicionActual() + 1) % getTambor().size());
        return resultado;
    }

    public void reiniciarJuego() {
        List<Integer> nuevoTambor = new ArrayList<>();
        for (int i = 0; i < 6; i++) {
            nuevoTambor.add(i);
        }
        setTambor(nuevoTambor);
        setBala(random.nextInt(getTambor().size()));
        setPosicionActual(0);
    }
}
