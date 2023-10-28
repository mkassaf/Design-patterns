package edu.najah.cap.designpattern.template.exmaple.reader;

public abstract class Reader {
    protected abstract boolean initialize();
    protected abstract  void startReading();
    protected abstract  void stopReading();
    protected abstract  void close();
    public final void read() {
        if (initialize()) {
            startReading();
            stopReading();
            close();
        }
    }
}
