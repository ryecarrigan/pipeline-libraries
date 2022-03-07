@Grab(group='org.codehaus.groovy.modules.http-builder', module='http-builder', version='0.7.1')

import groovy.json.*
import groovy.json.JsonSlurper
import groovyx.net.*
import groovyx.net.http.*
import groovyx.net.http.RESTClient
import groovyx.net.http.RESTClient
import groovy.util.XmlParser
import org.apache.commons.lang3.*
import java.io.*
import java.text.SimpleDateFormat

import static groovy.json.JsonOutput.*
import static groovyx.net.http.Method.*
import static groovyx.net.http.ContentType.*

def call() {
  println "Hello: ${TEXT}"
}
