package RestAssuredPackage;


import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;
import org.testng.Assert;
import org.testng.annotations.Test;

public class GetWeather {

    @Test
    public void getWeatherResults(){

        RestAssured.baseURI="http://restapi.demoqa.com/utilities/weather/city";
        RequestSpecification httpRequest = RestAssured.given();
        Response response=httpRequest.get("/Sivas");
        System.out.println("Response Body is =>  " + response.asString());
        int statusCode = response.getStatusCode();
        Assert.assertEquals(statusCode /*actual value*/, 200 /*expected value*/, "Correct status code returned");
        System.out.println("Status code is "+statusCode);
    }
}
