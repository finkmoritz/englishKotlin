abstract class Variable {

    protected var value: Any? = null

    override fun toString(): String {
        return value.toString()
    }
}