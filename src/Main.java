public class Main {
    public static void main(String[] args) {

        DownloadThread d1 = new DownloadThread("https://bitcode.in/java/iwillnotdoasssignment.studnet");
        d1.setName("D1 Thread");
        d1.setPriority(10);

        UploadThread u1 = new UploadThread("ineedajobwithnoworkbutexcellentsal.pdf");

        d1.start();
        u1.start();

        for(int i = 0; i <= 100; i++) {
            try {
                Thread.sleep(100);
            }
            catch (InterruptedException ie) {}
            System.out.println("main " + i);
        }

    }
}
