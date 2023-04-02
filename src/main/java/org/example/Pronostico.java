package org.example;

public class Pronostico {
    private Partido partido;

    private Equipo equipo;

    private ResultadosEnum pronosticoResultado;

    public Pronostico(Partido partido, Equipo equipo, ResultadosEnum pronosticoResultado) {
        this.partido = partido;
        this.equipo = equipo;
        this.pronosticoResultado = pronosticoResultado;
    }

    public Partido getPartido() {
        return partido;
    }

    public void setPartido(Partido partido) {
        this.partido = partido;
    }

    public Equipo getEquipo() {
        return equipo;
    }

    public void setEquipo(Equipo equipo) {
        this.equipo = equipo;
    }

    public ResultadosEnum getpronosticoResultado() {
        return pronosticoResultado;
    }

    public void setpronosticoResultado(ResultadosEnum pronosticoResultado) {
        this.pronosticoResultado = pronosticoResultado;
    }

        public int puntos(){
//        if pronostico=resulktado
//           puntos ++
            int puntos=0;
            if(this.pronosticoResultado.equals(partido.resultado(this.equipo))) {
                puntos++;
                    return puntos;
            }

        return 0;
    }

}
