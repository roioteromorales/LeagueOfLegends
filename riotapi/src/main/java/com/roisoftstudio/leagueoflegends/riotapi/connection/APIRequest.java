package com.roisoftstudio.leagueoflegends.riotapi.connection;

import java.io.IOException;
import java.net.URL;

public interface APIRequest {
    public String getRequest(URL url) throws IOException;
}
