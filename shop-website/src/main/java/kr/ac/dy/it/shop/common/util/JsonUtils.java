package kr.ac.dy.it.shop.common.util;

import com.google.gson.Gson;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;
import lombok.extern.slf4j.Slf4j;

/**
 * Created by PARK on 2017-02-11.
 */
@Slf4j
public class JsonUtils {

    private static final String REQUEST_BODY = "body";

    public static <T> T bodyStringToClass(String jsonString, Class<T> classOfT) {

        JsonObject jsonObject = new JsonParser().parse(jsonString).getAsJsonObject();
        return (new Gson()).fromJson(jsonObject.get(REQUEST_BODY).getAsJsonObject(), classOfT);

    }


}
