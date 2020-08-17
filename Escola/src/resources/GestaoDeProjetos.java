package resources;

public class GestaoDeProjetos implements I_Disciplina {
    private Integer nota;
    private CursoType tipoCurso = CursoType.GRADUACAO;

    @Override
    public Boolean isAprovado() throws Exception {
        return (this.nota >= 8) ? true : false;
    }

    public Integer getNota() {
        return nota;
    }

    public void setNota(Integer nota) {
        if (nota <= 10)
            this.nota = nota;
    }
}
