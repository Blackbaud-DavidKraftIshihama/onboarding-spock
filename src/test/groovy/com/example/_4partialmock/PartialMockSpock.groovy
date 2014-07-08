package com.example._4partialmock

import com.example.Contrived
import com.example.Service
import spock.lang.Specification

class PartialMockSpock extends Specification
{
    private Service service = Mock()
    private Contrived contrived = Spy(Contrived, constructorArgs: [service])

    /**
     * Unless otherwise trained, a Spy will delegate method calls to the real object.
     * Training a Spy will change its behavior exactly as if it were a mock.
     */
    def "service should never be called" () {
        given:
        // FIXME
        // SNIPPET START
        org.spockframework.util.Assert.fail("Fix me!")
        // SNIPPET END

        when:
        contrived.singleParamDelegateForEach("object", "value", "experiment")

        then:
        0 * service.singleParamMethod(_)
    }

}
