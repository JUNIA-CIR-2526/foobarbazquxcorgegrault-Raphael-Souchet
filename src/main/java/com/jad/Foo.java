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

    public Bar getBar() {
        return bar;
    }

    public List<Baz> getBazs() {
        return bazs;
    }

    public Qux getQux() {
        return qux;
    }

    public Corge getCorge() {
        return corge;
    }

    public List<Grault> getGraults() {
        return graults;
    }

    // Setters
    public void setQux(Qux qux) {
        this.qux = qux;
    }

    public void setCorge(Corge corge) {
        this.corge = corge;
    }

    public void addBaz(Baz baz) {
        if (baz != null && !bazs.contains(baz)) {
            bazs.add(baz);
        }
    }

    public void removeBaz(Baz baz) {
        bazs.remove(baz);
    }

    public void addGrault(Grault grault) {
        if (grault != null && !graults.contains(grault)) {
            graults.add(grault);
            grault.setFoo(this);
        }
    }

    public void removeGrault(Grault grault) {
        if (graults.remove(grault)) {
            grault.setFoo(null);
        }
    }
}