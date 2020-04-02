package creatationalpattern.ch08prototype.prototypemanager;

import lombok.SneakyThrows;

/**
 * @author coryjia@gmail.com
 * @date 4/2/20 10:27 AM
 *
 * FAR = Feasibility Analysis Report (可行性报告）
 */

public class FAR implements OfficialDocument{
    @SneakyThrows
    @Override
    public OfficialDocument clone() {
        return  (OfficialDocument)super.clone();
    }

    @Override
    public void display() {
        System.out.println("Feasibility Analysis Report");
    }
}
