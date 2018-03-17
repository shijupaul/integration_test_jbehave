package com.shiju.test;

import com.shiju.test.steps.TestServiceIntegrationSteps;
import de.codecentric.jbehave.junit.monitoring.JUnitReportingRunner;
import net.thucydides.jbehave.ThucydidesJUnitStories;
import org.jbehave.core.steps.InjectableStepsFactory;
import org.jbehave.core.steps.InstanceStepsFactory;

public class TestServiceIntegration extends ThucydidesJUnitStories {

    public TestServiceIntegration() {
        JUnitReportingRunner.recommandedControls(configuredEmbedder());
    }

    @Override
    public InjectableStepsFactory stepsFactory() {
        return new InstanceStepsFactory(configuration(),
                new TestServiceIntegrationSteps());
    }

    @Override
    protected String getStoryPath() {
        return "**/test_service_integration.story";
    }
}