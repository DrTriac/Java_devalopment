public class Biervat {
    private float capaciteitF;
    private float inhoud;

    public float getCapaciteitF() {
        return capaciteitF;
    }
    public void setCapaciteitF(float capaciteitF) {
        this.capaciteitF = capaciteitF;
    }
    public float getInhoud() {
        return inhoud;
    }
    public void setInhoud(float inhoud) {
        this.inhoud = inhoud;
    }

    public void vulVolledig()
    {
        this.inhoud=capaciteitF;
    }

    public boolean IsVol()
    {
        if(this.inhoud==capaciteitF){
            return true;
        }else{return false;}
    }

    public float tap(int aantalLiter)
    {
        inhoud = inhoud - aantalLiter;
        return inhoud;
    }
    public float percentageGevuld()
    {
        return this.capaciteitF/this.inhoud;
    }

}
