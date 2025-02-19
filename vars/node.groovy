def call(String label='', args) {
  echo "hello world"
  this.steps.node(label, args)
  echo "goodbye world"
}
