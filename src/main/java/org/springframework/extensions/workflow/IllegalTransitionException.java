package org.springframework.extensions.workflow;

/**
 * @author janm
 */
public class IllegalTransitionException extends FlowRuntimeException {
    private static final long serialVersionUID = -1204913922610161246L;

    public IllegalTransitionException(String msg) {
        super(msg);
    }
}
