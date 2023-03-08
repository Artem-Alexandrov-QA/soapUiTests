package com.alexandrov;

import com.alexandrov.specs.RequestSpecs;
import com.alexandrov.specs.ResponseSpecs;
import io.restassured.response.Response;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import java.io.IOException;


import static org.junit.jupiter.api.Assertions.assertTrue;

public class SoapTest extends TestBase {

    public SoapTest() throws IOException {
    }

    @Test
    void getCountriesTest() throws Exception {
        Response response = RequestSpecs.requestSpecification
            .body(request)
            .when()
            .post("get/country")
            .then()
            .spec(ResponseSpecs.response)
            .extract().response();

        Assertions.assertAll(
                () -> assertTrue(response.asString().contains("Spain")),
                () -> assertTrue(response.asString().contains("Madrid")),
                () -> assertTrue(response.asString().contains("EUR")),
                () -> assertTrue(response.asString().contains("46704314"))
        );
    }
}