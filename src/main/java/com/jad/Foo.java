package com.jad;

import java.util.ArrayList;
import java.util.List;

public class Foo {
    private Bar bar;
    private List<Baz> bazs;
    private Qux qux;
    private Corge corge;
    private List<Grault> graults;

    public Foo(Bar bar) {
        this.bar = bar;
        this.bazs = new ArrayList<>();
        this.graults = new ArrayList<>();
    }

    public Corge getCorge() {
        return this.corge;
    }

    public void setQux(Qux qux) {
        this.qux = qux;
    }

    public void setCorge(Corge corge) {
        this.corge = corge;
    }

    public void addBaz(Baz baz) {
        if (baz != null && !this.bazs.contains(baz)) {
            this.bazs.add(baz);
        }
    }

    public void removeBaz(Baz baz) {
        this.bazs.remove(baz);
    }

    public void addGrault(Grault grault) {
        if (grault != null && !this.graults.contains(grault)) {
            this.graults.add(grault);
            grault.setFoo(this);
        }
    }

    public void removeGrault(Grault grault) {
        if (this.graults.remove(grault)) {
            grault.setFoo(null);
        }
    }
}