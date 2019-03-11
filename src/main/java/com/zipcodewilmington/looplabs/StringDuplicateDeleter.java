package com.zipcodewilmington.looplabs;

import java.util.Arrays;
import java.util.stream.Stream;

/**
 * Created by leon on 1/28/18.
 * @ATTENTION_TO_STUDENTS You are forbidden from modifying the signature of this class.
 */
public final class StringDuplicateDeleter extends DuplicateDeleter<String> {
    public StringDuplicateDeleter(String[] intArray) {
        super(intArray);
    }

    @Override
    public String[] removeDuplicates(int maxNumberOfDuplications) {
        Stream<String> stringStream = Arrays.stream(array).filter(integer -> getCount(integer) < maxNumberOfDuplications);
        return stringStream.toArray(String[]::new);
    }

    @Override
    public String[] removeDuplicatesExactly(int exactNumberOfDuplications) {
        Stream<String> stringStream = Arrays.stream(array).filter(integer -> getCount(integer) != exactNumberOfDuplications);
        return stringStream.toArray(String[]::new);
    }
}
