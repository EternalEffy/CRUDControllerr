import org.json.JSONObject;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

public class DataJson {

        private JSONObject json;
        private String fileName, listName;

        public DataJson() {
            listName = "WorkersData";
        }

        public int loadJSON(String fileName) {
            this.fileName = fileName;
            try {
                json = new JSONObject(new String(new FileInputStream(fileName).readAllBytes()));
            } catch (FileNotFoundException e) {
                try {
                    Files.writeString((Files.createFile(Path.of(fileName))),"{\"" + listName + "\":[]}");
                } catch (IOException ioException) {
                    ioException.printStackTrace();
                }
                json = new JSONObject("{\"" + listName + "\":[]}");
                System.out.println(json.toString());
                return -1;
            } catch (IOException e) {
                e.printStackTrace();
                return -2;
            }
            return 0;
        }

        public void addWorker(Worker worker){
            json.getJSONArray(listName).put(getListSize(),new JSONObject(worker.toString()));
        }

        public int saveJSON(String fileName) {
            try {
                FileOutputStream fout = new FileOutputStream(fileName);
                fout.write(json.toString().getBytes());
            } catch (FileNotFoundException e) {
                e.printStackTrace();
                return -1;
            } catch (IOException e) {
                e.printStackTrace();
                return -2;
            }
            return 0;
        }
        public int getListSize(){
        return json.getJSONArray(listName).length();
    }
}
