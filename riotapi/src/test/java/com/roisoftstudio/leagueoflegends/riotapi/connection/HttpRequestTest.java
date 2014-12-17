package com.roisoftstudio.leagueoflegends.riotapi.connection;

import org.junit.Test;

import java.io.IOException;
import java.net.URL;

import static org.junit.Assert.assertEquals;

public class HttpRequestTest {

    @Test
    public void httpRequest() throws Exception {

        String targetUrl = "https://global.api.pvp.net/api/lol/static-data/euw/v1.2/champion/1?api_key=920ff182-c156-413c-a828-da416d1eb3b2\n";
        String response = new HttpRequest().getRequest(new URL(targetUrl));
        String expected = "{\"id\":1,\"key\":\"Annie\",\"name\":\"Annie\",\"title\":\"the Dark Child\"}";
        assertEquals(expected, response);
    }

    @Test(expected = IOException.class)
    public void httpRequestThrowIOExceptionWithMalformedURL() throws Exception {
        new HttpRequest().getRequest(new URL("hfgp://xx"));
    }
}