package com.example._0examplespecification

import spock.lang.Specification

class ExampleSpecification extends Specification {

    def "Given-when-then"() {
        given: "The given block sets up the conditions of the test"
        def a = 1
        def b = 1

        when: "The when block executes the code under test"
        def c = a + b

        then: "The then block verifies the results"
        c == 2
    }

    def "Given-expect"() {
        given: "The given block sets up the conditions of the test"
        def a = 1
        def b = 1

        expect: "The expect block executes the code under test and verifies the results - good for functional methods with no side effects"
        a + b == 2
    }

}
