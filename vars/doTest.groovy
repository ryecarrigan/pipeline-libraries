def call() {
  pipelineUtil.script = this

  echo pipelineUtil.getConfiguration('testing', 'b')
}
