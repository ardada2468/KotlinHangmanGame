import java.util.*


fun main(args : Array<String>) {
    var han = Hangman("Anker")
    var listOfGames = arrayListOf<Hangman>(Hangman("Chair"), Hangman("Laptop"), Hangman("Taarak Mehta Ka Ooltah Chashmah"));
    for (Game in listOfGames) {
        Game.play();
    }
}

class Hangman(word: String){

    var charArray = word.lowercase().toCharArray()
    var emptyArray = createEmptyArray();

    fun play(){
        var attempts = 0;
        var play = true;
        val read = Scanner(System.`in`)
        while(play){
            if(arrEqual()){
                println("Congratulations you won!!")
                println("It took $attempts to win!")
                println("-------------------------")
                play = false;
            }else{
                print("Enter a guess: ")
                var userinput: Char = read.nextLine().toLowerCase().toCharArray()[0];
                Guess(userinput);
            }
            attempts++;
        }
    }

    fun arrEqual(): Boolean{
        var x = charArray.toList().toString();
        var w = emptyArray.toList().toString();
//        println("$x ||| $w")
        return  x == w;
    }

    fun Guess(letter: Char){
        if(charArray.contains(letter)){
            var index = 0
            for (c in charArray) {
                if(c == letter){
                    emptyArray.set(index, c)
                }
                index++;
            }
            println("Correct Guess!")
        }else{
            println("Incorrect Guess :(")
        }
        println(emptyArray.toList().toString())
    }

    fun createEmptyArray(): CharArray{

        var emptyArray = CharArray(charArray.size)
        var index = 0;
        for (c in charArray) {
            if(c == ' '){
                emptyArray.set(index, ' ')
            }else {
                emptyArray.set(index, '_')
            }
            index++;
        }
        return  emptyArray;
    }
}