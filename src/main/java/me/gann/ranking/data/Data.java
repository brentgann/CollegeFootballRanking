package me.gann.ranking.data;

import me.gann.ranking.constants.CollegeFootballTeam;
import me.gann.ranking.team.Team;
import me.gann.ranking.team.TeamMap;

import java.io.File;
import java.util.List;

/**
 * Created by BGann on 8/24/14.
 */
public class Data {

    private CollegeFootballTeam[] teams = CollegeFootballTeam.values();

    public void readInFiles(){

    }

    public void saveFiles(){

        for(Integer year : TeamMap.getYears()){
             Boolean success = (new File(String.valueOf(year))).mkdirs();
            for(CollegeFootballTeam cfTeam : TeamMap.getTeamMapForYear(year).keySet()){

            }
        }

    }

    public void saveFile(CollegeFootballTeam team){

    }

    public void readFile(CollegeFootballTeam team){

    }

}
