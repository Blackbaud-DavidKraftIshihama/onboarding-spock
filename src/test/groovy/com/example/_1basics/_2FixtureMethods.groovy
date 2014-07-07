package com.example._1basics

import spock.lang.Specification

/**
 * This specification is just an example to demonstrate the various setup and cleanup methods.
 *
 * Running this specification will show what order the methods are called.
 */
class _2FixtureMethods extends Specification {

    def setupSpec() {
        println "setup specification"
    }

    def setup() {
        println "setup feature"
    }

    def cleanup() {
        println "cleanup feature"
    }

    def cleanupSpec() {
        println "cleanup specification"
    }

    def "should output fixture flow"() {
        println "test"

        expect:
        true
    }

}
