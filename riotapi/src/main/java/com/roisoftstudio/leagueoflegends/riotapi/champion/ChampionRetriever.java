package com.roisoftstudio.leagueoflegends.riotapi.champion;


import com.roisoftstudio.leagueoflegends.riotapi.configuration.Region;
import com.roisoftstudio.leagueoflegends.riotapi.connection.ApiURLBuilder;
import com.roisoftstudio.leagueoflegends.riotapi.connection.HttpRequest;

import java.io.IOException;
import java.net.URL;
import java.util.List;

public class ChampionRetriever extends HttpRequest {

    public List<Champion> getAllChampions() {
        try {
            URL championURL = new ApiURLBuilder(Region.EU_WEST).buildBasicStaticChampion("");
            return new ChampionJsonParser(getRequest(championURL)).parseToList();
        } catch (IOException e) {
            e.printStackTrace();
            return null;
        }
    }

}
