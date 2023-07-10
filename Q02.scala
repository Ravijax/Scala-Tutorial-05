import scala.io.StdIn

def main(args:Array[String]): Unit = {
    print("Enter an integer : ")
    var x = StdIn.readInt();
    print("The prime numbers are : ")
    if (x > 1) {
        primeSeq(x)
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

def primeSeq(n:Int): Unit = {
    if (n > 1) {
        var i = n-1
        if (Prime(n, i)) {
            printf("%d", n)
            print("\t")
        }
        primeSeq(n-1)
    }
}