package ap.hu;

import java.time.LocalDate;

public class Ember {
    String nev;
    LocalDate szulDatum;
    String szulHely;

    public Ember(String sor)
    {
        String[] adat = sor.split(";");
        String nev = adat[0];
        String[] szulDatumS = adat[1].split("-");
        LocalDate szulDatum = LocalDate.of(Integer.parseInt(szulDatumS[0]),
                Integer.parseInt(szulDatumS[1]),
                Integer.parseInt(szulDatumS[2]));
        String szulHely = adat[2];
        this.nev=nev;
        this.szulDatum=szulDatum;
        this.szulHely=szulHely;
    }

    public int GetSzulEv()
    {
        return this.szulDatum.getYear();
    }
    public int GetSzulHo()
    {
        return this.szulDatum.getMonthValue();
    }
    public int GetSzulNap()
    {
        return this.szulDatum.getDayOfMonth();
    }

    public int GetKor()
    {
        return LocalDate.now().getYear()-this.szulDatum.getYear();
    }

    public String ToString()
    {
        return String.format("%s\t%s\t%s",this.nev,this.szulDatum,this.szulHely);
    }
}
