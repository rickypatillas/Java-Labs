package RandomEx.Challenges.InterfaceChallenge.controlers;

import RandomEx.Challenges.InterfaceChallenge.Filters.HifloFiltro;
import RandomEx.Challenges.InterfaceChallenge.Filters.KandN;
import RandomEx.Challenges.InterfaceChallenge.Filters.Stp;
import RandomEx.Challenges.InterfaceChallenge.Oils.CastrolOil;
import RandomEx.Challenges.InterfaceChallenge.Oils.MobilOil;
import RandomEx.Challenges.InterfaceChallenge.Oils.PennzOil;

public class Implementation {

    public static void main(String[] args) {

        KandN filterone = new KandN();
        MobilOil oilone = new MobilOil();
        Motorcycles cafeRacer = new Motorcycles(filterone, oilone);

        Stp filtertwo = new Stp();
        CastrolOil oiltwo = new CastrolOil();
        Motorcycles yamazaki = new Motorcycles(filtertwo, oiltwo);

        HifloFiltro filterthree = new HifloFiltro();
        PennzOil oilthree = new PennzOil();
        Motorcycles harleyBober = new Motorcycles(filterthree, oilthree);

        cafeRacer.setSolid(filterone); //i thought we had already implemented the parameters up
        cafeRacer.setViscous(oilone);

        yamazaki.setSolid(filtertwo);
        yamazaki.setViscous(oiltwo);

        harleyBober.setSolid(filterthree);
        harleyBober.setViscous(oilthree);




    }
}
