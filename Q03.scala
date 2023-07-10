import scala.io.StdIn

def main(args:Array[String]): Unit = {
    printf("Enter the no. of numbers : ")
    var x = StdIn.readInt();
    if (x > 1) {
        printf("Sum of first %d numbers : ", x)
        print(sum(x))
    }
    else {
        println("Invalid number")
    }
}

def sum(n:Int): Int = {
    if (n == 0){
        return n
    }
    else {
        return n + sum(n-1)
    }
}