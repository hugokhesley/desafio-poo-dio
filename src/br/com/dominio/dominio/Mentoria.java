package br.com.dominio.dominio;

import java.time.LocalDate;

public class Mentoria extends Conteudo {

    public LocalDate getData() {
        return data;
    }
    @Override
    public double calcularXp() {
        return XP_PADRAO + 20d;
    }

    public void setData(LocalDate data) {
        this.data = data;
    }

    private LocalDate data;

    public Mentoria(){

    }

    @Override
    public String toString() {
        return "Mentoria{" +
                "titulo='" + getTitulo() + '\'' +
                ", descricao='" + getDescricao() + '\'' +
                ", data=" + data +
                '}';
    }


}
