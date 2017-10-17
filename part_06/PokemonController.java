package part_06;

public class PokemonController {
    public static void main(String[] args) {
        Pokemon superDitto = new Pokemon();
        Evolution subDitto1 = new Evolution();
        Mega subDitto2 = new Mega();

        Pokemon lugia;

        lugia = superDitto;
        lugia.ditto();

        lugia = subDitto1;
        subDitto1.ditto();

        lugia = subDitto2;
        subDitto2.ditto();

        System.out.println();

        Evolution bulbassaur = new Evolution("Bulbassaur", 01, "Solar Beam", "Grass", 56,
                459, " into Ivisour", 2);


        System.out.println(bulbassaur.isPermanent(bulbassaur.getEvolve()));
        System.out.println(bulbassaur.toString());

        System.out.println();

    Evolution pikachu = new Evolution("Pikachu", 25, "Thunderbolt", "Electricity",
            45, 372, " into Raichu", 1);

        System.out.println(pikachu.isPermanent(pikachu.getEvolve()));
        System.out.println(pikachu.toString());

        System.out.println();

        Mega mewtwo = new Mega("MewTwo", 151, "Telekinesis", "Psychic", 750,
                3900,"no", 0);

        System.out.println(mewtwo.isMega("yes"));
        System.out.println(mewtwo.isPermanent(mewtwo.getEvolve()));
        System.out.println(mewtwo.toString());
        //fix this. Print out like previous 2.


    }
}
