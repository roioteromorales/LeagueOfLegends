package com.roisoftstudio.leagueoflegends.riotapi.champion;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ChampionTest {

    @Test
    public void canCreateChampion() throws Exception {
        Champion c = new Champion(266);

        assertEquals(266, c.getId());
    }
}