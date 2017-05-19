package tc.kotlin.mvc.service

import org.springframework.stereotype.Service

/**
 * A Kotlin class to showcase some of the benefits of Kotlin over Java
 *
 * Created by thomas.croft on 20/03/2017.
 */
@Service
open class KotlinService {

    /*
        One advantage of Kotlin over Java is it's null safety. In Kotlin you get compiler
        level errors for null pointer exceptions.
     */
    fun nullSafety() : String {
        /*
            By default all objects in Kotlin are non-nullable, the following line is still valid however.
            It simply specifies the class of number but it is uninitialized which is
            distinctly different from being null. Any attempt to access the object before it is initialized
            will give a compiler error
         */
        val number : Int
        //number.hashCode()
        /*
            It is also not possible to set number to null because it non-nullable. This yields a compiler
            error:
         */
        //number = null;
        /*
            By appending a ? to a class declaration you are specifying that it can be null. This will be
            the case for any Java objects you interact with (e.g. the DefaultServletHandlerConfigurer
            in KotlinConfig) the following compiles fine:
         */
        val nullableNumber: Int?
        nullableNumber = null
        /*
            Kotlin is still null safe on nullable objects however and will throw a compiler error if you try
            to access a nullable object:
         */
        //nullableNumber.hashCode()
        /*
            Instead of throwing a runtime null pointer exception as would happen in Java. In order to call
            methods on nullable objects you need to use the following null safe call:
         */
        nullableNumber?.hashCode()
        /*
            This returns the hashCode if nullableNumber is not null and returns null if it is null
            if you want to perform a different behaviour other than this you can use the elvis operator
            '?:'
         */
        nullableNumber?.hashCode() ?: return "Ain't nothing but a hound dog"
        /*
            The elvis operator ?: checks whether the expression on the left is null and if it is it performs the expression
            on the right
         */
        return "This never happens!"
    }

    fun functionTypes() {
        doTheThing(1 , 2, { a, b -> isEquals(a,b) })
        doTheThing(1, 2, { a, b -> isGreater(a,b) })


    }


    private fun doTheThing(a : Int, b : Int, rule : (Int, Int) -> Boolean) {
        if (rule(a,b)) {
            println("Doing the thing")
        } else {
            println("Didn't do the thing")
        }
    }

    private fun isEquals(a : Int, b : Int) : Boolean {
        return a == b
    }

    private fun isGreater(a : Int, b : Int) : Boolean {
        return a > b
    }

}