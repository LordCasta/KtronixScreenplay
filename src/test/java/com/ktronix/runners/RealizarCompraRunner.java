package com.ktronix.runners;

import com.ktronix.utils.BeforeSuite;
import com.ktronix.utils.DataToFeature;
import io.cucumber.junit.CucumberOptions;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.junit.runner.RunWith;

import java.io.IOException;

@CucumberOptions(
        features = "src/test/resources/features/",
        tags =  "@SmokeTest",
        glue = "com.ktronix.stepDefinitions",
        snippets = CucumberOptions.SnippetType.CAMELCASE
)
@RunWith(DataExcelRunner.class)

public class RealizarCompraRunner {

    @BeforeSuite
    public static void test() throws InvalidFormatException, IOException {
        DataToFeature.overrideFeatureFiles("./src/test/resources/features/realizarCompra.feature");
    }

}
