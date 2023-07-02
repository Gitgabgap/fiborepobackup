package com.example.fibodemo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

@Controller
class FibonacciController {
    @GetMapping("/")
    public String index() {
        return "index";
    }

    @GetMapping("/fibonacci")
    public String getFibonacci(@RequestParam("elements") int elements, Model model) {
        int[] fibonacci = calculateFibonacci(elements);
        int[] sorted = sortSequence(fibonacci);
        model.addAttribute("fibonacci", fibonacci);
        model.addAttribute("sorted", sorted);
        return "result";
    }

    private int[] calculateFibonacci(int elements) {
        int[] sequence = new int[elements];
        sequence[0] = 0;
        if (elements > 1) {
            sequence[1] = 1;
            for (int i = 2; i < elements; i++) {
                sequence[i] = sequence[i - 1] + sequence[i - 2];
            }
        }
        return sequence;
    }

    private int[] sortSequence(int[] sequence) {
        List<Integer> sortedList = new ArrayList<>();
        for (int number : sequence) {
            sortedList.add(number);
        }
        sortedList.sort(Comparator.comparingInt(a -> {
            if (a % 2 == 0) {
                return -a; // Even numbers first
            } else {
                return a; // Odd numbers next
            }
        }));
        int[] sorted = new int[sequence.length];
        for (int i = 0; i < sequence.length; i++) {
            sorted[i] = sortedList.get(i);
        }
        return sorted;
    }
}
