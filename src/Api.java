import com.google.gson.Gson;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

public class Api {
    Moneda callApi(String baseCode, String targetCode, double amount){

        URI direccion = URI.create("https://v6.exchangerate-api.com/v6/56a13e4a300e9e32e89d7391/pair/" + baseCode + "/" + targetCode + "/" + amount);
        HttpClient client = HttpClient.newHttpClient();

        HttpRequest request = HttpRequest.newBuilder()
                .uri(direccion)
                .build();
        HttpResponse<String> response = null;
        try {
            response = client
                    .send(request, HttpResponse.BodyHandlers.ofString());
        } catch (IOException | InterruptedException e) {
            throw new RuntimeException(e);
        }

        return new Gson().fromJson(response.body(), Moneda.class);
    }
}
