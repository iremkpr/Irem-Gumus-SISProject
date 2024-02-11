package sis.steps;

import io.cucumber.java.en.Given;
import sis.utils.DbUtils;

public class db {

@Given("I am connected to the database")
public void i_am_connected_to_the_database() {
    // Write code here that turns the phrase above into concrete actions
    DbUtils.getConnection();
}


}
