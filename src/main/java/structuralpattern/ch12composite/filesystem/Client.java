package structuralpattern.ch12composite.filesystem;

/**
 * @author coryjia@gmail.com
 * @date 4/9/20 3:04 PM
 */
public class Client {
    public static void main(String[] args) {
        AbstractFile file1, file2, myDocuments, images, texts, file3, file4, videos, file5;

        file1 = new ImageFile("小龙女.jpg");
        file2 = new ImageFile("张无忌.gif");
        file3 = new TextFile("九阴真经.txt");
        file4 = new TextFile("葵花宝典.doc");
        file5 = new VideoFile("笑傲江湖.rmvb");

        myDocuments = new Folder("我的公文包");
        images = new Folder(" 图像资料");
        texts = new Folder("文本资料");
        videos = new Folder("视频文件");

        myDocuments.add(images);
        myDocuments.add(texts);
        myDocuments.add(videos);

        images.add(file1);
        images.add(file2);
        texts.add(file3);
        texts.add(file4);
        videos.add(file5);

        myDocuments.killVirus();
        images.killVirus();

        texts.killVirus();
    }
}
