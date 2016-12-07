package de.hpi.epic.pricewars

import java.util.Properties
import com.typesafe.config.Config

/**
  * Created by Jan on 07.12.2016.
  */
package object config {
  def propsFromConfig(config: Config): Properties = {
    import scala.collection.JavaConversions._

    val props = new Properties()

    val map: Map[String, Object] = config.entrySet().map({ entry =>
      entry.getKey -> entry.getValue.unwrapped()
    })(collection.breakOut)

    props.putAll(map)
    println(props)
    props
  }
}
