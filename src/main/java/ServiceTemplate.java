import java.util.Map;

public class ServiceTemplate {
    private int id;
    private String name;
    private Map<String, String> parametersList;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void addParameter(String key, String defaultValue){
        parametersList.put(key,defaultValue);
    }

    public void addParameter(String key){
        parametersList.put(key,"");
    }
}
