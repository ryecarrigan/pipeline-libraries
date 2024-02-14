import net.sf.json.JSONSerializer

class pipelineUtil implements Serializable {

  static def script

  static def getConfiguration(environment, key) {
    def text = script.libraryResource('environment.json')
    def json = script.readJSON text: text

    return json[environment][key].toString()
  }

}
