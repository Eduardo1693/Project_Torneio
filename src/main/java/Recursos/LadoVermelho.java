package Recursos;

import java.util.ArrayList;
import java.util.List;
public class LadoVermelho {
    public List<String> jogadores;

    public LadoVermelho(List<String> membros) {
        jogadores = new ArrayList<>(membros);
    }
}