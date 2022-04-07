package projeto.monitoramentoestoque.model;

import androidx.room.ColumnInfo;
import androidx.room.Entity;
import androidx.room.Ignore;
import androidx.room.PrimaryKey;

import java.io.Serializable;
import java.util.Calendar;

@Entity
public class Insumo implements Serializable {

    @PrimaryKey(autoGenerate = true)
    private Long id;

    @ColumnInfo(name = "UNIDADE")
    private String unidade;

    @ColumnInfo(name = "NOME")
    private String nome;

    @ColumnInfo(name = "ESOTQUE_ATUAL")
    private double estoqueAtual;

    @Ignore
    private Calendar dataUltimaAtualizacao;

    public Insumo(String nome, String unidade, double estoqueAtual /*Calendar data*/) {
        this.nome = nome;
        this.unidade = unidade;
        this.estoqueAtual = estoqueAtual;
        //this.dataUltimaAtualizacao = data;
    }

    public String getNome() {
        return nome;
    }

    public double getEstoqueAtual() {
        return estoqueAtual;
    }

    public String getUnidade() {
        return unidade;
    }

    public Calendar getDataUltimaAtualizacao() {
        return dataUltimaAtualizacao;
    }

    public void setEstoqueAtual(double estoqueAtual) {
        this.estoqueAtual = estoqueAtual;
    }

    public void setDataUltimaAtualizacao(Calendar data) {
        this.dataUltimaAtualizacao = data;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }
}
