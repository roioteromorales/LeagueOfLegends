package com.roisoftstudio.leagueoflegends.riotapi.connection;


import org.apache.commons.io.IOUtils;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;

public class HttpRequest implements APIRequest {


    public String getRequest(URL url) throws IOException {
        HttpURLConnection connection = null;
        try {
            connection = (HttpURLConnection) url.openConnection();
            connection.connect();
            return IOUtils.toString(connection.getInputStream());

        } finally {
            if (connection != null) {
                connection.disconnect();
            }
        }
    }
}
