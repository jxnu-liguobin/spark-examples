ThisBuild / version      := "0.1.0-SNAPSHOT"
ThisBuild / scalaVersion := "2.13.12"

val sparkVersion = "3.5.0"

lazy val `spark-examples` = (project in file("."))
  .settings(
    name := "spark-examples",
    libraryDependencies ++= Seq(
      "org.apache.spark"  %% "spark-core"                 % sparkVersion,
      "org.apache.spark"  %% "spark-streaming"            % sparkVersion,
      "org.apache.spark"  %% "spark-sql-kafka-0-10"       % sparkVersion,
      "org.apache.spark"  %% "spark-streaming-kafka-0-10" % sparkVersion,
      "org.apache.spark"  %% "spark-graphx"               % sparkVersion,
      "org.apache.spark"  %% "spark-hive"                 % sparkVersion,
      "org.apache.spark"  %% "spark-mllib"                % sparkVersion,
      "com.github.scopt"  %% "scopt"                      % "3.7.1",
      "org.scalacheck"    %% "scalacheck"                 % "1.17.0",
      "org.apache.commons" % "commons-math3"              % "3.6.1"
    )
  )

addCommandAlias("fmt", "all scalafmtSbt scalafmt test:scalafmt")
