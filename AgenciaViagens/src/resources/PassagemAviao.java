package resources;

public class PassagemAviao implements I_Item {
    private String origem;
    private String destino;
    private Double txEmbarque;
    private Double precoPassagem;

    @Override
    public Double calcularPreco() {
        return this.txEmbarque+this.precoPassagem;
    }

    public String getOrigem() {
        return origem;
    }

    public void setOrigem(String origem) {
        this.origem = origem;
    }

    public String getDestino() {
        return destino;
    }

    public void setDestino(String destino) {
        this.destino = destino;
    }

    public Double getTxEmbarque() {
        return txEmbarque;
    }

    public void setTxEmbarque(Double txEmbarque) {
        this.txEmbarque = txEmbarque;
    }

    public Double getPrecoPassagem() {
        return precoPassagem;
    }

    public void setPrecoPassagem(Double precoPassagem) {
        this.precoPassagem = precoPassagem;
    }
}
