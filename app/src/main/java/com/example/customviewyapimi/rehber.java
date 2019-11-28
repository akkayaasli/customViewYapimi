package com.example.customviewyapimi;

public class rehber
{
    String ad;
    String numara;
    int kisiResim;

    public rehber(String ad, String numara, int kisiResim) {
        this.ad = ad;
        this.numara = numara;
        this.kisiResim = kisiResim;
    }

    public String getAd() {
        return ad;
    }

    public void setAd(String ad) {
        this.ad = ad;
    }

    public String getNumara() {
        return numara;
    }

    public void setNumara(String numara) {
        this.numara = numara;
    }

    public int getKisiResim() {
        return kisiResim;
    }

    public void setKisiResim(int kisiResim) {
        this.kisiResim = kisiResim;
    }
}
