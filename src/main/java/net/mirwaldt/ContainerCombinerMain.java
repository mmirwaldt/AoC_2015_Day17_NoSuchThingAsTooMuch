package net.mirwaldt;

import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.List;
import java.util.stream.Collectors;

public class ContainerCombinerMain {
    public static void main(String[] args) throws IOException {
        final List<String> lines = Files.readAllLines(Path.of("input.txt"), StandardCharsets.US_ASCII);
        final List<Integer> capacities = lines.stream().map(Integer::parseInt).collect(Collectors.toList());
        final ContainerCombiner containerCombiner = new DefaultContainerCombiner();
        System.out.println(containerCombiner.combineContainers(capacities, 150)); // result: 1304
    }
}
