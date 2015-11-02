package org.luxization.jneural;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class AdaptiveLinearElement implements Neuron {

    private final List<BigDecimal> inputWeight;

    public AdaptiveLinearElement(final int numberOfInputs) {
        inputWeight = new ArrayList<>(numberOfInputs);
        Collections.fill(inputWeight, BigDecimal.ONE);
    }

    public BigDecimal calculate(final List<BigDecimal> inputs) {
        if(inputs.size() != inputWeight.size()) {
            throw new IllegalArgumentException("the number of input data incompatible with the number of weights");
        }
        return calculateTheWeightedSum(inputs);

    }

    private BigDecimal calculateTheWeightedSum(final List<BigDecimal> inputs) {
        // TODO refactor
        BigDecimal result = BigDecimal.ZERO;
        for(int i=0; i<=inputs.size()-1; i++) {
            result = result.add(inputWeight.get(i).multiply(inputs.get(i)));
        }

        return result;
    }
}
