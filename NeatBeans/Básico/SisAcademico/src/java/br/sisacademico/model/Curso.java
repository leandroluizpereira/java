
package br.sisacademico.model;

public class Curso {
    private int indCurso;
    private String nomeCurso;
    private String tipoCurso;

    public Curso(int indCurso, String nomeCurso, String tipoCurso) {
        this.indCurso = indCurso;
        this.nomeCurso = nomeCurso;
        this.tipoCurso = tipoCurso;
    }
  
    public Curso() {
    
    
}
    public int getIndCurso() {
        return indCurso;
    }

    public void setIndCurso(int indCurso) {
        this.indCurso = indCurso;
    }

    public String getNomeCurso() {
        return nomeCurso;
    }

    public void setNomeCurso(String nomeCurso) {
        this.nomeCurso = nomeCurso;
    }

    public String getTipoCurso() {
        return tipoCurso;
    }

    public void setTipoCurso(String tipoCurso) {
        this.tipoCurso = tipoCurso;
    }
}
