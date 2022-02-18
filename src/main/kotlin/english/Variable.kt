package english

class Variable {
    var value : Any? = null

    infix fun `with value`(newValue: String) {
        value = newValue
    }

    override fun toString(): String {
        return value.toString()
    }
}