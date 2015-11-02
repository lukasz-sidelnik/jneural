package org.luxization.jneural;

@FunctionalInterface
public interface ActivationFunction {

    Number calculate(Number arg);
}
