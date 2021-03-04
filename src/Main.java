public class Main {
    public static void main(String[] args) {
        DataJson jsonFile = new DataJson("WorkersData");
        jsonFile.loadJSON("test.json");
        EFFY_CRUD crud = new EFFY_CRUD(jsonFile.getJson());
        //crud.create(new Worker("Михаил","Иванов","MihLog","akwhH23","1","6","офис-менеджер"),jsonFile.getListName());
        //crud.create(new Worker("kjdhfgkjdhkfg","Иванов","MihLog","akwhH23","1","6","офис-менеджер"),jsonFile.getListName());
        System.out.println(crud.read(0, jsonFile.getListName()));
        crud.delete(0, jsonFile.getListName());
        System.out.println(crud.read(0, jsonFile.getListName()));
        //crud.update(0, jsonFile.getListName(), new Worker("Александр","Иванов","MihLog","akwhH23","1","6","офис-менеджер"));
        jsonFile.saveJSON(crud.getJson(),"test.json");

    }
}
