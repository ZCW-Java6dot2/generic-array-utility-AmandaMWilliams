package com.zipcodewilmington.arrayutility;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/**
 * Created by leon on 3/6/18.
 */
public class ArrayUtility<T> {
    public T[] inputArray;

    public ArrayUtility(T[] inputArray) {
        this.inputArray = inputArray;
    }

    public Integer countDuplicatesInMerge(T[] arrayToMerge, T valueToEvaluate) {
        List<T> arrayList = new ArrayList<>();
        arrayList.addAll(Arrays.asList(arrayToMerge));
        arrayList.addAll(Arrays.asList(inputArray));
        return Collections.frequency(arrayList, valueToEvaluate);
    }

    public List<T> mergeArrays(T[] arrayToMerge){
        List<T> mergedArrayList = new ArrayList<>();
        mergedArrayList.addAll(Arrays.asList(arrayToMerge));
        mergedArrayList.addAll(Arrays.asList(inputArray));
        return mergedArrayList;
    }

    public T getMostCommonFromMerge(T[] arrayToMerge) {
        Integer highestFrequency = Integer.MIN_VALUE;
        List<T> arrayList = new ArrayList<>();
        T mostCommonValue = null;
        arrayList.addAll(Arrays.asList(arrayToMerge));
        arrayList.addAll(Arrays.asList(inputArray));

        for (T t : arrayList) {
            Integer frequencyOfCurrentElement = Collections.frequency(arrayList, t);
            if (frequencyOfCurrentElement > highestFrequency) {
                highestFrequency = frequencyOfCurrentElement;
                mostCommonValue = t;
            }
        }
        return mostCommonValue;
    }

    public Integer getNumberOfOccurrences(T valueToEvaluate){
        List<T> arrayList = new ArrayList<>();
        arrayList.addAll(Arrays.asList(inputArray));
        return Collections.frequency(arrayList, valueToEvaluate);
    }
}
