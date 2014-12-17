package com.roisoftstudio.leagueoflegends.riotapi.connection;


import com.roisoftstudio.leagueoflegends.riotapi.champion.ChampData;
import com.roisoftstudio.leagueoflegends.riotapi.configuration.Region;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ApiURLBuilderTest {

    @Test
    public void staticChampionURL() throws Exception {
        ApiURLBuilder urlCreator = new ApiURLBuilder(Region.EU_WEST);
        assertEquals("https://global.api.pvp.net/api/lol/static-data/euw/v1.2/champion?champData=&api_key=920ff182-c156-413c-a828-da416d1eb3b2",
                urlCreator.buildBasicStaticChampion("").toString());
    }

    @Test
    public void staticChampionURLWithMultipleParameters() throws Exception {
        ApiURLBuilder urlCreator = new ApiURLBuilder(Region.EU_WEST);
        assertEquals("https://global.api.pvp.net/api/lol/static-data/euw/v1.2/champion?champData=enemytips,altimages&api_key=920ff182-c156-413c-a828-da416d1eb3b2",
                urlCreator.buildBasicStaticChampion(ChampData.ENEMYTIPS + ChampData.SEPARATOR + ChampData.ALTIMAGES).toString());
    }
}