package kotlinForAndroid

data class User (val name:String,val age:Int)
/*
If there are explicit implementations of equals(), hashCode() or toString() in the data class body or final implementations in a superclass, then these functions are not generated, and the existing implementations are used;
If a supertype has the componentN() functions that are open and return compatible types, the corresponding functions are generated for the data class and override those of the supertype. If the functions of the supertype cannot be overridden due to incompatible signatures or being final, an error is reported;
Deriving a data class from a type that already has a copy(...) function with a matching signature is deprecated in Kotlin 1.2 and is prohibited in Kotlin 1.3.
Providing explicit implementations for the componentN() and copy()functions is not allowed.
 */