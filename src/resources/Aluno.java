package resources;

import java.util.ArrayList;
import java.util.List;

public class Aluno {
    private String nome;
    private List<Curso> listaCursos = new ArrayList<>();

    public Boolean calcularAprovacao() throws Exception {
        for (Curso curso : listaCursos)
            for (I_Disciplina disciplina : curso.listaDisciplinas)
                if (!disciplina.isAprovado())
                    return false;
        return true;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public List<Curso> getListaCursos() {
        return listaCursos;
    }

    public void setListaCursos(List<Curso> listaCursos) {
        this.listaCursos = listaCursos;
    }
}
