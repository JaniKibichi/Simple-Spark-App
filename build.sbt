name := "mqtt"

organization := "com.github.janikibichi"

version := "1.0.0"

javacOptions += "-Xlint:unchecked"

resolvers += "africastalking maven repository" at "http://dl.bintray.com/africastalking/java"

libraryDependencies += "org.json" % "json" % "20090211"

libraryDependencies += "com.sparkjava" % "spark-core" % "2.7.1"

libraryDependencies += "org.slf4j" % "slf4j-api" % "1.7.25"

libraryDependencies += "org.slf4j" % "slf4j-simple" % "1.7.25" 

libraryDependencies += "org.mongodb" % "mongo-java-driver" % "2.13.3"

libraryDependencies += "org.mongodb" % "bson" % "2.13.3"

libraryDependencies += "org.jongo" % "jongo" % "1.3.0"

libraryDependencies += "com.sparkjava" % "spark-template-handlebars" % "2.7.1"

libraryDependencies += "com.github.jknack" % "handlebars" % "4.0.1"

libraryDependencies += "com.github.jknack" % "handlebars-guava-cache" % "4.0.1"

libraryDependencies += "org.jsoup" % "jsoup" % "1.11.2"

libraryDependencies += "com.nimbusds" % "srp6a" % "2.0.2"

libraryDependencies += "com.fasterxml.jackson.core" % "jackson-core" % "2.9.2"

libraryDependencies += "com.fasterxml.jackson.core" % "jackson-databind" % "2.9.2"

libraryDependencies += "com.fasterxml.jackson.core" % "jackson-annotations" % "2.9.2"

libraryDependencies += "com.google.code.gson" % "gson" % "2.8.2"

libraryDependencies += "com.sparkpost" % "sparkpost-lib" % "0.19"

libraryDependencies += "com.africastalking" % "core" % "3.0.8"




