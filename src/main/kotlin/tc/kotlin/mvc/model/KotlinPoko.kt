package tc.kotlin.mvc.model

/**
 * Plain Old Kotlin Object ;)
 *
 * Created by thomas.croft on 20/03/2017.
 */

/*
    The primary constructor for a Kotlin class is defined in the class header, the properties of
    the class can also be specified here as so. (Note that technically this first line is enough to define
    a POJO with getters, setters, hashCode, toString and copy. I included more bits just to show what else you can do)
 */
data class KotlinPoko(var name: String, val age: Int) {

    /*
       No code can be put in the primary constructor, it will just set the specified properties
       (name and age in this case). In order to add additional code for the primary constructor you
       can include this in a init block like this
     */
    init {
        if (name == "Manos") {
            name = name.plus(name)
        }
    }

    /*
        You can define secondary constructors using the constructor key word, these must refer to
        the primary constructor using the 'this' keyword. Unlike the primary constructor code can be
        included in secondary constructors without the need for an init block
     */
    constructor(age: Int) : this("Anonymous", age) {
        if(age > 100) {
            name = "Old Person"
        }
    }

    /*
        Getters and setters are defaulted for class properties unless otherwise specified like below:
     */
    var firstInitial : Char
        get() = name.first()
        set(value) {
            name = value.plus(". ".plus(name))
        }

    /*
        In Kotlin classes all properties must be initialized when an instance of the object is initialized.
        In this class the age and name properties are initialized in the constructor whereas firstInitial
        is initialized by having a custom getter. You get a compiler error if you try to write the follow for example:
     */

    //var property : String

    /*
       This can be fixed by providing an initializer:
     */
    var property : String = "Yay"

}