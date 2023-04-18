package no.Kristiania.http;

import org.junit.jupiter.api.Test;
import java.io.IOException;
import java.util.List;


import static org.junit.jupiter.api.Assertions.assertEquals;

public class ProductTest {

    private final HttpServer server = new HttpServer(0);

    public ProductTest() throws IOException {
    }

    @Test
    void ReturnCategoryFromServer() throws IOException {
        server.setCategory(List.of("Jacket"));

        HttpClient client = new HttpClient("localhost", server.getPort(), "/api/categoryOptions");
        assertEquals("<option value=Jacket>Jacket</option><option value=Pants>Pants</option>",
                client.getMessageBody()
        );

    }

    @Test
    void shouldCreateNewProduct() throws IOException {
        HttpPostClient postClient = new HttpPostClient(
                "localhost",
                server.getPort(),
                "/api/newProduct",
                "Category=Jacket&Name=Test"
        );
        assertEquals(200, postClient.getStatusCode());
        Product product = server.getProducts().get(0);
        assertEquals(null, product.getName());
    }
}
