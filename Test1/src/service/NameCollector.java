package service;

import repo.NameRepo;

import java.util.ArrayList;
import java.util.Arrays;

//서비스 구성에 필요한 로직 구현
public class NameCollector {

    private NameRepo nameRepo = new NameRepo();

    public void nameCollect(String str){
        String [] name = str.split(",");

        ArrayList<String> nameList = new ArrayList<>(Arrays.asList(name));

        nameRepo.save(nameList);
    }

    public ArrayList<String> findResult(){
        return nameRepo.findResult();
    }
}
