package com.SelfTests.StepDefinitions;

import com.SelfTests.DriverInstance;
import com.SelfTests.MapZoomControlsPO;
import com.SelfTests.TestAssert;
import cucumber.api.PendingException;
import cucumber.api.java.en.And;
import cucumber.api.java.en.When;
import cucumber.api.java.it.Ma;

public class MapZoomControls_step extends DriverInstance {
    private MapZoomControlsPO zoom = new MapZoomControlsPO(driver);
    TestAssert testAssert;


    @When("^User navigate to \"([^\"]*)\" page$")
    public void userNavigateToPage(String MapZoom) throws Throwable {
        zoom.mapZoomPage(MapZoom);
    }

    @And("^User control the first map section$")
    public void userControlTheFirstMapSection() throws Throwable{
        zoom.enlarge();
    }

    @And("^User control the second map section$")
    public void userControlTheSecondMapSection() throws Throwable{
        zoom.reduced();
    }
}
