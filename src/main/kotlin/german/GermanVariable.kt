package german

import Variable

class GermanVariable : Variable() {

    infix fun `mit Wert`(newValue: String) {
        value = newValue
    }
}