package creatationalpattern.ch04simplefatory.sample01;

public class TVFactory {
    public static TV productTV(String brand) throws Exception{
        if (brand.equalsIgnoreCase("Haier")) {
            return new HaierTV();
        } else if (brand.equalsIgnoreCase("Hisense")) {
            return new HisenseTV();
        }else {
            throw new UnsupportedOperationException("Sorry can not product this brand TV");
        }
    }
}
