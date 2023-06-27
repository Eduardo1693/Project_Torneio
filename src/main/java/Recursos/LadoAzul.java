package Recursos;

import java.util.ArrayList;
import java.util.List;

public class LadoAzul {
    public List<String> jogadores;
    public LadoAzul(List<String> membros) {
        jogadores = new ArrayList<>(membros);
    }
}