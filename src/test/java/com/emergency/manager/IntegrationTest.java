package com.emergency.manager;

import com.emergency.manager.EmergencyManagerApp;
import com.emergency.manager.MongoDbTestContainerExtension;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.boot.test.context.SpringBootTest;

/**
 * Base composite annotation for integration tests.
 */
@Target(ElementType.TYPE)
@Retention(RetentionPolicy.RUNTIME)
@SpringBootTest(classes = EmergencyManagerApp.class)
@ExtendWith(MongoDbTestContainerExtension.class)
public @interface IntegrationTest {
}
