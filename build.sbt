name := "Scala Koans" 

version := "1.0"

scalaVersion := "2.9.2"

traceLevel := -1

logLevel := Level.Info

// disable printing timing information, but still print [success]
showTiming := false

// disable printing a message indicating the success or failure of running a task
showSuccess := false

// append -deprecation to the options passed to the Scala compiler
scalacOptions ++= Seq("-deprecation", "-unchecked")

// disable updating dynamic revisions (including -SNAPSHOT versions)
offline := true

// Copy all managed dependencies to <build-root>/lib_managed/
//   This is essentially a project-local cache and is different
//   from the lib_managed/ in sbt 0.7.x.  There is only one
//   lib_managed/ in the build root (not per-project).
retrieveManaged := true

libraryDependencies ++= Seq(
	"org.scalatest" %% "scalatest" % "1.8" % "test" withSources() withJavadoc()
)

// add a sequence of maven-style repositories
//resolvers ++= Seq("Name" at "URL")
