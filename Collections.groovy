def beatles = ["John","Paul","George","Ringo"]

for (def i = 0; i < beatles.size(); i++) {
    def greeting = "Hello, "
    println "$greeting" + beatles[i]
}
for (beatle in beatles) {
    def greeting = "Hello, "
    println "$greeting" + "$beatle"
}
