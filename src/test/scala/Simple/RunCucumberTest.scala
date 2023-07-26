package dev.accelerated.DTF
package Simple

import io.cucumber.junit.{Cucumber, CucumberOptions}
import org.junit.runner.RunWith

@RunWith(classOf[Cucumber])
@CucumberOptions(
  features = Array("classpath:features"),
  glue = Array("classpath:dev/accelerated/DTF/Simple"),
  plugin = Array("pretty")
)
class RunCucumberTest {}
