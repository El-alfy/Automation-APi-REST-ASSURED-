package alltask3;
import static io.restassured.RestAssured.*;
import static io.restassured.matcher.RestAssuredMatchers.*;
import static org.hamcrest.Matchers.*;
import org.testng.annotations.Test;
public class Thirdtest {

//I tried my very best to finish the incomplete points but unfortunately i stopped in this stage
    @Test
    public void  test3() {

        given().baseUri("https://jsonplaceholder.typicode.com/")
                .param("userId", "1")
                .when().get("/todos")
                .then().log().all();
                //.assertThat().body("completed",everyItem(false));
    }
}
