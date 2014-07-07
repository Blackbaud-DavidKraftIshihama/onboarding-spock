First, read [this document](https://code.google.com/p/spock/wiki/SpockBasics) to get a general overview of the Spock framework.

Next, remove all answers by executing the following code...

    ./gradlew removeSolutions

At this point, some of the *Spock tests in the following packages should fail.

    com.example._1basics
    com.example._2interactions
    com.example._3exceptions
    com.example._4partialmock

For each package above (in order), go through the various tests in numeric order, filling in code to make the tests pass.

    // SNIPPET START
    <insert code here>
    // SNIPPET END

For most *Spock classes there is a corresponding *Mockito class which serves as a comparison between spock and mockito
and also demonstrates intent for each test. If you're having trouble with filling in a test, look at the corresponding
mockito test for an example.

If you need assistance along the way, see spock [documentation](http://docs.spockframework.org/en/latest)

After running through the basics, have a look at com.example._5datadriven for a brief overview of data-driven tests
in Spock.  Also, com.example._6gotchas goes over some non-obvious behavior to be aware of.  Note that the tests in
the gotchas package are intended to fail - the purpose is to show you the actual failures under these conditions
in the hopes of recognizing if you run across them in the future.

Final exercise: Write tests for the com.swordfight.InsultSwordFight class. There are no existing tests, so you'll need
to create a new specification from scratch. Try to think about corner cases in addition to the basics.
