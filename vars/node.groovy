def call(String label = null, Closure context) {
  echo "hello world"
  this.steps.node(label, context)
  echo "goodbye world"
}
