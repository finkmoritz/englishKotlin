package english

import Variable

class EnglishVariable : Variable() {

    infix fun `with value`(newValue: String) {
        value = newValue
    }
}