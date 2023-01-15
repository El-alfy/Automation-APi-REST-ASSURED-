package alltask3;

import static io.restassured.RestAssured.*;
import static io.restassured.matcher.RestAssuredMatchers.*;
import static org.hamcrest.Matchers.*;
import org.testng.annotations.Test;
public class Secondtest {


//I tried my very best to finish the incomplete points but unfortunately i stopped in this stage
    @Test
    public void  test2(){

        given().baseUri("https://jsonplaceholder.typicode.com/")
                .param("userId", "1")
                .when().get("/albums")
                .then().log().all()
                //.assertThat().body("title",hasSize(300))
                .assertThat().statusCode(200);;


    }
}
