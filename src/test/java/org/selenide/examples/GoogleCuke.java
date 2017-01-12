package org.selenide.examples;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.Before;
import org.junit.runner.RunWith;

import java.lang.management.ManagementFactory;

@RunWith(Cucumber.class)
@CucumberOptions(strict = true,
        features = {"classpath:src/test/resources/features"},
        format = {"json:target/cucumber-parallel/GoogleCuke.json", "html:target/cucumber-parallel/GoogleCuke.html", "pretty"},
        tags = {"~@ignored"},
        glue = { "src/test/java/org.selenide.examples" })
public class GoogleCuke
{
    @Before
    public void beforeTest()
    {
        long threadId = Thread.currentThread().getId();
        String processName = ManagementFactory.getRuntimeMXBean().getName();
        System.out.println("Started in thread: " + threadId + ", in JVM: " + processName);
    }

}
