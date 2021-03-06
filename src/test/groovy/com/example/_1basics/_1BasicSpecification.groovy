package com.example._1basics

import com.example.Bean
import spock.lang.Specification

class _1BasicSpecification extends Specification {

    def "should use 'when' and 'then' to describe methods with side effects"() {
        given:
        List list = ['one']

        when:
        list.add('two')

        // FIXME: verify list contents
        // SNIPPET START
        org.spockframework.util.Assert.fail("Fix me!")
        // SNIPPET END
    }

    def "should use 'expect' to describe purely functional methods"() {
        given:
        Bean bean1 = new Bean("correct")
        Bean bean2 = new Bean("correct")

        // FIXME: verify beans are equal
        // SNIPPET START
        org.spockframework.util.Assert.fail("Fix me!")
        // SNIPPET END
    }

    def "should use 'and' to break up blocks into logical pieces (very poor example, notwithstanding)"() {
        given:
        File file1 = new File('file-one')

        // FIXME: should define file2 in an 'and' block
        // SNIPPET START
        org.spockframework.util.Assert.fail("Fix me!")
        // SNIPPET END

        when:
        file1.write("file one content")

        and:
        file2.write("file two content")

        then:
        file1.text == "file one content"

        and:
        file2.text == "file two content"

        // NOTE: requiring a cleanup step might indicate that this is not a true unit test
        cleanup:
        file1.delete()

        and:
        file2.delete()
    }

}
