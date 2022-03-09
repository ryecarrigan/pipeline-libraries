#!groovy
@Grab(group='org.codehaus.groovy.modules.http-builder', module='http-builder', version='0.7.1')

def call() {
  println "Hello: ${groovyx.net.http.ContentType.TEXT}"
  sleep time: 60, unit: 'SECONDS'
}
