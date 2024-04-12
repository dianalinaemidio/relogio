package br.com.joaocarloslima;

public class Timer {

    protected Numero horas = new Numero(24);
    protected Numero minutos = new Numero(60);
    protected Numero segundos = new Numero(60 - 1);
    protected boolean regressivo;
    protected boolean ligado;

    public Timer() {}

    public Timer(int minutos) {
        this.minutos.setValor(minutos);
    }

    public void start() {
        ligado = true;
    }
    
    public void stop() {
        ligado = false;
    }

    public void setTempo(int mins) {
        if(mins >= 60) {
            int h = mins / 60;
            for(int i = 0; i != h; i++) {
                mins -= 60;
            }
            horas.setValor(h);
        }
        minutos.setValor(mins);
    }

    public void tick() {
        // toda vez que ele bater no limite ele tem que atualizar os valores
        if(ligado) {
            if(!regressivo) {
                segundos.incrementar();
                if(segundos.getValor() == segundos.getLimite()) {
                    minutos.incrementar();
                    if(minutos.getValor() == minutos.getLimite()) {
                        horas.incrementar();
                    }
                }
            }else {
                segundos.decrementar();
                if(segundos.getValor() == segundos.getLimite()) {
                    minutos.decrementar();
                    if(minutos.getValor() == minutos.getLimite()) {
                        horas.decrementar();
                    }
                }
            }
        }
    }

    public Numero getHoras() {
        return horas;
    }

    public void setHoras(Numero horas) {
        this.horas = horas;
    }

    public Numero getMinutos() {
        return minutos;
    }

    public void setMinutos(Numero minutos) {
        this.minutos = minutos;
    }

    public Numero getSegundos() {
        return segundos;
    }

    public void setSegundos(Numero segundos) {
        this.segundos = segundos;
    }

    public boolean isRegressivo() {
        return regressivo;
    }

    public boolean isIniciando() {
        return ligado;
    }

    public void setIniciando(boolean iniciando) {
        this.ligado = iniciando;
    }

}
