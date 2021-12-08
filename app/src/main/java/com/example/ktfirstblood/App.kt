

import kotlin.reflect.KProperty

data class SetData(val name:String,val age:Int )
class ClassData(val name:String,val age:Int){
    override fun equals(other: Any?):Boolean{
        if(this === other)return true
        if(javaClass != other?.javaClass)return false
        other as ClassData
        if(name != other.name)return false
        if(age != other.age)return false
        return true
    }
    override fun hashCode():Int{
        var result = name.hashCode()
        result= 31 * result + age
        return result
    }
}
fun setNumber(vararg multi:Int,number:Int, name:String){
    return print("the result "+multi.sum()/number+name)
}
fun privateResult(value:Int,sum:(Int)->Int){
    val result =sum(value)
   println(result)
}
var sum:(Int)->Int={value -> value+value}
class Animal(val name:String,val age:Int,val school:String,val location:String){
 
    fun bio(){
        print("Name "+name+", Age "+age)
    
    }
    fun address(){
        print("Address "+ school + location)
    }
}
class bioInfo(var name:String,var berat:Int,var makanan:String)
class binatang{
    var name:String ="lukman"
    get(){
        print("fungsi get terpanggil")
        return field
    }
    set(value){
        print("Seter terpanggil")
        field=value
    }
}

class Percobaan{
    var name:Any by DelegateName()
}
class DelegateName{
    private var value:Any ="Default"
    operator fun getValue(classRef:Any,property:KProperty<*>):Any{
        println("Fungsi ini terpanggil dari getter")
        return value
    }
    operator fun setValue(classRef:Any,property:KProperty<*>,newValue:Any){
        println("Fungsi ini terpanggin dari setter")
        value=newValue
    }
}
val bioInfo.getAnimalInfo:String get ()="Disini namanya enak ${this.name}, ${this.berat}"
fun main(){
    val theBigData=bioInfo("lukman",52, "enak")
    println(theBigData.getAnimalInfo)
//     val gila= Percobaan()
//     gila.name="dimana"
//    val res =gila.:String get() ="Name ${this.name}" 

//     val anja=binatang()
//     anja.name="disini"
//     print(anja.name)
//    val data= Animal("Gilang", 20, "SMK", "Unknow")
//     data.bio()
//     data.address()
    // privateResult(10,sum)
    // setNumber(1,1,2, number=2, name="Lukman")    
    // val theCountry=mutableMapOf("jakarta" to "Indonesia","London" to "English","washington Dc" to "amerika Serikat")

    // theCountry.put("jakarta", "Indonesia")
    // theCountry.put("Jatinegara", "DUkuhBangsa")

    // print(theCountry)
    // val array=mutableListOf("aku","kamu","dia","aku","dia","bon-non","koren","bar bar cat","never surender","break the limit!")
    // array[1]="anjq"
    // // val setData=mutableSetOf("aku","kamu","dia","aku","dia")
    // array.add("siapa")
    // array.sort()
    // array.asSequence().take(5).forEach { println(it) }
    // println(array.count())
    
    // print(setData.filter { it == "aku" })
    // println(array.dropLast(5))
//   val user=  SetData("Waniah", 23)
//   val setUser=ClassData("Lukman", 23)
// println("dataUser "+setUser.equals(setUser.hashCode()))  
// println(user)
// println(setUser)
// val number = 9
// when(number){
//     5->println("Here number 5")
//     6->print("here 6")
//     7->print("Here 7")
//     else ->
//         print("Not Amount")
    
// }


// val number  =300L
// print(number)

//     setUser("Lukman",23)
    // val vhar ="Disini"
    // print("""Kotlin \"is Awesome\" 
    // Never
    // Be
    // Bored
    // """.trimIndent())
    // for(char in vhar){
    //     print("ke $char")
    // }
}
fun setUser(name: String,age:Int){
    println("Your name in here $name and age $age")
}