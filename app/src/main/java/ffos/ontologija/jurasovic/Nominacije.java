package ffos.ontologija.jurasovic;

import java.io.Serializable;

public class Nominacije implements Serializable {

    private int sifra;

    private String glumac;

    private String film;

    private String nagrada;

    private String mjesto;

    private String godina;

    private String dobioNagradu;

    public Nominacije() {
        this.sifra = sifra;
        this.glumac = glumac;
        this.film = film;
        this.nagrada = nagrada;
        this.mjesto = mjesto;
        this.godina = godina;
        this.dobioNagradu = dobioNagradu;
    }

    public int getSifra() {
        return sifra;
    }

    public void setSifra(int sifra) {
        this.sifra = sifra;
    }

    public String getGlumac() {
        return glumac;
    }

    public void setGlumac(String glumac) {
        this.glumac = glumac;
    }

    public String getFilm() {
        return film;
    }

    public void setFilm(String film) {
        this.film = film;
    }

    public String getNagrada() {
        return nagrada;
    }

    public void setNagrada(String nagrada) {
        this.nagrada = nagrada;
    }

    public String getMjesto() {
        return mjesto;
    }

    public void setMjesto(String mjesto) {
        this.mjesto = mjesto;
    }

    public String getGodina() {
        return godina;
    }

    public void setGodina(String godina) {
        this.godina = godina;
    }

    public String getDobioNagradu() {
        return dobioNagradu;
    }

    public void setDobioNagradu(String dobioNagradu) {
        this.dobioNagradu = dobioNagradu;
    }

}
