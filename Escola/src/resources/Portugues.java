package resources;

public class Portugues implements I_Disciplina {

    private String nota;
    private CursoType tipoCurso = CursoType.ESPECIALIZACAO;

    @Override
    public Boolean isAprovado() throws Exception {
        return (this.nota.equals("A")) ? true : false;
    }

    public String getNota() {
        return nota;
    }

    public void setNota(String nota) {
        if (nota.equals("A") || nota.equals("R"))
            this.nota = nota;
    }

    public CursoType getTipoCurso() {
        return tipoCurso;
    }
}
