import service.FileService;

public class Main {
    public static void main(String[] args) {
        FileService fileService = new FileService();
//        fileService.read();
//        fileService.read2();
//        fileService.write("Some new content!!!! \n");
        fileService.write2("Some new content!!!! \n");
    }
}
