import scala.io.StdIn

def main(args:Array[String]): Unit = {
    print("Enter an integer : ")
    var x = StdIn.readInt();
    fibonacciSeq(x)
}

def fibonacci(n:Int): Int = {
    if (n == 0) {
        return n
    }
    else if (n == 1) {
        return n
    }
    else {
        return fibonacci(n-1) + fibonacci(n-2)
    }
}

def fibonacciSeq(m:Int): Unit = {
    if (m == 0) {
        print("0")
        print("\n")
    }
    else {
        fibonacciSeq(m-1)
        printf("%d", fibonacci(m))
        print("\n")
    }
}