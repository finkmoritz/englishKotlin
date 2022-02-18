package english

import Language
import java.lang.Exception
import kotlin.system.exitProcess

class English : Language() {

    infix fun Display(message: Any?) {
        println(message)
    }

    infix fun `Create a variable named`(key: String): EnglishVariable {
        if (variables.containsKey(key)) {
            throw Exception("Cannot create variable $key as it was already declared before")
        }
        variables[key] = EnglishVariable()
        return variables[key]!! as EnglishVariable
    }

    infix fun `Get the value of variable named`(key: String): EnglishVariable {
        if (!variables.containsKey(key)) {
            throw Exception("Variable $key was not declared")
        }
        return variables[key]!! as EnglishVariable
    }

    infix fun Stop(message: String) {
        exitProcess(0)
    }
}

infix fun String.and(other: String): String {
    return this.plus(other)
}
