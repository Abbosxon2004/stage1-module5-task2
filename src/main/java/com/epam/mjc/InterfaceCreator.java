package com.epam.mjc;

import java.util.ArrayList;
import java.util.List;

public class InterfaceCreator {

    public Operation<Integer> divideBy(Integer divider) {
        return (list)->{
            List<Integer> ans=new ArrayList<>();
            for (Integer num : list) {
                ans.add(num/divider);
            }
            return ans;
        };
    }
}
