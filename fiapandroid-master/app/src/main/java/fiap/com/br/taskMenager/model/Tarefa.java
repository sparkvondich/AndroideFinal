package fiap.com.br.taskMenager.model;

import java.util.Date;

public class Tarefa {

    private int id;
    private String nome;
    private String data;
    private String descricao;
    private Tipo_Tarefa tipo;

    public Tarefa(){}

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Tipo_Tarefa getTipo() {
        return tipo;
    }

    public void setTipo(Tipo_Tarefa tipo) {
        this.tipo = tipo;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }

    public String getDescricao() { return descricao; }

    public void setDescricao(String descricao) { this.descricao = descricao; }

}
