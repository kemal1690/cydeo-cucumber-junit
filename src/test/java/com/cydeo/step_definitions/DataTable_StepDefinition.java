package com.cydeo.step_definitions;

import io.cucumber.java.en.Then;

import java.util.List;

public class DataTable_StepDefinition {

    //We run the CukesRunner Class then copy paste the snippet here
    @Then("user should see fruits I like")
    public void user_should_see_fruits_ı_like(List<String>fruits) {

        System.out.println(fruits);
        System.out.println(fruits.get(1));


    }
}