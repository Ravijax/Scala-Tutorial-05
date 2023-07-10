import scala.io.StdIn

def main(args:Array[String]): Unit = {
    print("Enter the number : ")
    var x = StdIn.readInt()
    printf("The sum is :" +sumEven(x))
}

def sumEven(n: Int): Int = {
    if (n == 0) {
        return n
    }
    if (n % 2 == 0) {
        return n + sumEven(n-2)
    }
    else {
        return sumEven(n-1)
    }
}