package creatationalpattern.ch08prototype.prototypemanager;

import java.util.HashMap;
import java.util.Map;

/**
 * @author coryjia@gmail.com
 * @date 4/2/20 10:31 AM
 * <p>
 * Eager Singleton
 */
public class PrototypeManager {
    private Map<String, OfficialDocument> map = new HashMap<>();
    private static PrototypeManager pm = new PrototypeManager();

    private PrototypeManager(){
        map.put("far", new FAR());
        map.put("srs", new SRS());
        map.put("ppr", new PPR());
    }

    public void addOfficialDocument(String key, OfficialDocument doc){
        map.put(key, doc);
    }

    //shallow clone document object
    public OfficialDocument getOfficialDocument(String key){
        return map.get(key).clone();
    }

    public static PrototypeManager getPrototypeManager(){
        return pm;
    }

    public static void main(String[] args) {

        PrototypeManager pm = PrototypeManager.getPrototypeManager();

        OfficialDocument doc1, doc2, doc3, doc4;

        doc1 = pm.getOfficialDocument("far");
        doc1.display();
        doc2 = pm.getOfficialDocument("far");
        doc2.display();
        System.out.println(doc1 == doc2);

        doc3 = pm.getOfficialDocument("srs");
        doc3.display();
        doc4 = pm.getOfficialDocument("srs");
        doc4.display();
        System.out.println(doc3 == doc4);
    }
}
