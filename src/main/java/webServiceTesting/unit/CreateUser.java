package webServiceTesting.unit;

import io.restassured.RestAssured;
import io.restassured.specification.RequestSpecification;
import org.json.JSONObject;


public class CreateUser {

  private String name;
  private String job;
  private final RequestSpecification requestSpecification;
  private String surname;

  public CreateUser() {
    this.requestSpecification = RestAssured.given()
        .baseUri("https://reqres.in/api")
        .basePath("/users");
  }

  public RequestSpecification getRequestSpecification() {
    return requestSpecification;
  }

  public void setName(String name) {
    this.name = name;
  }

  public void setJob(String job) {
    this.job = job;
  }

  public String buildBody() {
    return new JSONObject().put("name", this.name).put("job", this.job).toString(4);
  }

  public void setSurname(String name) {
    this.surname = name;
  }

  public String buildBodyWithSurname() {
    return new JSONObject().put("name", this.surname).put("job", this.job).toString(4);
  }
}
