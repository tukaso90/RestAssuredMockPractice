package com.projectName.apiTest;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import static io.restassured.RestAssured.*;


public class GET_Spartan extends BasePage {

    @DisplayName("GET spartans")
    @Test
    public void test1(){

        JsonPath jsonPath =
                given()
                        .accept(ContentType.JSON)
                        .when()
                        .get("/api/spartans")
                        .then()
                        .statusCode(200)
                        .contentType(ContentType.JSON)
                        .extract().jsonPath();

    String nameFourthSpartan = jsonPath.getString("name[3]");
    Assertions.assertEquals("Paige",nameFourthSpartan);

    String nameEightSpartan = jsonPath.getString("name[7]");
    Assertions.assertEquals("Rodolfo",nameEightSpartan);








    }


}
