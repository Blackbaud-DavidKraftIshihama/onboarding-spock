package com.example._4partialmock

import com.example.Contrived
import com.example.Service
import spock.lang.Specification

class PartialMockSpock extends Specification
{
    private Service service = Mock()
    private Contrived contrived = Spy(Contrived, constructorArgs: [service])

    /**
     * When a class is constructed with Spy, methods can be partial-mocked
     */
    def "service should never be called" () {
        given:
        // FIXME
        // SNIPPET START
        contrived.singleParamDelegate(_) >> "stuff"
        // SNIPPET END

        when:
        contrived.singleParamDelegateForEach("object", "value", "experiment")

        then:
        0 * service.singleParamMethod(_)
    }

}
