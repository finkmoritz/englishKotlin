package english

import java.lang.Exception

/**
 * User: moritz
 * Date: 25.06.21
 * Time: 16:06
 */
class English {
    val variables = mutableMapOf<String, Variable>()

    infix fun Display(message: Any?) {
        print(message)
    }

    infix fun `Create a variable named`(key: String): Variable {
        if(variables.containsKey(key)) {
            throw Exception("Cannot create variable $key as it was already declared before")
        }
        variables[key] = Variable()
        return variables[key]!!
    }

    infix fun `Get the value of variable named`(key: String): Variable {
        if(!variables.containsKey(key)) {
            throw Exception("Variable $key was not declared")
        }
        return variables[key]!!
    }
}
