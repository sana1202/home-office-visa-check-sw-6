package gov.uk.check.visa.steps;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.Then;

import java.util.List;

public class CountryDropDowmSteps {
    @Then("I can see following country into dropdown")
    public void iCanSeeFollowingCountryIntoDropdown(DataTable dataTable) {

        System.out.println("-------------------------------");
        System.out.println("        COUNTRY LIST           ");
        System.out.println("-------------------------------");

        List<List<String>> countryList =  dataTable.asLists(String.class);
        for (List<String> list : countryList ) {
            System.out.println(list.get(0));
        }
        System.out.println("-------------------------------");
    }
}
