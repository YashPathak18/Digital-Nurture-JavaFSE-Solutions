package networking;

import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

public class HttpClientExample {

    public static void main(String[] args) {

        try {

            HttpClient client =
                    HttpClient.newHttpClient();

            HttpRequest request =
                    HttpRequest.newBuilder()
                            .uri(
                                    URI.create(
                                            "https://api.github.com"
                                    )
                            )
                            .GET()
                            .build();

            HttpResponse<String> response =
                    client.send(
                            request,
                            HttpResponse.BodyHandlers.ofString()
                    );

            System.out.println(
                    "Response Status Code: "
                            + response.statusCode()
            );

            System.out.println(
                    "\nResponse Body:\n"
                            + response.body()
            );

        } catch (Exception e) {

            System.out.println(
                    "HTTP Request Error: "
                            + e.getMessage()
            );
        }
    }
}