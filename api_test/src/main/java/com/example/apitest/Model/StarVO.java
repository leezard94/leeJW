package com.example.apitest.Model;

public class StarVO {
    private String id; //id
    private String race;  // -->> race(종족)
    private String ladder;  // -->  ladder(점수)
    private String map;  //--> map(맵)

    public StarVO(String id, String race, String ladder, String map){
        super();
        this.id = id;
        this.race = race;
        this.ladder = ladder;
        this.map = map;

    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getRace() {
        return race;
    }

    public void setRace(String race) {
        this.race = race;
    }

    public String getLadder() {
        return ladder;
    }

    public void setLadder(String ladder) {
        this.ladder = ladder;
    }

    public String getMap() {
        return map;
    }

    public void setMap(String map) {
        this.map = map;
    }
}
