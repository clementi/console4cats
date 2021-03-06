resolvers += Classpaths.sbtPluginReleases
resolvers += "Typesafe Repository" at "https://repo.typesafe.com/typesafe/releases/"

addSbtPlugin("io.github.davidgregory084" % "sbt-tpolecat"   % "0.1.16")
addSbtPlugin("org.xerial.sbt"            % "sbt-sonatype"   % "3.9.5")
addSbtPlugin("com.github.sbt"              % "sbt-pgp"        % "2.1.2")
addSbtPlugin("de.heikoseeberger"         % "sbt-header"     % "5.6.0")
addSbtPlugin("com.lucidchart"            % "sbt-scalafmt"   % "1.16")
addSbtPlugin("com.47deg"                 % "sbt-microsites" % "1.2.1")
addSbtPlugin("org.scalameta"             % "sbt-mdoc"       % "2.1.4")
addSbtPlugin("com.scalapenos"            % "sbt-prompt"     % "1.0.2")
