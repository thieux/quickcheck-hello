/*
 * Copyright 2015-2016 the original author or authors.
 *
 * All rights reserved. This program and the accompanying materials are
 * made available under the terms of the Eclipse Public License v1.0 which
 * accompanies this distribution and is available at
 *
 * http://www.eclipse.org/legal/epl-v10.html
 */

package com.example.project;

import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

import static org.quicktheories.QuickTheory.qt;
import static org.quicktheories.generators.SourceDSL.integers;

@Tag("property-based")
class QuickHello {

    @Test
    void addingTwoPositiveIntegersAlwaysGivesAPositiveInteger() {
        qt()
                .forAll(integers().allPositive(), integers().allPositive())
                .check((i, j) -> i + j > 0);
    }

}
