package ap.hu;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.*;

public class Emberek {

    List<Ember> emberek;

    public Emberek(String fajlNev){
        emberek=new ArrayList<Ember>();

        try{
            FileReader fr = new FileReader(fajlNev);
            BufferedReader br = new BufferedReader(fr);

            String sor= br.readLine();
            while(sor!=null)
            {
                Ember e = new Ember(sor);
                emberek.add(e);
                sor=br.readLine();
            }

        }
        catch (IOException ioe)
        {
            System.out.println("Hiba a fájl beolvasása során!");
        }
    }

    public int GetHonapbanDb(int ho){
        int db =0;
        for(Ember ember:emberek)
        {
            if(ember.GetSzulHo()==ho){
                db++;
            }
        }
        return db;
    }
}
