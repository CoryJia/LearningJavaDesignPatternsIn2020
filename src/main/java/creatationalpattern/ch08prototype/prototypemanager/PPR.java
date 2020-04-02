package creatationalpattern.ch08prototype.prototypemanager;

import lombok.SneakyThrows;

/**
 * @author coryjia@gmail.com
 * @date 4/2/20 10:41 AM
 *
 * PPR = Project Progress Report (项目进展报告）
 */
public class PPR implements OfficialDocument{
    @SneakyThrows
    @Override
    public OfficialDocument clone() {
        return  (OfficialDocument)super.clone();
    }

    @Override
    public void display() {
        System.out.println("Project Progress Report");
    }
}
