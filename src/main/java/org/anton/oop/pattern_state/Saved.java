package org.anton.oop.pattern_state;

import lombok.AllArgsConstructor;

@AllArgsConstructor
public class Saved implements DocumentState {
    private Document context;

    @Override
    public void proceed() {
        System.out.println("Document saved");
    }

    @Override
    public void reject() {
        System.out.println("reject saved document");
        context.setState(new New(this.context));
    }
}
