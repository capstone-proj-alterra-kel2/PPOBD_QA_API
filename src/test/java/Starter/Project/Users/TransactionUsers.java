package Starter.Project.Users;

import org.json.simple.JSONObject;

import static net.serenitybdd.rest.SerenityRest.*;

public class TransactionUsers {
    public String url,url1,token;

    public void setUrlToTransaction(){

        url="https://foodnih.com/v1/users/transactions/create";
        url1="https://foodnih.com/v1/users/transactions/history";
        token="eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJpZCI6MjYwLCJleHAiOjE2NzE4MTMwMTQsImhhc19yb2xlIjoidXNlciJ9.fMScXFlR4Ytlx3A9vl5M8KWNhad5FEyfm67aqrznDoc";
    }

    public JSONObject Transaction(){
        JSONObject body = new JSONObject();
        body.put("product_id",191);
        body.put("target_phone_number","088803707421");
        return body;
    }
    public void validTransaction() {
        given().header("accept", "application/json")
                .header("Content-Type", "application/json")
                .header("Authorization", "Bearer " + token)
                .body(Transaction().toJSONString());
        when().post(url);
    }
    public void Transactionhistory() {
        given().header("accept", "application/json")
                .header("Content-Type", "application/json")
                .header("Authorization", "Bearer " + token);
        when().get(url1);
    }

    public JSONObject Transactionnotoken(){
        JSONObject body = new JSONObject();
        body.put("product_id",191);
        body.put("target_phone_number","088803707421");
        return body;
    }
    public void validTransactionnotoken() {
        given().header("accept", "application/json")
                .header("Content-Type", "application/json")
                .body(Transactionnotoken().toJSONString());
        when().post(url);
    }
    public void Transactionhistorynotoken() {
        given().header("accept", "application/json")
                .header("Content-Type", "application/json");
        when().get(url1);
    }
    public void statusSucces() {
        then().statusCode(200);
    }
    public void statusfailed() {
        then().statusCode(400);
    }

    }


