package ru.malkollm.springbootbackend.service;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import ru.malkollm.springbootbackend.model.PicnicArea;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;

//TODO вынести подключение к API в отдельный класс
public class PicnicAreaService {
    public void getPicnicAreaFromOD() throws IOException, JSONException {
        String url = "https://data.admhmao.ru/api/data/?id=1933871";

        URL obj = new URL(url);
        HttpURLConnection connection = (HttpURLConnection) obj.openConnection();

        connection.setRequestMethod("GET");

        BufferedReader in = new BufferedReader(new InputStreamReader(connection.getInputStream()));
        String inputLine;
        StringBuilder response = new StringBuilder();

        while ((inputLine = in.readLine()) != null) {
            response.append(inputLine);
        }
        in.close();

        JSONObject jsonObj = new JSONObject(response.toString()); //весь полученный объект
        JSONArray jsonArray = jsonObj.getJSONArray("Items"); //обращение к массиву Items

        for (int i = 0; i < jsonArray.length(); i++) {
            JSONObject items = (JSONObject) jsonArray.get(i); //перебор элементов массива Items
            JSONObject cells = new JSONObject(items.get("Cells").toString()); //обращение к объекту Cells

            PicnicArea picnicArea = new PicnicArea(
                    (String) jsonObj.get("name"),
                    0,
                    (String) cells.get("NAME_PICNIC"),
                    (String) cells.get("ADDRESS_LANDMARK"),
                    (String) cells.get("SERVICE_PROVIDER"),
                    (String) cells.get("PHONE"),
                    (String) cells.get("THE_PHOTO"),
                    (String) cells.get("GEOOBJECT_NAME"),
                    (String) cells.get("GEOCOORD")
            );

            System.out.println(picnicArea.getNameSet() + " " + picnicArea.getServiceProvider());
        }


    }
}
