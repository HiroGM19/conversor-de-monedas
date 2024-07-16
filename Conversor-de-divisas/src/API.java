
import com.google.gson.Gson;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

public class API {
    public  SolicitarAPI consultarMoneda (String monedaBase, String monedaConvertir, double cantidadConvertir) {
        String APIKey = "8bb2e63fba14b4e59b84f160";
        HttpClient client = HttpClient.newHttpClient();
        HttpRequest request = HttpRequest.newBuilder()
                .uri(URI.create("https://v6.exchangerate-api.com/v6/" + APIKey + "/pair/" + monedaBase + "/" + monedaConvertir + "/" + cantidadConvertir))
                .build();
        try {
            HttpResponse<String> response = client
                    .send(request, HttpResponse.BodyHandlers.ofString());
           return new Gson().fromJson(response.body(), SolicitarAPI.class);

        } catch (Exception e) {
            throw new RuntimeException("Divisa no encontrada");
        }
    }
}
