package dev.accelerated.DTF
package Advanced

import io.cucumber.junit.{Cucumber, CucumberOptions}
import org.junit.runner.RunWith


@RunWith(classOf[Cucumber])
@CucumberOptions(
  features = Array("classpath:features"),
  glue = Array("classpath:dev/accelerated/DTF/Advanced"),
  plugin = Array("pretty")
)
class RunCucumberTest {}

