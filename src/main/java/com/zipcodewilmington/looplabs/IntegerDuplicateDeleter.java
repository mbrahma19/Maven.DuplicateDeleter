package com.zipcodewilmington.looplabs;

import java.util.Arrays;
import java.util.stream.Stream;

/**
 * Created by leon on 1/29/18.
 * @ATTENTION_TO_STUDENTS You are forbidden from modifying the signature of this class.
 */
public final class IntegerDuplicateDeleter extends DuplicateDeleter<Integer> {


    public IntegerDuplicateDeleter(Integer[] intArray) {
        super(intArray);
    }

    @Override
    public Integer[] removeDuplicates(int maxNumberOfDuplications) {
        Stream<Integer> integerStream = Arrays.stream(array).filter(integer -> getCount(integer) < maxNumberOfDuplications);
        return integerStream.toArray(Integer[]::new);
    }

    @Override
    public Integer[] removeDuplicatesExactly(int exactNumberOfDuplications) {
        Stream<Integer> integerStream = Arrays.stream(array).filter(integer -> getCount(integer) != exactNumberOfDuplications);
        return integerStream.toArray(Integer[]::new);
    }
}
