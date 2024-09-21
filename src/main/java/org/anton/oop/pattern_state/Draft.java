package org.anton.oop.pattern_state;

import lombok.AllArgsConstructor;

@AllArgsConstructor
public class Draft implements DocumentState {
    private Document context;

    @Override
    public void proceed() {
        System.out.println("proceed draft document");
        context.setState(new New(this.context));
    }

    @Override
    public void reject() {
        System.out.println("not applicable");
    }
}
