package stepDefinations;

import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.And;
import io.restassured.RestAssured;
import static io.restassured.RestAssured.*;

import files.payloads;
public class stepDefination {
	@Given("^Add place payload$")
	public void add_place_payload() {
	    // Write code here that turns the phrase above into concrete actions
	    RestAssured.baseURI = "https://rahulshettyacademy.com";
	    given().queryParam("key", "qaclick123").header("Content-Type","application/json").body(payloads.AddPlace())
	    .when().post("maps/api/place/add/json")
	    .then().assertThat().statusCode(200);
	}
}
