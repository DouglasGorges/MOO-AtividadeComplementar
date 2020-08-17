package application;

import resources.*;

import java.text.ParseException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Teste {
    public static void main(String[] args) {
        Aluno aluno = new Aluno();
        aluno.setNome("John Connor");


        Matematica discMatematica = new Matematica();
        discMatematica.setNota("A");

        Portugues discPortugues = new Portugues();
        discPortugues.setNota("A");

        List<I_Disciplina> listaDisciplinaEspecializacao = new ArrayList<>();
        listaDisciplinaEspecializacao.add(discMatematica);
        listaDisciplinaEspecializacao.add(discPortugues);

        Curso cursoEspecializacao = new Curso();
        cursoEspecializacao.setListaDisciplinas(listaDisciplinaEspecializacao);


        GestaoDeProjetos discGestao = new GestaoDeProjetos();
        discGestao.setNota(8);

        FisicaAplicada discFisica = new FisicaAplicada();
        discFisica.setNota(10);

        List<I_Disciplina> listaDisciplinaGraduacao = new ArrayList<>();
        listaDisciplinaGraduacao.add(discGestao);
        listaDisciplinaGraduacao.add(discFisica);

        Curso cursoGraduacao = new Curso();
        cursoGraduacao.setListaDisciplinas(listaDisciplinaGraduacao);

        List<Curso> listaCursos = new ArrayList<>();
        listaCursos.add(cursoEspecializacao);
        listaCursos.add(cursoGraduacao);

        aluno.setListaCursos(listaCursos);

        try {
            System.out.println(
                    aluno.getNome() + " está " + ((aluno.calcularAprovacao()) ? "aprovado(a)." : "reprovado(a)."));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
