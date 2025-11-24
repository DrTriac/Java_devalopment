public class Foo {

    private int bar = 7;

    public Foo() {

        this(42);

    }

    public Foo(int foo) {

        bar = foo;

        System.out.println(bar);

    }

}