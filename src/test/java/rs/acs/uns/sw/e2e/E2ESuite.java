package rs.acs.uns.sw.e2e;

import org.junit.BeforeClass;
import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.springframework.boot.SpringApplication;
import rs.acs.uns.sw.e2e.tests.SigningTest;
import rs.acs.uns.sw.e2e.tests.UserProfileTest;
import rs.acs.uns.sw.sct.SctServiceApplication;

import static rs.acs.uns.sw.e2e.util.Constants.PROFILE_NAME;

@RunWith(Suite.class)
@Suite.SuiteClasses({
        SigningTest.class,
        UserProfileTest.class
})
public class E2ESuite {

    @BeforeClass
    public static void runApplicationInTestProfile() {
        SpringApplication app = new SpringApplication(SctServiceApplication.class);
        app.setAdditionalProfiles(PROFILE_NAME);
        app.run();
    }
}
