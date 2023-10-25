package ru.netology.rest;
import org.junit.jupiter.api.Test;

import static io.restassured.RestAssured.given;
import static org.hamcrest.Matchers.equalTo;

public class Test1 {
    @Test
    void Test01() {
        given()
                .baseUri("https://postman-echo.com")
                .body("winter")
                .when()
                .post("/post")
                .then()
                .statusCode(200)
                .body("data", equalTo("winter"));
    }
}
