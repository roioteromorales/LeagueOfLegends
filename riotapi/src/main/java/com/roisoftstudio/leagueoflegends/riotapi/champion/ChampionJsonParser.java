package com.roisoftstudio.leagueoflegends.riotapi.champion;

import org.json.JSONObject;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

public class ChampionJsonParser {
    private JSONObject fullChampionsJSON;

    public ChampionJsonParser(String fullChampionsJSON) {
        this.fullChampionsJSON = new JSONObject(fullChampionsJSON);
    }

    public List<Champion> parseToList() {
        List<Champion> championList = new ArrayList<Champion>();

        fullChampionsJSON = getData(fullChampionsJSON);


        Set<String> set = fullChampionsJSON.keySet();//TODO check how to avoid unchecked cast.
        for (String champString : set) {
            championList.add(createChampionFromJSON(fullChampionsJSON.getJSONObject(champString)));
        }
        return championList;
    }

    private Champion createChampionFromJSON(JSONObject champJson) {
        return new Champion(champJson.getInt("id"))
                .withKey(champJson.getString("key"))
                .withName(champJson.getString("name"))
                .withTitle(champJson.getString("title"));
    }

    private JSONObject getData(JSONObject fullChampionsJSON) {
        return fullChampionsJSON.getJSONObject("data");
    }


}