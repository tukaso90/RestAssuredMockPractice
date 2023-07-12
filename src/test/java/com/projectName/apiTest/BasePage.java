package com.projectName.apiTest;

import com.projectName.utility.ConfigurationReader;
import io.restassured.RestAssured;
import org.junit.jupiter.api.BeforeAll;

public abstract class BasePage {
    @BeforeAll
    public static void init() {
        RestAssured.baseURI = ConfigurationReader.getProperty("base_uri");
      //  RestAssured.basePath = ConfigurationReader.getProperty("base_path");
    }



}
