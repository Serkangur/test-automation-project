package Base;


import io.restassured.RestAssured;


public class BaseTest extends Base.BaseLibrary {


    public void BeforeTest(){
        RestAssured.baseURI = URL;
    }
}
