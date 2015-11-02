package org.luxization.jneural;

import java.math.BigDecimal;
import java.util.List;

public interface Neuron {
    BigDecimal calculate(final List<BigDecimal> inputs);

}
