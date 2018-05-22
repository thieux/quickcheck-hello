package com.example.project;

import org.junit.jupiter.api.Test;
import org.quicktheories.core.Gen;

import static org.quicktheories.QuickTheory.qt;
import static org.quicktheories.generators.SourceDSL.integers;
import static org.quicktheories.generators.SourceDSL.strings;

class PersonTest {

    @Test
    void aTwoLettersCodeRequireALotsOfExamples() {
        qt().withExamples(50_000)
                .forAll(persons())
                .check(person -> !person.allowed());
    }

    private Gen<Person> persons() {
        return minorAges().zip(typeCodes(), Person::new);
    }

    private Gen<String> typeCodes() {
        return strings().basicLatinAlphabet().ofLength(2);
    }

    private Gen<Integer> minorAges() {
        return integers().from(0).upTo(18);
    }

}