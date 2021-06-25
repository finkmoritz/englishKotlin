# English Kotlin

This DSL's implementation aims to mimic the English language similar to the
programming language [~English](https://esolangs.org/wiki/~English).

## Hello World!

The following snippet stores the String "Hello World!" in a variable called
`greeting` and then prints it to the console:

```
val english = English()
english `Create a variable named` "greeting" `with value` "Hello World!"
english Display (english `Get the value of variable named` "greeting")
```

Result:

`Hello World!`
