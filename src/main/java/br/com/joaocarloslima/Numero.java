package br.com.joaocarloslima;

public class Numero {
    
    private int limite;
    private int valor;

    public Numero(int limite) {
        this.limite = limite;
    }

    public void incrementar() {
        if(valor <= limite) {
            valor++;
        }else {
            valor = 0;
        }
    }

    public void decrementar() {
        if(valor > 0) {
            valor--;
        }else {
            valor = 0;
        }
    }

    public String getValorFormatado() {
        String vString = Integer.toString(valor);
        if(valor < 10) {
            vString = "0" + valor; 
        }
        return vString;
    }

    public int getLimite() {
        return limite;
    }

    public void setLimite(int limite) {
        this.limite = limite;
    }

    public int getValor() {
        return valor;
    }

    public void setValor(int valor) {
        this.valor = valor;
    }

}
