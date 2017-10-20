package RandomEx.Challenges.InterfaceChallenge.controlers;

import RandomEx.Challenges.InterfaceChallenge.Interface.OilFilters;
import RandomEx.Challenges.InterfaceChallenge.Interface.TypeOil;

public class Motorcycles {

    private OilFilters solid;
    private TypeOil viscous;

    public Motorcycles(){

    }

    public Motorcycles(OilFilters solid, TypeOil viscous){
        this.solid = solid;
        this.viscous = viscous;
    }

    public OilFilters getSolid() {
        return solid;
    }

    public void setSolid(OilFilters solid) {
        this.solid = solid;
    }

    public TypeOil getViscous() {
        return viscous;
    }

    public void setViscous(TypeOil viscous) {
        this.viscous = viscous;
    }
}
