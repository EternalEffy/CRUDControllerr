import org.json.JSONObject;

public class EFFY_CRUD {

    private DataJson myData = new DataJson();

    public void create(){
        myData.loadJSON("test.json");
        myData.addWorker(new Worker("Михаил","Иванов","MihLog","kjsdhfkj2","1","0,2","офис-менеджер"));
        myData.saveJSON("test.json");
    }

    public void read(){

    }

    public void update(){

    }

    public void delete(){

    }
}
