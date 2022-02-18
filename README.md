# English Kotlin

This DSL's implementation aims to mimic the English language similar to the
programming language [~English](https://esolangs.org/wiki/~English).
It also supports German.

## Hello World!

The following snippet stores the String "Hello World!" in a variable called
`greeting` and then prints it to the console (in two different languages):

```
with(English()) {
    `Create a variable named`("greeting") `with value` ("Hello" and " World!")
    Display(`Get the value of variable named`("greeting"))
}

with(German()) {
    `Erstelle eine Variable namens`("Gruß") `mit Wert` ("Hallo" und " Welt!")
    Zeige(`Hole den Wert der Variable namens`("Gruß"))
    Beende("dieses Programm")
}
```

Result:

```
Hello World!
Hallo Welt!
```
