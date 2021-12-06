package fr.lernejo.tester;

import fr.lernejo.tester.api.TestMethod;

public class SomeLernejoTests {
    @TestMethod
    public void ok () {
        assert true;
    }

    @TestMethod
    public void ko () {
        assert false;
    }

    public void none () {
        throw new IllegalStateException();
    }
}
