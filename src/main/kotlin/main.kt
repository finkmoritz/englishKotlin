import english.*
import german.*

fun main() {

    with(English()) {
        `Create a variable named`("greeting") `with value` ("Hello" and " World!")
        Display(`Get the value of variable named`("greeting"))
    }

    with(German()) {
        `Erstelle eine Variable namens`("Gruß") `mit Wert` ("Hallo" und " Welt!")
        Zeige(`Hole den Wert der Variable namens`("Gruß"))
        Beende("dieses Programm")
    }
}
