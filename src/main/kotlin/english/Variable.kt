package english

/**
 * User: moritz
 * Date: 25.06.21
 * Time: 16:23
 */
class Variable {
    var value : Any? = null

    infix fun `with value`(newValue: String) {
        value = newValue
    }

    override fun toString(): String {
        return value.toString()
    }
}