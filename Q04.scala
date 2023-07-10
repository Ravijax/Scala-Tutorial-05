import scala.io.StdIn
import scala.compiletime.ops.boolean

def main(args:Array[String]): Unit = {
    printf("Enter an integer : ")
    var x = StdIn.readInt();
    if(isEven(x)) {
        printf("%d is even", x)
    }
    else {
        printf("%d is odd", x)
    }
}

def isEven(n:Int): Boolean = {
    if (n == 0){
        return true
    }
    else {
        return isOdd(n-1)
    }
}

def isOdd(m:Int): Boolean = !(isEven(m))