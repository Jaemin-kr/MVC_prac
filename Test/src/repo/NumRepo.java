package repo;

import java.util.ArrayList;

public class NumRepo {
    private int result = 0;

    public void save(int n){
        result = n;
    }

    public int findResult() {
        return result;
    }
}
