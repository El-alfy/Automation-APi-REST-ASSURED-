package alltask3;

import static io.restassured.RestAssured.*;
import static io.restassured.matcher.RestAssuredMatchers.*;
import static org.hamcrest.Matchers.*;
import org.testng.annotations.Test;

public class Firsttest {



    @Test
    public void  test(){

                given().baseUri("https://jsonplaceholder.typicode.com/")
                        .param("postId", "6")
                .when().get("/comments")
                .then().log().all();


    }
}
