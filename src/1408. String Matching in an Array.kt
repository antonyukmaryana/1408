fun main (args: Array<String>){
val words = arrayOf("mass","as","hero","superhero")
    val output:MutableSet<String> = mutableSetOf()
    for (needle in words){
        for (anotherNeedle in words) {
            if(needle != anotherNeedle && anotherNeedle.indexOf(needle) != -1) {
                output.add(needle)
            }
        }
    }
print(output)
}

