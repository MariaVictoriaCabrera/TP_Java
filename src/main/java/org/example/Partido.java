package org.example;

public class Partido {

    private Equipo equipo1;
    private Equipo equipo2;

    private int golesEquipo1;
    private int golesEquipo2;

    public Partido(Equipo equipo1, Equipo equipo2, int golesEquipo1, int golesEquipo2) {
        this.equipo1 = equipo1;
        this.equipo2 = equipo2;
        this.golesEquipo1 = golesEquipo1;
        this.golesEquipo2 = golesEquipo2;
    }

    public ResultadosEnum resultado(Equipo equipo) {
        if (equipo.equals(equipo1)) {
            if (golesEquipo1 > golesEquipo2) {
                ResultadosEnum ganador = ResultadosEnum.GANADOR;
                return ganador;
            }
        }
        if (equipo.equals(equipo1)) {
            if (golesEquipo1 < golesEquipo2) {
                ResultadosEnum perdedor = ResultadosEnum.PERDEDOR;
                return perdedor;
            }
        }
        if (equipo.equals(equipo2)) {
            if (golesEquipo1 < golesEquipo2) {
                ResultadosEnum ganador = ResultadosEnum.GANADOR;
                return ganador;
            }
        }
        if (equipo.equals(equipo2)) {
            if (golesEquipo1 > golesEquipo2) {
                ResultadosEnum perdedor = ResultadosEnum.PERDEDOR;
                return perdedor;
            }
        }
        return null;
    }




    public Equipo getEquipo1() {
        return equipo1;
    }

    public void setEquipo1(Equipo equipo1) {
        this.equipo1 = equipo1;
    }
}
