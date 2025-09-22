package com.jad;

public class Corge {
    private Foo foo;

    public Corge(final Foo foo) {
        this.setFoo(foo);
    }

    public Foo getFoo() {
        return this.foo;
    }

    public void setFoo(final Foo foo) {
        if (this.foo != null) this.foo.setCorge(null);
        this.foo = foo;
        if ((foo != null) && (foo.getCorge() != this)) foo.setCorge(this);
    }

}