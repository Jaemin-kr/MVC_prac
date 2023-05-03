package repo;

import java.util.ArrayList;
//DB에 저장할 내용들을 구성해놓는 공간
//해당 공간에서 테이블을 구성하여 DB와 연결함
public class NameRepo {

    //private ArrayList<String> result = null;
    private ArrayList<String> result;


    public NameRepo() {
        this.result = new ArrayList<>();
    };

    //?
    //이름 저장
    public void save(ArrayList<String> str){
        result = str;
    }

    public ArrayList<String> findResult(){
        return result;
    }
}
