package org.anton.oop.pattern_state;


public class Document implements DocumentState {
    private DocumentState state;

    public Document() {
        state = new Draft(this);
    }

    public void setState(DocumentState state) {
        this.state = state;
    }

    @Override
    public void proceed() {
        state.proceed();
    }

    @Override
    public void reject() {
        state.reject();
    }
}
