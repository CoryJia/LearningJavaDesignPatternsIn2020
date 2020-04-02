package creatationalpattern.ch08prototype.prototypemanager;

import lombok.SneakyThrows;

/**
 * @author coryjia@gmail.com
 * @date 4/2/20 10:29 AM
 *
 * SRS = Software Requirements Specification (软件需求说明书）
 */

public class SRS implements OfficialDocument{
    @SneakyThrows
    @Override
    public OfficialDocument clone() {
        return (OfficialDocument) super.clone();
    }

    @Override
    public void display() {
        System.out.println("Software Requirements Specification");
    }
}
