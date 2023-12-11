package edu.najah.cap.designpattern.interator;

import org.jetbrains.annotations.NotNull;

import java.util.Iterator;
import java.util.Spliterator;
import java.util.function.Consumer;

public class ApplicationCustomSet implements Iterable<Application> {

    private Application[] apps;
    private int index = 0;
    @NotNull
    @Override
    public Iterator<Application> iterator() {
        apps = new Application[5];
        return null;
    }

    @Override
    public void forEach(Consumer<? super Application> action) {
        Iterable.super.forEach(action);
    }

    @Override
    public Spliterator<Application> spliterator() {
        return Iterable.super.spliterator();
    }
}
