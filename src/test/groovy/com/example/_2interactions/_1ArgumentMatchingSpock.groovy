package com.example._2interactions

import com.example.Contrived
import com.example.Service
import spock.lang.Specification

class _1ArgumentMatchingSpock extends Specification {

    private Service service = Mock()
    private Contrived contrived = new Contrived(service)

    /**
     * To set up an expection, simply invoke the method on the mock with appropriate arguments.
     * The right shift operator '>>' is used to specify a return value
     */
    def "should match arguments using equals"() {
        given:
        // FIXME
        // SNIPPET START
        org.spockframework.util.Assert.fail("Fix me!")
        // SNIPPET END

        when:
        String value = contrived.singleParamDelegate("value")

        then:
        value == "value-string"
    }

    /**
     * The bang character '!' is used to match negation.
     */
    def "should match argument not equals"() {
        given:
        // FIXME
        // SNIPPET START
        org.spockframework.util.Assert.fail("Fix me!")
        // SNIPPET END

        when:
        int randomNumber = new Random().nextInt(10000)
        String value = contrived.singleParamDelegate("value-${randomNumber}")

        then:
        value == "value-string"
    }

    /**
     * The underscore character '_' is used to match any argument.
     */
    def "should match any argument"() {
        given:
        // FIXME
        // SNIPPET START
        org.spockframework.util.Assert.fail("Fix me!")
        // SNIPPET END

        when:
        String value = contrived.singleParamDelegate(new Object())

        then:
        value == "value-string"
    }

    /**
     * The character sequence '*_' is used to match any number of arguments.
     */
    def "should match multiple any arguments"() {
        given:
        // FIXME
        // SNIPPET START
        org.spockframework.util.Assert.fail("Fix me!")
        // SNIPPET END

        when:
        String value = contrived.multiParamDelegate(new Object(), new Object())

        then:
        value == "onetwo"
    }

    /**
     * '_ as <type>' is used to match an argument of a specificed type
     */
    def "should match any argument of type String"() {
        given:
        // FIXME
        // SNIPPET START
        org.spockframework.util.Assert.fail("Fix me!")
        // SNIPPET END

        when:
        String value = contrived.singleParamDelegate("input-string")

        then:
        value == "value"
    }

    /**
     * The null keyword is used to match a null argument.
     */
    def "should match null argument"() {
        given:
        // FIXME
        // SNIPPET START
        org.spockframework.util.Assert.fail("Fix me!")
        // SNIPPET END

        when:
        String value = contrived.singleParamDelegate(null)

        then:
        value == "value"
    }

    /**
     * The expression !null is used to match any non-null argument.
     */
    def "should match not null argument"() {
        given:
        // FIXME
        // SNIPPET START
        org.spockframework.util.Assert.fail("Fix me!")
        // SNIPPET END

        when:
        String value = contrived.singleParamDelegate(new Object())

        then:
        value == "value"
    }

    /**
     * If a closure is used as an argument to an expectation, the expectation will match if the closure evaluates
     * to true.
     */
    def "should match dynamic predicate where argument is string of length greater than 4"() {
        given:
        service.singleParamMethod({String arg -> arg.size() > 4}) >> "value"

        when:
        int randomNumber = new Random().nextInt(10000)
        String value = contrived.singleParamDelegate("1234" + randomNumber.toString())

        then:
        value == "value"
    }

}
