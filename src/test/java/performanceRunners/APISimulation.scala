package performanceRunners

import com.intuit.karate.gatling.PreDef._
import io.gatling.core.Predef.{Simulation, constantUsersPerSec, openInjectionProfileFactory, rampUsers, scenario}

import scala.concurrent.duration.{Duration, DurationInt, SECONDS}
import scala.language.postfixOps

class APISimulation extends Simulation {

  val protocol = {
    karateProtocol()
  }

  val userCount = System.getProperty("userCount")
  val duration = System.getProperty("duration")
  val constantDuration = System.getProperty("constantDuration")
  val constantUser = System.getProperty("constantUser")
  val getUser = scenario("user login").exec(karateFeature("classpath:features/users.feature@name=load"))

  //setUp(getUser.inject(rampUsers(userCount.toInt) during Duration(duration.toInt, SECONDS)).protocols(protocol))

  setUp(getUser.inject(constantUsersPerSec(constantUser.toInt) during Duration(constantDuration.toInt, SECONDS)).protocols(protocol))




}