class pipelineUtil implements Serializable {

  static def script

  pipelineUtil() {

  }

  private static def configurationObject

  static private def getConfigurationObject() {
    if (configurationObject) {
      return configurationObject
    } else {
      configurationObject = pipelineUtil.script.readJSON(text: pipelineUtil.script.libraryResource('environment.json'))
    }
  }

  static def getConfiguration(environment, key) {
    def config = getConfigurationObject()
    def overrides = config.remove(environment)
    for (String k : overrides.keys()) {
      config[k] = overrides[k]
    }

    return config[key].toString()
  }

}
