package com.example._3exceptions

import com.example.Contrived
import com.example.Service
import com.example.ServiceException
import spock.lang.Specification

class ExceptionHandlingSpock extends Specification {

    private Service service = Mock()
    private Contrived contrived = new Contrived(service)

    /**
     * The 'thrown' method is used to indicate an expected exception.  The method
     * accepts one parameter - the type of the expected exception.
     */
    def "should detect exception by type"() {
        when:
        contrived.throwException("failure!", 1)

        then:
        // FIXME
        // SNIPPET START
        org.spockframework.util.Assert.fail("Fix me!")
        // SNIPPET END
    }

    /**
     * The 'thrown' method returns the thrown exception which can then be inspected
     * and used to make assertions.  In addition, if the type parameter is omitted, the
     * type will be inferred from the variable type on the left-hand side of the assignment.
     */
    def "should detect exception by type and assert internal values"() {
        given:
        String expectedMessage = "failure!"
        int expectedStatusCode = 1

        when:
        contrived.throwException(expectedMessage, expectedStatusCode)

        then:
        // FIXME
        // SNIPPET START
        org.spockframework.util.Assert.fail("Fix me!")
        // SNIPPET END
    }

    /**
     * The 'notThrown' method provides explicit verification that an exception should not be thrown
     */
    def "should not throw NullPointerException when key is null"() {
        given:
        HashMap map = new HashMap()

        when:
        map.put(null, "element")

        then:
        notThrown(Exception)
    }

}
