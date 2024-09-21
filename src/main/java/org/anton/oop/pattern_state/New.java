package org.anton.oop.pattern_state;

import lombok.AllArgsConstructor;

@AllArgsConstructor
public class New implements DocumentState {
    private Document context;

    @Override
    public void proceed() {
        System.out.println("proceed new document");
        context.setState(new Saved(this.context));
    }

    @Override
    public void reject() {
        System.out.println("reject new document");
        context.setState(new Draft(this.context));
    }
}
