import mill._, scalalib._

object Spring extends ScalaModule {
  def scalaVersion = "2.13.1"

  def ivyDeps = Agg(
ivy"org.springframework.boot:spring-boot-starter-web:2.4.3",
ivy"org.springframework.boot:spring-boot-starter-thymeleaf:2.4.3",
ivy"org.springframework.boot:spring-boot-starter-data-solr:2.4.3"
  )
}
