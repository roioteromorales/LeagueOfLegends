package com.roisoftstudio.leagueoflegends.riotapi.champion;

import org.junit.Test;

import java.util.List;

import static org.junit.Assert.assertEquals;

public class ChampionJsonParserTest {

    @Test
    public void parseShouldCreateChampionList() throws Exception {
        ChampionJsonParser parser = new ChampionJsonParser("{\"type\":\"champion\",\"version\":\"4.17.1\",\"data\":" +
                "{\"Aatrox\":{\"id\":266,\"key\":\"Aatrox\",\"name\":\"Aatrox\",\"title\":\"the Darkin Blade\"}," +
                "\"Thresh\":{\"id\":412,\"key\":\"Thresh\",\"name\":\"Thresh\",\"title\":\"the Chain Warden\"}}}");
        List<Champion> list = parser.parseToList();

        assertEquals(list.size(), 2);
    }
}