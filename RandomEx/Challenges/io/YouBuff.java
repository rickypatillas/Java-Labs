package RandomEx.Challenges.io;

//import javax.imageio.IIOException;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class YouBuff {
    public static void main(String[] args) {

        ArrayList<Pojo> data = getData();

        for(Pojo x : data){
            System.out.println(x.getFirstName());
        }

        double totalAway = getTotalNumAwayGames(data);
        System.out.println("Total away games were " + totalAway);
    }

    public static double getTotalNumAwayGames(ArrayList<Pojo> data){

        double val = 0;

        for(Pojo x : data){
            val += x.getTotalAwayGames();
        }

        return val;
    }

    public static ArrayList<Pojo> getData(){

        ArrayList<Pojo> resultList = new ArrayList<>();

        String coconut;
        String path = "/home/ricardo/CodingNomads/downld_articles/lfc_win_ratios.csv";

        try (BufferedReader br = new BufferedReader(new FileReader(path))) {
            while ((coconut = br.readLine()) != null) {
                Pojo data = new Pojo();

                try {
                    String[] vals = coconut.split(",");
                    data.setFirstName(vals[0]);
                    data.setLastName(vals[1]);
                    data.setTotalHomeWins(Double.parseDouble(vals[2]));
                    data.setTotalHomeGames(Double.parseDouble(vals[3]));
                    data.setTotalAwayWins(Double.parseDouble(vals[4]));
                    data.setTotalAwayGames(Double.parseDouble(vals[5]));
                    data.setHomeOdds(Double.parseDouble(vals[6]));
                    data.setAwayOdds(Double.parseDouble(vals[7]));
                    data.setLogOdds(Double.parseDouble(vals[8]));
                } catch (NumberFormatException ex){
                    System.out.println(ex.toString());
                }


                resultList.add(data);
            }

        } catch (IOException meme) {
            System.out.println("I/O Error: " + meme);

        }
        return resultList;

    }
}
