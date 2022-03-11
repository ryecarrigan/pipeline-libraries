#!groovy
@Grab(group='org.apache.httpcomponents', module='httpclient', version='4.2.1')
@Grab(group='org.apache.httpcomponents', module='httpcore', version='4.2.1')
@Grab(group='org.codehaus.groovy', module='groovy-json', version='2.3.7')
@Grab(group='org.codehaus.groovy.modules.http-builder', module='http-builder', version='0.7.1')

def call() {
  println "Hello: ${groovyx.net.http.ContentType.TEXT}"
  sleep time: 15, unit: 'SECONDS'
}
