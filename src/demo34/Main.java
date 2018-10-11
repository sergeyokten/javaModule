package demo34;

import org.json.JSONArray;
import org.json.JSONObject;

import java.io.IOException;
import java.io.InputStream;
import java.net.HttpURLConnection;
import java.net.URL;

public class Main {
    public static void main(String[] args) throws IOException {
        URL url = new URL("http://localhost:3000/users");
        HttpURLConnection urlConnection = (HttpURLConnection) url.openConnection();
        urlConnection.setRequestMethod("GET");
        InputStream inputStream = urlConnection.getInputStream();
        int size = inputStream.available();
        byte[] bytes = new byte[size];
        inputStream.read(bytes);

        String response = new String(bytes);
        System.out.println(response);


        JSONArray jsonArray = new JSONArray(response);
        System.out.println(jsonArray.length());
        for (int i = 0; i < jsonArray.length(); i++) {
            JSONObject o = (JSONObject) jsonArray.get(i);
            System.out.println(o.get("name") + " " + o.get("id"));

        }


    }
}
