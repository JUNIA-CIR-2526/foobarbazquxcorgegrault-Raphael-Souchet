package com.jad;

import java.util.ArrayList;
import java.util.List;

public class Foo {
    private Bar bar;
    private List<Baz> bazs;
    private Qux qux;
    private List<Grault> graults;
    private Corge corge;

    public Foo(final Bar bar) {
        this.bar = bar;
        this.bazs = new ArrayList<>();
        this.qux = new Qux();
        this.graults = new ArrayList<>();
    }

    public List<Baz> getBazs() {
        return this.bazs;
    }

    public Corge getCorge() {
        return this.corge;
    }

    public void setCorge(final Corge corge) {
        if (this.corge != null) this.corge.setFoo(null);
        this.corge = corge;
        if ((corge != null) && (corge.getFoo() != this)) corge.setFoo(this);
    }

    public List<Grault> getGraults() {
        return this.graults;
    }

    public Qux getQux() {
        return this.qux;
    }

    public Bar getBar() {
        return this.bar;
    }

    public void addBaz(Baz baz) {
        this.bazs.add(baz);
    }

    public void addGrault() {
        this.graults.add(new Grault(this));
    }
}