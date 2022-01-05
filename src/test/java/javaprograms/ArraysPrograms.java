package javaprograms;

import org.testng.annotations.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class ArraysPrograms {


    @Test
    public void removeZeroAndPlaceThemAtEnd() {

        Integer[] array = {0, 1, 3, 0, 7, 9, 0};
        List<Integer> list = new ArrayList<>(Arrays.asList(array));
        int noOfZeros = 0;
        int sudoVar;
        int origSize = list.size();
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i) == 0) {
                list.remove(i);
                noOfZeros++;
            }
        }
        if(noOfZeros>0) {
            for (int i = noOfZeros + 1; i < origSize; i++) {
                list.add(i, 0);
            }
        }
        System.out.println(list);
    }





}
