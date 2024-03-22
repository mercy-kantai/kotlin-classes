fun main() {
    val human = Human("Mercy",23, 65.0)
    human.eat(25)
    human.speak("Ladies and gentlemen good morning")
    human.birthday()
val user = User("Mercy","Emily","723457890","mercy@12")
    println("${user.firstName} ${user.lastName}")

}
class Human(var name: String, var age:Int, var weight:Double){
    fun eat(foodWeight:Int){
      var foodWeight=  foodWeight+weight
        println("I am eating ${foodWeight}kgs of food")
    }
    fun speak(speech:String){
        println(speech)
    }
    fun birthday(){
println(age + 1)
    }

}
class User(var lastName:String, var firstName:String, var phoneNumber: String, var password:String)