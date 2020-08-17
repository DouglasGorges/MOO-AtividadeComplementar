package resources;

import java.util.List;

public class Curso {
    CursoType tipoCurso;
    List<I_Disciplina> listaDisciplinas;

    public CursoType getTipoCurso() {
        return tipoCurso;
    }

    public void setTipoCurso(CursoType tipoCurso) {
        this.tipoCurso = tipoCurso;
    }

    public List<I_Disciplina> getListaDisciplinas() {
        return listaDisciplinas;
    }

    public void setListaDisciplinas(List<I_Disciplina> listaDisciplinas) {
        this.listaDisciplinas = listaDisciplinas;
    }
}
