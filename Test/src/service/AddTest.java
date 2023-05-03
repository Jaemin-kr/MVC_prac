package service;

import repo.NumRepo;

import java.util.ArrayList;

public class AddTest {
    //생성자
    private NumRepo numRepo = new NumRepo();
    public void adder(String str){
        String[] strArr = str.split(" ");
        int sum = 0;

        for (String s : strArr) {
            sum += Integer.parseInt(s);
        }
        numRepo.save(sum);

    }

    public int findResult() {
        return numRepo.findResult();
    }

}
