fun main() {
//1
    val name = "Shabellah"
 println(names(name))
    val startsWithVowel = startsWithVowel(name)
    println("Starts with vowel: $startsWithVowel")


//3
(multiplesOfSixAndEight())


    //4
    var accounts= CurrentAccount(1279845,"Savings",345.80)
   println( accounts.accountName)
    accounts.deposit(500.0)

accounts.details()

    //5
   var savings= SavingsAccount(12334,"Deficit",21045.0)
println(savings.withdrawals)

}








           //1
//Write and invoke one function that takes in a random string and returns the
//following values: first character, last character, length of the string and
//whether it begins with a vowel or not. (6pts)
fun names (name:String):Any{
    var firstChar=name[0]
    var lastChar=name.last()
    var lengthOfTheString=name.length


     return Triple(firstChar, lastChar,  lengthOfTheString)
    }

fun startsWithVowel(name: String): Boolean {
        val vowels = setOf('a',"e","i","o","u")
        return vowels.contains(name.first())
    }



//2
// Create a function that takes in a password as a parameter. For a password to
//be valid it must meet the following conditions:
//1. Must be at least 8 characters long
//2. Must be at most 16 characters long
//3. Must not be “password”
//4. Must contain a digit
//Your function should determine whether the password provided is valid or not.
//The function returns true/false

    fun  user(password:String){
            if(password.length in 8..16){
              if(password !="password" ){

              }
                return true
            }
            else  {
                return false
            }
        }



//}

              //3
//Create a function that prints out multiples of 6 and 8 between 1 and 1000. For
//multiples of both 6 and 8 it should print out “Bingo!” (5pts)
fun multiplesOfSixAndEight(){
for (num in 1..1000){
    if (num%6==0 && num%8==0){
        println("Bingo")
    }
    else if (num%6==0 || num%8==0){
        println(num)
    }
}
    }
        //4
//Create a class CurrentAccount with the following attributes: account number,
//account name, balance. It has the following functions:
//a. deposit(amount: Double) - Increments the balance by the amount
//deposited
//b. withdraw(amount: Double) - Decrements the balance by the amount
//withdrawn
//c. details() - Prints out the account number and balance and name in
//this format: “Account number x with balance y is operated by z” (6pts)


 open class CurrentAccount(val accountNumber: Int, val accountName: String, var balance: Double) {

    fun deposit(amount: Double) {
        balance += amount
    }

    open fun withdraw(amount: Double) {
        balance -= amount
    }

    fun details() {
        println("Account number $accountNumber with balance $balance is operated by $accountName")
    }
}
               // 5
//Create another class SavingsAccount. It has the same functions and
//attributes as the current account except for one attribute, withdrawals: Int.
//Withdrawals is a counter variable that is used to keep track of how many
//withdrawals have been made from the account in a year. The only other
//difference is that the savings account withdraw() method first checks if the
//number of withdrawals is less than 4 for it to allow one to withdraw money
//from the account. It also increments the withdrawals attribute after a
//successful withdrawal
class SavingsAccount(accountNumber: Int, accountName: String, balance: Double):CurrentAccount(accountNumber,accountName, balance) {
    var withdrawals: Int = 0

    override fun withdraw(amount: Double) {
        if (withdrawals < 4) {
            withdrawals++
            println("Withdrawal successful. Number of withdrawals this year: $withdrawals")
        } else {
            println("You have reached the maximum number of withdrawals from this account")
        }
    }
}








