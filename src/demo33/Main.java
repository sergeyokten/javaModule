package demo33;

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


    }
}
