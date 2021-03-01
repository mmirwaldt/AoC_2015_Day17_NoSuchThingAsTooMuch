package net.mirwaldt;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class PartTwoContainerCombinerTest {
    @Test
    void test_getLastMinContainerNumber() {
        MinContainerNumberCombinationsContainerCombiner combiner =
                new MinContainerNumberCombinationsContainerCombiner();
        combiner.countCombinations(Arrays.asList(20, 15, 10, 5, 5), 25);
        assertEquals(2, combiner.getLastMinContainerNumber());
    }

    @Test
    void test_countCombinations() {
        MinContainerNumberCombinationsContainerCombiner combiner =
                new MinContainerNumberCombinationsContainerCombiner();
        assertEquals(3, combiner.countCombinations(Arrays.asList(20, 15, 10, 5, 5), 25));
    }

    @Test
    void test_findCombinations() {
        MinContainerNumberCombinationsContainerCombiner combiner =
                new MinContainerNumberCombinationsContainerCombiner();
        List<List<Integer>> expectedCombinations = Arrays.asList(Arrays.asList(5, 20), Arrays.asList(5, 20), Arrays.asList(10, 15));
        assertEquals(expectedCombinations, combiner.findCombinations(Arrays.asList(20, 15, 10, 5, 5), 25));
    }
}
