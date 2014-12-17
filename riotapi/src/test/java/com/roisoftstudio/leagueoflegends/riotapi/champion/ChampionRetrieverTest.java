package com.roisoftstudio.leagueoflegends.riotapi.champion;

import org.junit.Test;

import java.util.List;

import static org.junit.Assert.assertTrue;

public class ChampionRetrieverTest {

    @Test
    public void canGetAllChampions() throws Exception {
        ChampionRetriever cr = new ChampionRetriever();
        List<Champion> championsList = cr.getAllChampions();
        for (Champion champion : championsList) {
            System.out.println(champion);

        }
        assertTrue(championsList.size() >= 121);//TODO Change the test something better
    }
}