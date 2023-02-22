fun main() {
  sentence()
    details()
    loop()
    loopy("Book","Pen","Pencil")


}
fun sentence(){//question one
    var name= arrayOf("Ann","Joy","Maggie","Mercy")
    println(name.contentToString())

}//question two
fun details(){
    var cities= arrayOf("harare","mumbai","dodoma","jakarta")
    var captalised=cities.map { it.capitalize() }.toTypedArray()
    println(captalised.contentToString())

}
fun loop(){//question three
    var numbers= arrayOf(32,17,4,213,78,43,90,31,3,73,11,158,62)
    var sum= numbers[2]+numbers[5]
    println(sum)
    println(numbers.indexOf(158))
    println(numbers.sortedArray().contentToString())

}//question four
fun loopy(name1:String,name2:String,name3:String):Array<String>{
    return arrayOf(name1,name2,name3)

}
