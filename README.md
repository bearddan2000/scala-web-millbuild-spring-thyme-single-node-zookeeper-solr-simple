# scala-web-millbuild-spring-thyme-single-node-zookeeper-solr-simple

## Description
A thyme springboot scala gradle build,
that connects to solr database single node cluster.

To create the `dog` collection we use a runner
to remotely issue `solr create_collection -c` to
node 1.

Zookeeper is used for replication across
the single node cluster.

## Tech stack
- springboot
  - thymeleaf
- millbuild
  - solr drivers
  - lombok
  - PostConstruct annotation
- bootstrap
- jquery
- dataTable
- zookeeper

## Docker stack
- solr:8.2
- zookeeper:3.5
- nightscape/scala-mill

## To run
`sudo ./install.sh -u`
- [Available](http://localhost)
- [Node 1 solr webui](http://localhost:8981)

## To stop (optional)
`sudo ./install.sh -d`

## For help
`sudo ./install.sh -h`

## Credits
- [Baeldung code](https://github.com/eugenp/tutorials/tree/master/persistence-modules/spring-data-solr)
- [Springboot code](https://scaladeveloperzone.com/spring-boot/spring-boot-solr-example/)
- [Spring data config](https://www.google.com/search?client=firefox-b-1-lm&q=spring+boot+solr+example)
- [Cluster setup](https://gist.github.com/makuk66/0812f70b77aa92230c203cec41acac64#file-docker-compose-yml-L64)
- [Example solr queries](https://docs.spring.io/spring-data/solr/docs/1.0.x/reference/html/solr.repositories.html)
