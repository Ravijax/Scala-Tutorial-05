import scala.io.StdIn

def main(args:Array[String]): Unit = {
    print("Enter an integer : ")
    var x = StdIn.readInt();
    if (x > 1) {
        var i = x-1
        if (Prime(x, i)){
            printf("%d is a prime number", x)
        }
        else {
            printf("%d is not a prime number", x)
        }
    }
    else {
        printf("Not a valid number")
    }
}

def Prime(n:Int, i:Int): Boolean = {
    if (n == 2 || i == 1) {
        return true
    }
    else if (n % i == 0) {
        return false
    }
    else {
        Prime(n, i-1)
    }
}