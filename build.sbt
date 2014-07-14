name := "sbt-quasar-test"

organization := "pl.jaskowski"

version := "1-SNAPSHOT"

libraryDependencies ++= Seq(
  "co.paralleluniverse" % "quasar-core" % "0.5.0",
  "co.paralleluniverse" % "quasar-actors" % "0.5.0",
"co.paralleluniverse" % "quasar-galaxy" % "0.5.0"
)

fork := true

javaOptions += "-javaagent:/Users/maciej/.ivy2/cache/co.paralleluniverse/quasar-core/jars/quasar-core-0.5.0.jar"
