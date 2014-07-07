package com.example._0examplespecification

import spock.lang.Specification

class ExampleSpecification extends Specification {

    def "Given-when-then"() {
        given: "The given block sets up the conditions of the test"
        def a = 1
        def b = 1

        when: "The when block executes the code under test"
        def c = a + b

        then: "The then block verifies the results - Assert isn't necessary here, but it's best to use it for clarity and safety"
        assert c == 2
    }

    def "Given-expect"() {
        given: "The given block sets up the conditions of the test"
        def a = 1
        def b = 1

        expect: "The expect block executes the code under test and verifies the results - good for functional methods with no side effects"
        assert a + b == 2
    }

    def "Mock behavior"() {
        given: "You can train mocks to respond with a specific return value or have specific behavior"
        List mock = Mock()
        mock.toString() >> "Trained toString"
        mock.clear() >> { System.out.println("Don't do anything") }

        and: "You can use general or specific input and define how specific the input is"
        mock.remove(5) >> null
        mock.add(_ as Object) >> true

        when:
        mock.remove(5)
        mock.add(null)

        then: "Specify the expected number of invocations here"
        1 * mock.remove(5)
        _ * mock.toString()
        0 * mock.clear()
        (1.._) * mock.add(null)
    }

    def "Exception behavior"() {
        given: "You can train a mock to throw an exception"
        List mock = Mock()
        mock.remove(-1) >> { throw new IllegalArgumentException("hi") }

        when:
        mock.remove(-1)

        then: "You can use the thrown method to capture your exception and assert things on it"
        IllegalArgumentException ex = thrown(IllegalArgumentException)
        assert ex.getMessage().equals("hi")
    }
}
