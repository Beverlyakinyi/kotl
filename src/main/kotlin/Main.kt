fun main(){

    println(sentence())
    println("hello\nbeverly")
    println(digit(6))
    println(dor("Beverly,Akinyi"))
    println(input("akinyi"))
}



fun sentence() {
    var word="James was the only man in the race"
    println(word.replace("race","Journey"))
}
//
//Write a Kotlin program to check if a given number is even or odd.
fun digit(num1:Int){
  var even=num1%2
    if (even==0){
        println("even")
    }
    else{
        println("odd")
    }
}
//Write a Kotlin program to take user input and display it.
 fun input(name:String){
     var user=name+name
    if(name=="beverly"){
        println("correct")
    }
    else{
        println("not correct")
    }

 }
fun dor (word:String){
    println(word[0])
    println(word[1])
    println(word[2])
    println(word[3])
    println(word[4])
}