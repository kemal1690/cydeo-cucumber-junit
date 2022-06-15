package com.cydeo.step_definitions;
/*
In this class we'll be able to pass pre- & post- conditions to each scenario and step
 */

import io.cucumber.java.After;
import io.cucumber.java.AfterStep;
import io.cucumber.java.Before;
import io.cucumber.java.BeforeStep;

public class Hooks {

    @Before(order = 1)//this is from io.cucumber.java, not from junit
    public void setupScenario(){

        System.out.println("====Setting up browser using cucumber @Before");
    }

    @Before(value = "@login",order = 2)
    //this will be implemented in the scenario has the @login tag
    public void setupScenarioForLogins(){

        System.out.println("====this will only be applied to scenarios that has @login tag");

    }

    @Before(value = "@db",order = 0)
    public void setupForDatabaseScenarios(){

        System.out.println("====this will only be applied to scenario that has @db tag");

    }

    @After
    public void teardownScenario(){

        System.out.println("====Closing browser using cucumber @After");
        System.out.println("====Scenario ended/ Take screenshot if failed");
    }

    @BeforeStep
    public void setupStep(){

        System.out.println("-----------applying setup using @BeforeStep");
    }

    @AfterStep
    public void afterStep(){

        System.out.println("------>appling tearDown using @afterStep");
    }










}
