package com.roisoftstudio.leagueoflegends.riotapi.connection;


import com.roisoftstudio.leagueoflegends.riotapi.RiotAPI;

import java.net.MalformedURLException;
import java.net.URL;
//        champion
//        /api/lol/{region}/v1.2/champion
//        /api/lol/{region}/v1.2/champion/{id}

//        //game
//        /api/lol/{region}/v1.3/game/by-summoner/{summonerId}/recent

//        //league
//        /api/lol/{region}/v2.5/league/by-summoner/{summonerIds}
//        /api/lol/{region}/v2.5/league/by-summoner/{summonerIds}/entry
//        /api/lol/{region}/v2.5/league/by-team/{teamIds}
//        /api/lol/{region}/v2.5/league/by-team/{teamIds}/entry
//        /api/lol/{region}/v2.5/league/challenger

//        //match
//        /api/lol/{region}/v2.2/match/{matchId}

//        //match history
//        /api/lol/{region}/v2.2/matchhistory/{summonerId}

//        //stats
//        /api/lol/{region}/v1.3/stats/by-summoner/{summonerId}/ranked
//        /api/lol/{region}/v1.3/stats/by-summoner/{summonerId}/summary

//        //summoner
//        /api/lol/{region}/v1.4/summoner/by-name/{summonerNames}
//        /api/lol/{region}/v1.4/summoner/{summonerIds}
//        /api/lol/{region}/v1.4/summoner/{summonerIds}/masteries
//        /api/lol/{region}/v1.4/summoner/{summonerIds}/name
//        /api/lol/{region}/v1.4/summoner/{summonerIds}/runes

//        //teams
//        /api/lol/{region}/v2.4/team/by-summoner/{summonerIds}
//        /api/lol/{region}/v2.4/team/{teamIds}

//        static
//        /api/lol/static-data/{region}/v1.2/champion
//        /api/lol/static-data/{region}/v1.2/champion/{id}
//        /api/lol/static-data/{region}/v1.2/item
//        /api/lol/static-data/{region}/v1.2/item/{id}
//        /api/lol/static-data/{region}/v1.2/mastery
//        /api/lol/static-data/{region}/v1.2/mastery/{id}
//        /api/lol/static-data/{region}/v1.2/realm
//        /api/lol/static-data/{region}/v1.2/rune
//        /api/lol/static-data/{region}/v1.2/rune/{id}
//        /api/lol/static-data/{region}/v1.2/summoner-spell
//        /api/lol/static-data/{region}/v1.2/summoner-spell/{id}
//        /api/lol/static-data/{region}/v1.2/versions

//        //status
//        /shards
//        /shards/{region}

//

public class ApiURLBuilder {
    private String region;

    ////all,allytips,altimages,blurb,enemytips,image,info,lore,partype,passive,recommended,skins,spells,stats,tags


    public ApiURLBuilder(String region) {
        this.region = region;
    }

    public URL buildBasicStaticChampion(String champData) throws MalformedURLException {
        return new URL(getGlobalPrefix() + "/v1.2/champion?champData=" + champData + "&api_key=" + RiotAPI.API_KEY);
    }

    private String getGlobalPrefix() {
        return "https://global.api.pvp.net/api/lol/static-data/" + region;
    }
}
