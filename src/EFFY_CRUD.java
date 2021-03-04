import org.json.JSONObject;

public class EFFY_CRUD {
    private JSONObject json;

    public EFFY_CRUD(JSONObject json){
        this.json = json;
    }

    public JSONObject getJson() {
        return json;
    }

    public void create(Worker worker, String listName){
        json.getJSONArray(listName).put(json.getJSONArray(listName).length(),new JSONObject(worker.toString()));
    }

    public String read(final int index,String listName){
        if(index>json.getJSONArray(listName).length()-1) return null;
        return json.getJSONArray(listName).getJSONObject(index).toString();
    }

    public void update(final int index, String listName, Worker worker){
        json.getJSONArray(listName).put(index,new JSONObject(worker.toString()));
    }

    public void delete(final int index,String listName){
        if(index>json.getJSONArray(listName).length()) return;
        json.getJSONArray(listName).remove(index);
    }
}
