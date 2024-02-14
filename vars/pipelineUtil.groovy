import net.sf.json.JSONSerializer

class pipelineUtil implements Serializable {

  static def getConfiguration(environment, key) {
    def text = this.getResourceAsStream('environment.json')
    def json = JSONSerializer.toJSON(text)
  }

}
