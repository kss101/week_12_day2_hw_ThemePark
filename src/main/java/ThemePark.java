import attractions.Attraction;
import behaviours.IReviewed;
import stalls.Stall;

import java.util.ArrayList;

public class ThemePark {
    private String name;
    private ArrayList<Attraction> attractions;
    private ArrayList<Stall> stalls;

    public ThemePark( String name){
        this.attractions = new ArrayList<>();
        this.stalls = new ArrayList<>();
        this.name = name;
    }

    public String getName(){
        return name;
    }

    public void addAttraction(Attraction newAttraction){
        attractions.add(newAttraction);
    }

    public ArrayList<Attraction> getAttractions(){
        return attractions;
    }

    public void addStall(Stall newStall){
        stalls.add(newStall);
    }

    public ArrayList<Stall> getStalls(){
        return stalls;
    }

}
