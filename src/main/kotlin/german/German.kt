package german

import Language
import java.lang.Exception
import kotlin.system.exitProcess

class German : Language() {

    infix fun Zeige(message: Any?) {
        println(message)
    }

    infix fun `Erstelle eine Variable namens`(key: String): GermanVariable {
        if (variables.containsKey(key)) {
            throw Exception("Cannot create variable $key as it was already declared before")
        }
        variables[key] = GermanVariable()
        return variables[key]!! as GermanVariable
    }

    infix fun `Hole den Wert der Variable namens`(key: String): GermanVariable {
        if (!variables.containsKey(key)) {
            throw Exception("Variable $key was not declared")
        }
        return variables[key]!! as GermanVariable
    }

    infix fun Beende(message: String) {
        exitProcess(0)
    }
}

infix fun String.und(other: String): String {
    return this.plus(other)
}
