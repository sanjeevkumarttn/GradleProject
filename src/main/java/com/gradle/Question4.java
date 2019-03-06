package com.gradle;

import org.apache.commons.lang3.StringUtils;

import java.util.Arrays;
import java.util.List;

class Question4 {

    private List list = Arrays.asList("hello!", "How", "aRe", "yoU");

    void convertToCapital() {
        System.out.println("Using StringUtils class ...");
        System.out.println("List before swapCase: " + list.toString());
        System.out.println("List after swapCase: " + StringUtils.swapCase(list.toString()));
    }
}
