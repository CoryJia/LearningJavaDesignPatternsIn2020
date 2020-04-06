package creatationalpattern.ch07biulder;

import lombok.Getter;
import lombok.Setter;

/**
 * @author coryjia@gmail.com
 * @date 4/5/20 8:38 PM
 */

@Getter
@Setter
public class Actor {
    private String type;
    private String sex;
    private String face;
    private String custume;
    private String hairstyle;

    @Override
    public String toString() {
        return "Actor{" +
                "type='" + type + '\'' +
                ", sex='" + sex + '\'' +
                ", face='" + face + '\'' +
                ", custume='" + custume + '\'' +
                ", hairstyle='" + hairstyle + '\'' +
                '}';
    }
}
